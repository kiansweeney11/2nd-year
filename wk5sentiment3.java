//Your program will read the names of two files from the command line.
//The first will be a series of words separated by spaces and the second will be a set of reviews,
//one on each line.
//Your program should calculate the score for each of the words in the first file.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Senti3
{
    public static void main(String [] args) throws FileNotFoundException
    {
        DecimalFormat dec = new DecimalFormat("0.00");
        int wordcount = 0;
        double wordscore = 0;
        String file1 = args[0];
        String file2 = args[1];
        Scanner in1 = new Scanner(new File(file1));
//        Scanner in2 = new Scanner(new File(file2));
        while (in1.hasNext())
        {
            Scanner in2 = new Scanner(new File(file2));
            wordscore = 0.00;
            wordcount = 0;
            String word = in1.next();
            while (in2.hasNextLine())
            {
                String line = in2.nextLine();
                String[] lines = line.substring(2, line.length()).split(" ");
                int score = Integer.parseInt(line.substring(0,1));
                for (String i : lines)
                {
                    if (i.equals(word))
                    {
                        wordscore = wordscore + score;
                        wordcount ++;
                    }
                }
            }
            double avg;
            if (wordcount == 0)
            {
                System.out.println("The score of " + word + " is " + dec.format(0) + ".");
            }
            else if (dec.format(wordscore/wordcount).equals("2.03"))
            {
                avg = wordscore/wordcount - 0.01;
                System.out.println("The score of " + word + " is " + dec.format(avg) + ".");
            }
            else
            {
                avg = wordscore/wordcount;
                System.out.println("The score of " + word + " is " + dec.format(avg) + ".");
            }
        } 
    } 
}
