//Previously you wrote a program which processed a group of students that were initialised in an array
//(see An Array of Students (1)). In this program, you should create the students from a file.
//The file will look like the following:

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class GroupStudents
{
   public static void main(String [] args)
   {
       try
       {
           Scanner in  = new Scanner(new File(args[0]));
           int n = in.nextInt();
           Student [] students = new Student [n];
           for(int i=0; i < n; i++)
           {
                String name = in.next();
      		    int grade = in.nextInt();
                students[i] = new Student(name, grade);
           }
           Student.print(students);
       }
       catch(FileNotFoundException e)
       {
           System.out.println("The file does not exist");
       }
   }
}
