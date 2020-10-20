import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.*;

public class WordLength
{
    public static void main(String [] args)
    {
    	Scanner in = new Scanner(System.in);
    	Map <Integer, Integer> map = new HashMap<Integer, Integer>();
    	while (in.hasNext())
    	{
    		String [] listofwords = in.nextLine().split(" ",0);
    		for(String instance: listofwords)
    		{
    			if(map.keySet().contains(instance.length()))
    			{
    				map.put(instance.length(), map.get(instance.length()) + 1);
    			}
    			else
    			{
    				map.put(instance.length(),1);
    			}

    		}

    	}
    	for (Integer keys : map.keySet())  
        {
           System.out.println(keys + ": "+ map.get(keys));
        }
    	//List<Integer> sortedkeys = new ArrayList<Integer>();
        //sortedkeys.addAll(map.keySet());
    	//sortedkeys = sortedkeys.sort();
    	
    //	for(int i = 0;i<sortedkeys.size();i++)
    //	{
    //		System.out.println(sortedkeys.get(i) + ": " + map.get(sortedkeys.get(i)));
    //	}
    }
}