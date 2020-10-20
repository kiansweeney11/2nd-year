//Write a method called containsLetter which takes as parameters a word and a letter and returns true
//if the word contains the letter and false if it doesn't.

public class Word
{
    public static boolean containsLetter(String word,  char letter)
    {char [] wordlist = word.toCharArray();
    int i = 0;
    int len = (word.length());
    while(i < len)
    {
        if (wordlist[i] == letter)
        {
            return true;
        }
        else
        {
            i = i + 1;
        }
    }
    return false;
    }
} 