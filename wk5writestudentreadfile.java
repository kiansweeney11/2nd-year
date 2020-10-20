//In this exercise, you read in a set of students from a file.
//Then you increase each student's mark by 1 and write out the results out to another file.
//The format of the file will be the same as in the previous exercise.
//The name of the input file will be the first argument and the name of the output file will be the second argument.



import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class WriteStudents
{
    public static void print(Student [] students)
    {
        for (Student student: students)
        {
            System.out.println(student);
        }
    }
    public static void print(Student [] students, PrintWriter outfile)
    {
        for (Student student: students)
        {
            outfile.println(student.name + " " + student.mark);
        }
    }
   public static void main(String [] args)
   {
       try
       {
           String f2 = args[1];
           Scanner in  = new Scanner(new File(args[0]));
           int n = in.nextInt();
           Student [] students = new Student [n];
           for(int i=0; i < n; i++)
           {
                String name = in.next();
      		    int grade = in.nextInt() + 1;
                students[i] = new Student(name, grade);
           }
           PrintWriter outfile = new PrintWriter(f2);
           outfile.println(n);
           print(students, outfile);
           outfile.close();
       }
       catch(FileNotFoundException e)
       {
           System.out.println("The file does not exist");
       }
   }
}