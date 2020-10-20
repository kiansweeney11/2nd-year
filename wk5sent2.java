//This time, for each review, read the score of the review and then apply that score to the word.
//Then you will be able to score each word.
//The score of a word will be the average score of all the reviews that the word appears in.
//For example, if the word is horrible and appears in two reviews,
//one with a score of 0 and the other with a score of 1, then "horrible" gets a score of 0.5


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Senti2
{
    public static void main(String [] args) throws FileNotFoundException
    {
        String filename = args[1];
        Scanner in = new Scanner(new File(filename));
        String word = args[0];
        double sumscore = 0;
        int count = 0;
        int sumrev = 0;
        double avg = 0.00;
        
        while(in.hasNextLine())
        {
            String test = in.nextLine();
            String[] splitStr;
            if (test.substring(0, 1).equals(" "))
            {
                splitStr = test.substring(1, test.length()).split("\\s+");
            }
            else
            {
                splitStr = test.split("\\s+");
            }
            for(int i = 0; i < splitStr.length; i = i + 1)
            {
                if(splitStr[i].contains(word))
                {
                    sumrev ++;
                    count ++;
                    sumscore = sumscore + Integer.parseInt(splitStr[0]);
                }
                
            }

        }
        System.out.println(word + " appears " + count + " times.");
        DecimalFormat dec = new DecimalFormat("0.00");
        if (sumrev !=0)
        {
            avg = sumscore / sumrev;
        }
        System.out.println("The average score of the reviews containing " + word + " is " + dec.format(avg));
    
    }
}