//Create a class called WordScore. 
//The class should have two attributes, a string called word and an integer called score. There should be a 
//constructor which takes one String parameter which initialises the word.

//There should be one method called score() which takes string and returns an int.
//The string represents the review and is in the form of a score followed by a space and a sentence.
//The function should return the score if the word is contained in the sentence and should return -1 otherwise.



public class WordScore
{
    int score;
    static String word;
    
    public WordScore(String s)
    {
        word = s;
    }
    public static int score(String comp)
    {
        String[] splitStr;
        if (comp.substring(0, 1).equals(" "))
        {
            splitStr = comp.substring(1, comp.length()).split("\\s+");
        }
        else
        {
            splitStr = comp.split("\\s+");
        }
        
        for(int i = 0; i < splitStr.length; i = i + 1)
        {
            if(splitStr[i].equals(word))
            {
                return Integer.parseInt(splitStr[0]);
            }
        }
        return -1;
    }
}