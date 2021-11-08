import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;

public class CsDepartment extends Department {

    private final CsStudents cs_students;
    private AcademicDeadline ad;
    private AcademicCalendar ac;

    public CsDepartment(CsStudents cs_students, AcademicDeadline ad, AcademicCalendar ac) {
        this.cs_students = cs_students;
        this.ad = ad;
        this.ac = ac;
    }

    public void studentBasicDetails()
    {
        cs_students.studentBasicDetails();
    }

    public void studentDetails(int index)
    {
        cs_students.studentsDetails(index);
    }

    public void addCsStudent()
    {
        cs_students.addCsStudent();
    }

    public void numberOfCsStudents()
    {
        cs_students.numberOfCsStudents();
    }

    public void viewCsProgramCourses() throws IOException
    {
        FileReader file = new FileReader("C:\\file\\CSCourses.txt");
        BufferedReader fileInput = new BufferedReader(file);

        try
        {
            System.out.println("Semeter# \t\t\t Courses  \t\t\t\t\t\t Credit Hours \t Course Type \t\t Prerequisite");

            String line = fileInput.readLine();
            while(line != null){
                System.out.println(line);
                line = fileInput.readLine();
            }
        }

        catch (IOException e)
        {
            System.out.println("An Unexpected Error Occured!");
        }

        finally
        {
            fileInput.close();
        }

    }

    public void addCsCourses() throws IOException {
         FileWriter writer = new FileWriter("C:\\File\\CSCourses.txt", true);
         BufferedWriter buffer = new BufferedWriter(writer);
         Scanner input = new Scanner(System.in);

        try
        {
            buffer.newLine();
            System.out.println("Which Courses You Want to Add");
            buffer.write(input.nextLine());

            System.out.println("Successfully Added");
        }

        catch (IOException i)
        {
            System.out.println("An Unknown Error Occured");
        }
        finally {
            buffer.close();

        }

    }

    public void viewAd() throws IOException
    {
        ad.viewAd();
    }

    public void viewAc() throws IOException
    {
        ac.viewAc();
    }

    public void addAd() throws IOException
    {
        ad.addAd();
    }

    public void addAc() throws IOException
    {
        ac.addAc();
    }

}
