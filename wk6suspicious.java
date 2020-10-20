//A headmaster of a school is contacted by the police and provided with a file of names of juvenile delinquents.
//He has another file containing the name of his students and wants a program to check if any of the names are the same.
//Each line of each file contains one name only.
//Write a program to detect if any name appears on both files. (Example files are shown below) The filenames will be passed //to your program on the command line.





import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.*;
public class Suspicious
{
    public static void main(String [] args)
    {
        try
        {
            Scanner in = new Scanner(new File(args[0]));
            Scanner in2 = new Scanner(new File(args[1]));
            List<String> students = new ArrayList<String>();
            List<String> badies = new ArrayList<String>();
            List<String> both = new ArrayList<String>();
            
            while(in.hasNext())
            {
                students.add(in.nextLine());
            }
            while(in2.hasNext())
            {
                badies.add(in2.nextLine());
            }
            for(String instance: badies)
            {
                if( students.contains(instance))
                {
                    both.add(instance);
                }
            }
            int i = 0;
            int j = 1;
            while(i<both.size())
            {
                System.out.println(j+". "+ both.get(i));
                j++;
                i++;
            }
            
        }
        catch(FileNotFoundException e)
        {
            
        }
    }
}