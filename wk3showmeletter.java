//Write a method called showLetter which takes as parameters a word 
//and a guess and returns a string containing underscores 
//representing every letter in word unless that letter is guess 
//in which case it shows the guessed letter..


public class Word
{
    public static String showLetter(String word, char guess)
    {
        String line = "";
        for(int i = 0; i<word.length();i++)
        {
            String under = "_";
            line = line + under;
        }
        
        for(int i = 0; i<word.length();i++)
        {
            if(word.charAt(i) == guess)
            {
                line = line.substring(0,i) + guess + line.substring(i+1,line.length());
            }
        }
        
        return line;
    }
}