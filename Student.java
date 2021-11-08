import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Student {

    private String studentName;
    private String fatherName;
    private String studentDob;
    private String nationality;
    private String gender;
    private String permanentAddress;
    private String phoneNumber;
    private String email;

    public Student()
    {

    }

    public String getStudentName()
    {
        return studentName;
    }

    public String getFatherName()
    {
        return fatherName;
    }

    public String getStudentDob()
    {
        return studentDob;
    }

    public String getNationality()
    {
        return nationality;
    }

    public String getGender()
    {
        return gender;
    }

    public String getPermanentAddress()
    {
        return permanentAddress;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public String getEmail()
    {
        return email;
    }


    public Student(String studentName, String fatherName, String studentDob, String nationality, String gender, String permanentAddress, String phoneNumber, String email)
    {
        this.studentName = studentName;
        this.fatherName = fatherName;
        this.studentDob = studentDob;
        this.nationality = nationality;
        this.gender = gender;
        this.permanentAddress = permanentAddress;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }




    public abstract void loginmethod();





}
