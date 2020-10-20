import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class MakeMap
{
    public static Map<Character, Integer> countLetters(String word)
    {
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        String w = word.toLowerCase();
  
        // checking each char of strArray 
        for(int i = 0; i < word.length(); i++)
        {
            if(charCountMap.containsKey(word.charAt(i)))
            { 
                // If char is present in charCountMap, 
                // incrementing it's count by 1 
                charCountMap.put(word.charAt(i), charCountMap.get((word.charAt(i))) + 1 );
            } 
            else
            { 
                // If char is not present in charCountMap, 
                // putting this char to charCountMap with 1 as it's value 
                charCountMap.put(word.charAt(i), 1); 
            }
        }
        return charCountMap;
    }

}

//The map will map characters to integers. Your method would be called by the following program:

import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main
{
   public static void main(String [] args)
   {
      Map<Character, Integer> count = MakeMap.countLetters("hello");
      List<Character> letters = new ArrayList<Character>(count.keySet());
      Collections.sort(letters);
      for(Character letter : letters)
         System.out.println("There are " + count.get(letter) + " of the letter '" + letter + "'");
   }
}