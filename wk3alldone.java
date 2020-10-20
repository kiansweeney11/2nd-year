//Write a method called allDone which takes as parameters a word and a string representing a 
//sequence of guesses and returns true if all the letters of the word have been guessed,
//that is are contained in the sequence of guesses.
//The method should return false if not all letters have been guessed. 
//It is recommended that you make use of the containsLetter method from the previous question.

public class Word
{
    public static boolean allDone(String word,  String letter)
    {
        char [] wordlist = word.toCharArray();
        char [] letterlist = letter.toCharArray();
        int count = 0;
        for (int i = 0; i < wordlist.length; i++)
            {
                for (int j = 0; j < letterlist.length; j++) 
                {
                    if (wordlist[i] == letterlist[j])
                        {
                            count = count + 1;
                        }
                }
            }
        if(count==wordlist.length)
        {
            return true;
        }
        return false;    
    }    
}