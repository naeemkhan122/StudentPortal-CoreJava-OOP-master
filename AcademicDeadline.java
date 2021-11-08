import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;

public class AcademicDeadline {

    public void viewAd() throws IOException
    {
        FileReader file = new FileReader("C:\\file\\AcedemicDeadline.txt");
        BufferedReader fileInput = new BufferedReader(file);

        try
        {
            System.out.println("S.No# \t\t\t Activity  \t\t\t\t\t\t Date");

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

    public void addAd() throws IOException {
        FileWriter writer = new FileWriter("C:\\File\\AcedemicDeadline.txt", true);
        BufferedWriter buffer = new BufferedWriter(writer);
        Scanner input = new Scanner(System.in);

        try
        {
            buffer.newLine();
            System.out.println("What you want to add?");
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
}
