import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadNames
{
    public static void main(String [] args)
    {
        try
        {
            Scanner in1 = new Scanner(System.in);
            System.out.print("Enter the file name: ");
            String filename = in1.next();
            Scanner in = new Scanner(new File(filename));
            int n = in.nextInt();
            String [] names = new String [n];
            for (int i=0; i < n; i++)
            {
                names[i] = in.next();
            }
            System.out.println("The names in reverse order are:");
            for (int j=n-1; j >= 0; j-- )
            {
                System.out.print(names[j] + " ");
            }
            System.out.println();
        }
        catch(FileNotFoundException e)
            {
                System.out.println("The file does not exist");
            }
    }
}