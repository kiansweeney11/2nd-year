//Write a rudimentary Hangman game. In this game, 
//your program will present a word to the user who will guess a letter at a time.
//Your program will keep them informed of their progress by showing
//them which letters of the word are guessed.

import java.util.Scanner;

public class Hangman
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        // First get the word
        int wordSeed = in.nextInt();
        

        String word = Word.getWord(wordSeed);
        
        String line = "";
        for(int i = 0; i < word.length(); i++)
        {
            String space = "_";
            line = line + space;
            
        }
        System.out.println("The word is");
        System.out.println(line);
        System.out.println("Guess a letter:");
        String guess = in.next();
        while(!line.equals(word))
        {
            for(int i = 0; i<word.length();i++)
            {
                if(word.charAt(i) == guess.charAt(0))
                {
                    line = line.substring(0,i) + guess + line.substring(i+1, line.length());
                }
            }
            System.out.println(line);
            if(line.equals(word))
                break;
            System.out.println("Guess a letter:");
            guess = in.next();
        }
        System.out.println("Well Done, the word was "+ word + ".");
}
}