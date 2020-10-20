// Create a Word class with one static method called howManyCorrect
public class Word
{
    // Your method here.
    public static int howManyCorrect(String word, String guesses)
    {
        int count = 0;
		for(int i=0;i<word.length();i++)
		{
			if(containsLetter(guesses, word.charAt(i)))
			{
				count = count + 1;
			}
		
		}
		return count;
    }
    public static boolean containsLetter(String word, char letter)
	{
		String s = String.valueOf(letter);
		for(int i = 0; i < word.length(); i++)
		{
			if(s.equals(word.substring(i,i+1)))
			{
				return true;
			}
		}
		return false;
	}
}

Write a howManyCorrect method to be used in a Hangman game.
 The method should have two  parameters: a word and a string of characters representing a sequence of guesses. 
 The method should then return the number of letters in the word that have been correctly guessed.

For example, the method call:

Word.howManyCorrect("computing", "gupo");
would return 3 as three letters have been correctly guessed. The letters 'g', 'p', and 'o' appear in the word "computing".

Repeated guesses of the same letter are only counted once so Word.howManyCorrect("computing", "oooo") should return 1. If a guessed letter appears more than once in the word, then every occurrence is counted so Word.howManyCorrect("ozone", "o") would return 2 as the 'o' appears twice in "ozone".

The method should be a static method of a Word class and could be used as shown in the following program (see section in bold):
import java.util.Scanner;

public class TestHowManyLetters
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        // Ask the user for a word and some guesses
        System.out.print("Enter a word and some guesses: ");
        String word = in.next();
        String guesses = in.next();
        
        int numCorrect = Word.howManyCorrect(word, guesses);
        System.out.println(numCorrect);
    }
}
And the program would be executed as follows:

$ java TestHowManyLetters
Enter a word and some guesses: computing gpo
3
Note : Your method will actually be tested with the program similar to:

import java.util.Scanner;

public class Main
{
    // generate the alphabet
    static String getAlphabet()
    {
        String alphabet = "";
        for(int i = 0; i < 26; i++)
            alphabet += (char) ('a' + i);
            
        return alphabet;
    }
    
    static boolean contains(String word, char let)
    {
        for(int i = 0; i < word.length(); i++)
            if(word.charAt(i) == let)
                return true;
        return false;
    }
    
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);
        String alphabet = getAlphabet();
        System.out.println("Enter a word:");
        String word = input.next();
        String guesses = "";    // Start with no guesses
        // First try every second letter in the alphabet
        for(int i = 0; i < alphabet.length(); i += 2)
            {
                guesses += alphabet.charAt(i); // Try this letter
                System.out.println("Word.howManyCorrect(\"" + word + "\", \"" + guesses + "\") = " + Word.howManyCorrect(word, guesses));
            }
            
        // Try the same thing backwards
        guesses = ""; // reset guesses
        for(int i = alphabet.length() - 1; i >= 0; i -= 2)
            {
                guesses += alphabet.charAt(i); // Try this letter
                System.out.println("Word.howManyCorrect(\"" + word + "\", \"" + guesses + "\") = " + Word.howManyCorrect(word, guesses));
            }
        // try no guesses (i.e. empty string)
        guesses = "";
        System.out.println("Word.howManyCorrect(\"" + word + "\", \"" + guesses + "\") = " + Word.howManyCorrect(word, guesses));
        // all letters 
        for(int i = 0; i < alphabet.length(); i++)
            if(contains(word, alphabet.charAt(i)))
                guesses += alphabet.charAt(i); // Try this letter

        System.out.println("Word.howManyCorrect(\"" + word + "\", \"" + guesses + "\") = " + Word.howManyCorrect(word, guesses));
    }
}
This code reads in a word and then tests your method in four different ways

Every second letter in alphabetic order.
Every second letter in reverse alphabetic order.
No letters
Every letter in the word, though in alphabetic order.