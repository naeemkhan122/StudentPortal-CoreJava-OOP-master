import java.util.ArrayList;

public class Department
{

    private String departmentName;

    public Department()
    {

    }

    public Department(String departmentName)
    {
        this.departmentName = departmentName;

    }

    public String getDepartmentName()
    {
        return departmentName;
    }

    public void setDepartmentName(String departmentName)
    {
        this.departmentName = departmentName;
    }

    ArrayList<Department> departments = new ArrayList<>();

    public void addingDepartment()
    {
        departments.add(new Department("Computer Science"));
        departments.add(new Department("Software Engineering"));
    }

    public void displayDepartmentNames()
    {
        System.out.println("Departments Name : ");
        for(Department d : departments)
        {
            System.out.printf(d.getDepartmentName()+"\n");
        }
    }

}