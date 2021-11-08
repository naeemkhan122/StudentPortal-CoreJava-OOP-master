import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CsStudents extends Student {

    private String registrationNumber;
    private String program;
    private String password;
    private CsDepartment cs_department;
    private int index;
    private AcademicDeadline ad;
    private AcademicCalendar ac;

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getProgram() {
        return program;
    }

    public String getPassword() {
        return password;
    }

    public int getIndex() {
        return index;
    }

    public CsStudents()
    {

    }

    public CsStudents(CsDepartment cs_department, AcademicDeadline ad, AcademicCalendar ac) {
        this.cs_department = cs_department;
        this.ad = ad;
        this.ac = ac;
    }

    public CsStudents(String studentName, String fatherName, String studentDob, String nationality, String gender, String permanentAddress, String phoneNumber, String email, String registrationNumber, String program)
    {
        super(studentName, fatherName, studentDob, nationality, gender, permanentAddress, phoneNumber, email);
        this.registrationNumber = registrationNumber;
        this.program = program;
    }

    public CsStudents(String registrationNumber, String password, int index)
    {
        this.registrationNumber = registrationNumber;
        this.password = password;
        this.index = index;
    }

    //--> Arraylist of CS Students
    ArrayList<CsStudents> cs_students = new ArrayList<>();


    public void csStudents()
    {
        CsStudents cs1 = new CsStudents("Abdul Muneeb","Abdul Razzak","3,June,1999","Pakistani","Male","D-2-D","0314-2500302","abdulmuneeb12@gmail.com","SP18-BSCS-0056","BSCS");
        CsStudents cs2 = new CsStudents("Ayesha","Ahmed","16,Oct,1998","Pakistani","Female","Nazimabad","0314-2500302","ayehsaahmed@gmail.com","SP18-BSCS-0017","BCSE");
        cs_students.add(cs1);
        cs_students.add(cs2);
    }

    Scanner input = new Scanner(System.in);

    public void addCsStudent()
    {
        System.out.println("Enter Student Name");
        String name = input.nextLine();

        System.out.println("Enter Father's Name");
        String fName = input.nextLine();

        System.out.println("Enter Date of Birth");
        String sDob = input.nextLine();

        System.out.println("Enter Nationality");
        String nationality = input.nextLine();

        System.out.println("Enter Gender");
        String gender = input.nextLine();

        System.out.println("Enter Address");
        String address = input.nextLine();

        System.out.println("Enter Phone Number");
        String phoneNumber = input.nextLine();

        System.out.println("Enter Email");
        String email = input.nextLine();

        System.out.println("Enter Registration Number");
        String registrationNumber = input.nextLine();

        cs_students.add(new CsStudents(name,fName,sDob,nationality,gender,address,phoneNumber,email,registrationNumber,"BSCS"));
    }

    public void studentsDetails(int index)
    {
            System.out.println("Registration Number : " + cs_students.get(index).getRegistrationNumber());
            System.out.println("Program : " + cs_students.get(index).getProgram());
            System.out.println("Student Name : " + cs_students.get(index).getStudentName());
            System.out.println("Date of Birth : " + cs_students.get(index).getStudentDob());
            System.out.println("Nationality : " + cs_students.get(index).getNationality());
            System.out.println("Gender : " + cs_students.get(index).getGender());
            System.out.println("Address : " + cs_students.get(index).getPermanentAddress());
            System.out.println("Contact Number : " + cs_students.get(index).getPhoneNumber());
            System.out.println("Email : " + cs_students.get(index).getEmail());
    }

    public void studentBasicDetails()
    {
        System.out.println("CS Students:");
        int i = 0;
        for(CsStudents cs : cs_students)
        {
            System.out.println(i+". "+cs.getRegistrationNumber()+" "+ cs.getStudentName());
            i = i + 1;
        }
    }

    public void numberOfCsStudents()
    {
        System.out.println("Number of CS Students : "+cs_students.size());
    }

    public void viewCsProgramCourses() throws IOException
    {
        cs_department.viewCsProgramCourses();
    }

    public void viewAd() throws IOException
    {
        ad.viewAd();
    }

    public void viewAc() throws IOException
    {
        ac.viewAc();
    }

    ArrayList<CsStudents> login = new ArrayList<>();
    public void loginmethod()
    {
        login.add( new CsStudents("SP18-BSCS-0056","1234",0));
        login.add( new CsStudents("SP18-BSCS-0017","1234",1));
    }


}
