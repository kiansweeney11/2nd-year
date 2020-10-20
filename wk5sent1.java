//Write a program which takes a word and a file name as the command line parameters
//and then finds out how many times the word appears in the file.
//In other words, your program will read the reviews file and print out how many reviews contain the word.


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Senti1
{
    public static void main(String [] args) throws FileNotFoundException
    {
        String filename = args[1];
        Scanner in = new Scanner(new File(filename));
        String word = args[0];
        int count = 0;
        while(in.hasNext())
        {
            String test = in.next();
            if(test.contains(word))
            {
                
                   count = count + 1;
            }
        }
        System.out.println(word + " appears " + count + " times.");
    
    }
}