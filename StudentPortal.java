import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentPortal {

    Scanner input = new Scanner(System.in);

    public void admin() throws IOException
    {
        CsStudents csstudentsobj = new CsStudents();
        csstudentsobj.csStudents();
        SeStudents sestudentsobj = new SeStudents();
        sestudentsobj.seStudents();

        AcademicCalendar ac = new AcademicCalendar();
        AcademicDeadline ad = new AcademicDeadline();
        CsDepartment csdepartmentobj = new CsDepartment(csstudentsobj,ad,ac);
        SeDepartment sedepartmentobj = new SeDepartment(sestudentsobj,ad,ac);

        Admin adminobj = new Admin(csdepartmentobj,sedepartmentobj);

        int departchoice;

        do
        {
            System.out.println("---> Press 1 to Get Into CS Department");
            System.out.println("---> Press 2 to Get Into SE Department");
            System.out.println("---> Press 0 to Get Back");

            departchoice = input.nextInt();

            if (departchoice == 1)
            {
                int cschoice;
                do
                {
                    System.out.println("---> Press 1 to View CS Student Details");
                    System.out.println("---> Press 2 to View CS Courses");
                    System.out.println("---> Press 3 to Add CS Courses");
                    System.out.println("---> Press 4 to Add CS Student");
                    System.out.println("---> Press 5 to View Quantity of CS Students");
                    System.out.println("---> Press 0 to Exit");

                    cschoice = input.nextInt();

                    if(cschoice == 1)
                    {
                        int sdet;
                        do
                        {
                            adminobj.viewCsStudents();
                            System.out.println("\n");

                            System.out.println("---> To View Details Enter the S.No of Student");
                            System.out.println("---> Press 56 to Get Back");
                            sdet = input.nextInt();

                            if (sdet != 56)
                            {
                                adminobj.viewCsStudentDetails(sdet);
                                System.out.println("\n");
                            }
                        }
                        while (sdet != 56);
                    }

                    else if(cschoice == 2)
                    {
                        adminobj.viewCsCourses();
                    }

                    else if(cschoice == 3)
                    {
                        adminobj.addCsCourses();
                    }

                    else if(cschoice == 4)
                    {
                        adminobj.addCsStudent();
                    }

                    else if(cschoice == 5)
                    {
                        adminobj.numberOfCsStudents();
                    }

                } while (cschoice != 0);
            }

            else if (departchoice == 2)
            {
                int sechoice;
                do
                {
                    System.out.println("---> Press 1 to View SE Student Details");
                    System.out.println("---> Press 2 to View SE Courses");
                    System.out.println("---> Press 3 to Add SE Courses");
                    System.out.println("---> Press 4 to Add SE Student");
                    System.out.println("---> Press 5 to View Quantity of SE Students");
                    System.out.println("---> Press 0 to Exit");

                    sechoice = input.nextInt();

                    if(sechoice == 1) //calling the method of student details from CS student class
                    {
                        int sdet;
                        do
                        {
                            adminobj.viewSeStudents();
                            System.out.println("\n");

                            System.out.println("---> To View Details Enter the S.No of Student");
                            System.out.println("---> Press 56 to Get Back");
                            sdet = input.nextInt();

                            if (sdet != 56)
                            {
                                adminobj.viewCsStudentDetails(sdet);
                                System.out.println("\n");
                            }
                        }
                        while (sdet != 56);
                    }

                    else if(sechoice == 2)
                    {
                        adminobj.viewSeCourses();
                    }

                    else if(sechoice == 3)
                    {
                        adminobj.addSeCourses();
                    }

                    else if(sechoice == 4)
                    {
                        adminobj.addSeStudent();
                    }

                    else if(sechoice == 5)
                    {
                        adminobj.numberOfSeStudents();
                    }

                } while (sechoice != 0);
            }
        }
        while (departchoice != 0);
    }

    public void student() throws IOException
    {
        AcademicCalendar ac = new AcademicCalendar();
        AcademicDeadline ad = new AcademicDeadline();
        CsStudents cs = new CsStudents();
        SeStudents se = new SeStudents();

        CsDepartment csd = new CsDepartment(cs,ad,ac);
        SeDepartment sed = new SeDepartment(se,ad,ac);

        CsStudents csStudentsobj = new CsStudents(csd,ad,ac);
        SeStudents seStudentsobj = new SeStudents(sed,ad,ac);

        csStudentsobj.csStudents();
        seStudentsobj.seStudents();

        int studentChoice;
        int choice;

        do
        {
            System.out.println("---> Press 1 for CS Student");
            System.out.println("---> Press 2 for SE Student");
            System.out.println("---> Press 0 to Get Back");
            studentChoice = input.nextInt();

            if (studentChoice == 1)
            {
                Scanner input1 = new Scanner(System.in);
                Scanner input2 = new Scanner(System.in);
                String id,pass;
                int index;

                csStudentsobj.loginmethod();
                System.out.println("CS Student Login Panel");
                System.out.println("Enter id");
                id = input1.nextLine();

                System.out.println("Enter pass");
                pass = input1.nextLine();

                for(CsStudents cs1 : csStudentsobj.login)
                {
                    if(cs1.getRegistrationNumber().equals(id) && cs1.getPassword().equals(pass))
                    {
                        index = cs1.getIndex();
                        System.out.println("Successfully Logged In");
                        do
                        {
                            System.out.println("---> Press 1 For General Information");
                            System.out.println("---> Press 2 Academic Calendar");
                            System.out.println("---> Press 3 Academic Deadlines");
                            System.out.println("---> Press 4 to View CS Program Courses");
                            System.out.println("---> Press 0 to Exit");

                            choice = input.nextInt();

                            if(choice == 1)
                            {
                                csStudentsobj.studentsDetails(index);
                            }

                            else if(choice == 2)
                            {
                                csStudentsobj.viewAc();
                            }

                            else if(choice == 3)
                            {
                                csStudentsobj.viewAd();
                            }

                            else if(choice == 4)
                            {
                                csStudentsobj.viewCsProgramCourses();
                            }

                            else if(choice == 0)
                            {
                                System.out.println("Logged Out");
                            }
                            else
                                {
                                    System.out.println("Invalid input");
                                }

                        } while (choice != 0);

                    }

                }


            }

            else if (studentChoice == 2)
            {
                Scanner input1 = new Scanner(System.in);
                Scanner input2 = new Scanner(System.in);
                String id,pass;
                int index;

                seStudentsobj.loginmethod();
                System.out.println("SE Student Login Panel");

                System.out.println("Enter id");
                id = input1.nextLine();

                System.out.println("Enter pass");
                pass = input1.nextLine();

                for(SeStudents se1 : seStudentsobj.login)
                {
                    if(se1.getRegistrationNumber().equals(id) && se1.getPassword().equals(pass))
                    {
                        index = se1.getIndex();
                        System.out.println("Successfully Logged In");

                        do
                        {
                            System.out.println("---> Press 1 For General Information");
                            System.out.println("---> Press 2 Academic Calendar");
                            System.out.println("---> Press 3 Academic Deadlines");
                            System.out.println("---> Press 4 to View CS Program Courses");
                            System.out.println("---> Press 0 to Exit");

                            choice = input.nextInt();

                            if(choice == 1)
                            {
                                seStudentsobj.studentsDetails(index);
                            }

                            else if(choice == 2)
                            {
                                seStudentsobj.viewAc();
                            }

                            else if(choice == 3)
                            {
                                seStudentsobj.viewAd();
                            }

                            else if(choice == 4)
                            {
                                seStudentsobj.viewSeProgramCourses();
                            }
                            else if(choice == 0)
                            {
                                System.out.println("Logged Out");
                            }
                            else
                            {
                                System.out.println("Invalid input");
                            }

                        } while (choice != 0);

                    }

                }
            }
        }
        while (studentChoice != 0);

    }

    public static void main(String[] args) throws IOException {

        StudentPortal studentPortalobj = new StudentPortal();

        Scanner input = new Scanner(System.in);
        Scanner inputs1 = new Scanner(System.in);
        Scanner inputs2 = new Scanner(System.in);

        int userInput;
        try
        {
            do
            {
                System.out.println("/////////////////////////--- Student Portal ---/////////////////////////");
                System.out.println("---> Press 1 for Student Login \n---> Press 2 for Admin Login \n---> Press 0 for Exit");

                userInput = input.nextInt();

                if (userInput == 1)
                {
                    System.out.println("Welcome to Student Portal");
                    studentPortalobj.student();

                }

                else if(userInput == 2) {
                    Admin admin = new Admin();
                    String id, pass;

                    System.out.println("Enter Id");
                    id = inputs1.nextLine();

                    System.out.println("Enter Password");
                    pass = inputs2.nextLine();
                    boolean a = admin.adminlogin(id, pass);
                    if (a == true) {
                        studentPortalobj.admin();
                    } else {
                        System.out.println("Invalid Input");

                    }
                }

                else
                {

                    userInput = 0;
                }

            }
            while (userInput != 0);

        }

        catch (InputMismatchException i)
        {
            System.out.println("Invalid Input");
        }

        catch (IndexOutOfBoundsException i)
        {
            System.out.println("You have gone beyound the Students Exist");
        }
        catch (IOException i)
        {
            System.out.println("An Unknown Error Occured 'IO Exceptions'");
        }
        catch (NullPointerException i)
        {
            System.out.println("An Unknown Error Occured 'Null Pointer Exceptions'");
        }

    }

}