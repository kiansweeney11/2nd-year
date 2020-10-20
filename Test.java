import java.util.*;
public class Test
{
    // Create a static method called makePalindrome with a String parameter which returns a String
    public static String makePalindrome(String word)
    {
        // Your code here
        String palin = "";
        int i = word.length() - 1;
        while(i >= 0)
        {
            char ch = word.charAt(i);
            palin = palin + ch;
            i--;
        }
    return word + palin;   
    }
}

// q1 1.1 ca269 2020 exam palindrome

import java.util.Scanner;

public class Main
{
    public static void main(String [] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the word: ");
        String word = in.next();

        String pal = Test.makePalindrome(word);

        System.out.println("The palindrome is: " + pal);
    }
}
