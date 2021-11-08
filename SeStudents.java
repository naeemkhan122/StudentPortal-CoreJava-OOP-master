import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SeStudents extends Student {

    private String registrationNumber;
    private String program;
    private String password;
    private int index;
    private SeDepartment se_department;
    private AcademicDeadline ad;
    private AcademicCalendar ac;

    public String getPassword() {
        return password;
    }

    public int getIndex() {
        return index;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getProgram() {
        return program;
    }

    public SeStudents(String registrationNumber, String password, int index) {
        this.registrationNumber = registrationNumber;
        this.password = password;
        this.index = index;
    }

    public SeStudents()
    {

    }

    public SeStudents(SeDepartment se_department, AcademicDeadline ad, AcademicCalendar ac) {
        this.se_department = se_department;
        this.ad = ad;
        this.ac = ac;
    }

    //--> Adding students to SE Program
    ArrayList<SeStudents> se_students = new ArrayList<>();

    public SeStudents(String registrationNumber, String program, String studentName, String fatherName, String studentDob, String nationality, String gender, String permanentAddress, String phoneNumber, String email) {
        super(studentName, fatherName, studentDob, nationality, gender, permanentAddress, phoneNumber, email);
        this.registrationNumber = registrationNumber;
        this.program = program;
    }

    public void seStudents()
    {
        SeStudents s1 = new SeStudents("SP18-BSSE-0013","BSSE","Preh","Aijaz Sheikh","1,Aug,2000","Pakistani","Female","Steel Town","03325156487d","preh@gmail.com");
        SeStudents s2 = new SeStudents("SP18-BSSE-0071","BSSE","Naeem","Nadeem","12,Jan,2000","Pakistani","Male","Numaish","0332134567d","naeem@gmail.com");

        se_students.add(s1);
        se_students.add(s2);
    }

    public void studentsDetails(int index)
    {
        System.out.println("Registration Number : " + se_students.get(index).getRegistrationNumber());
        System.out.println("Program : " + se_students.get(index).getProgram());
        System.out.println("Student Name : " + se_students.get(index).getStudentName());
        System.out.println("Date of Birth : " + se_students.get(index).getStudentDob());
        System.out.println("Nationality : " + se_students.get(index).getNationality());
        System.out.println("Gender : " + se_students.get(index).getGender());
        System.out.println("Address : " + se_students.get(index).getPermanentAddress());
        System.out.println("Contact Number : " + se_students.get(index).getPhoneNumber());
        System.out.println("Email : " + se_students.get(index).getEmail());
    }

    Scanner input = new Scanner(System.in);

    public void addSeStudent()
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

        se_students.add(new SeStudents(name,fName,sDob,nationality,gender,address,phoneNumber,email,registrationNumber,"BSSE"));
    }

    public void numberOfSeStudents()
    {
        System.out.println("Number of SE Students : "+se_students.size());
    }

    public void studentBasicDetails()
    {
        System.out.println("SE Students:");
        int i = 0;
        for(SeStudents se : se_students)
        {
            System.out.println(i+". "+se.getRegistrationNumber()+" "+ se.getStudentName());
            i = i + 1;
        }

    }

    ArrayList<SeStudents> login = new ArrayList<>();
    public void loginmethod()
    {
        login.add( new SeStudents("SP18-BSSE-0013","1234",0));
        login.add( new SeStudents("SP18-BSSE-0071","1234",1));
    }

    public void viewAd() throws IOException
    {
        ad.viewAd();
    }

    public void viewAc() throws IOException
    {
        ac.viewAc();
    }

    public void viewSeProgramCourses() throws IOException
    {
        se_department.viewSeProgramCourses();
    }

}
