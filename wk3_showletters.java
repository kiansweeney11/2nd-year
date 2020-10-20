//This time, you should write a showLetters method, which instead of taking one character,
//takes a string of characters representing a sequence of guesses
//and returns a new string with any guessed letters in their
//correct position and unguessed letters shown as underscores. 

public class Word
{
	public static String showLetters(String word, String guesses)
	{
		String line = "";
		for(int i=0;i<word.length();i++)
		{
			if(containsLetter(guesses, word.charAt(i)))
				{
				line=line+word.substring(i, i+1);
				}
			else
				{
				line = line+"_";
				}
		}
		return line;
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