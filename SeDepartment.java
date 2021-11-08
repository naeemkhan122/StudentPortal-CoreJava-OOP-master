import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;

public class SeDepartment extends Department {

    private final SeStudents se_students;
    private AcademicDeadline ad;
    private AcademicCalendar ac;

    public SeDepartment(SeStudents se_students, AcademicDeadline ad, AcademicCalendar ac) {
        this.se_students = se_students;
        this.ad = ad;
        this.ac = ac;
    }

    public void studentDetails(int index)
    {
        se_students.studentsDetails(index);
    }

    public void studentBasicDetails()
    {
        se_students.studentBasicDetails();
    }

    public void addSeStudent()
    {
        se_students.addSeStudent();
    }

    public void numberOfSeStudents()
    {
        se_students.numberOfSeStudents();
    }

    public void viewSeProgramCourses() throws IOException
    {
        FileReader file = new FileReader("C:\\file\\SECourses.txt");
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

    public void addSeCourses() throws IOException {
        FileWriter writer = new FileWriter("C:\\File\\SECourses.txt", true);
        BufferedWriter buffer = new BufferedWriter(writer);
        Scanner input = new Scanner(System.in);

        try
        {
            buffer.newLine();
            System.out.println("Which Courses You Want to Add");
            buffer.write(input.nextLine());

            System.out.println("Successfully Added..!");
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
