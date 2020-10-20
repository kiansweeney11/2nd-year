//Write a method called isFirstLetter which takes as parameters a word and a letter and returns true if the word starts
// with the letter and false if it doesn't.

// Create a Word class with one static method called isFirstLetter
public class Word
{
    public static boolean isFirstLetter(String a,  char b)
    {char [] wordlist = a.toCharArray();
    if (wordlist[0] == b)
    {return true;
    }
    else
    {return false;
        
    }
    }
} 