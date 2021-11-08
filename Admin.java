import java.io.IOException;

public class Admin {

    String id;
    String password;

    CsDepartment csd;
    SeDepartment sed;

    public Admin(CsDepartment csd, SeDepartment sed) {
        this.csd = csd;
        this.sed = sed;
    }

    public Admin()
    {

    }

    // Add CS Courses
    public void addCsCourses() throws IOException
    {
        csd.addCsCourses();
    }

    // View CS Courses
    public void viewCsCourses() throws IOException
    {
        csd.viewCsProgramCourses();
    }

    // Add CS Student
    public void addCsStudent()
    {
        csd.addCsStudent();
    }

    // View CS Students
    public void viewCsStudents()
    {
        csd.studentBasicDetails();
    }

    // View CS Student Details
    public void viewCsStudentDetails(int index)
    {
        csd.studentDetails(index);
    }

    // View Number of CS Students
    public void numberOfCsStudents()
    {
        csd.numberOfCsStudents();
    }

    // Add SE Courses
    public void addSeCourses() throws IOException
    {
        sed.addSeCourses();
    }

    // Add SE Student
    public void addSeStudent()
    {
        sed.addSeStudent();
    }

    // View SE Courses
    public void viewSeCourses() throws IOException
    {
        sed.viewSeProgramCourses();
    }

    //View SE Student Details
    public void viewSeStudents()
    {
        sed.studentBasicDetails();
    }

    // View Number of SE Students
    public void numberOfSeStudents()
    {
        sed.numberOfSeStudents();
    }

    public void viewSeStudentDetails(int index)
    {
        sed.studentDetails(index);
    }

    //admin login
    public boolean adminlogin(String id, String pass)
    {
        if(id.equals("admin") && pass.equals("1234"))
        {
            return true;
        }

        else
        {
            return false;
        }
    }



}
