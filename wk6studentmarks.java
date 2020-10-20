import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.*;
@SuppressWarnings("unchecked")
public class MakeMap
{
    public static Map makeMap(Scanner in)
    {
        Map<String, Integer> phonebook = new HashMap<>();
        while( in.hasNext())
        {
            String name = in.next() ;
            Integer num = in.nextInt();
            phonebook.put(name,num);
        }
        return phonebook;
        
    }
}