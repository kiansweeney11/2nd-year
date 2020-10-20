//Write a program to manage phone numbers. A user enters commands a line at a time. There are three commands:

//1. !! (two exclamation points) exits the program

//2. name number associates a number to a name. Note that the name cannot have spaces and if a second number is added to a //name, it overwrites the first.

//3. name ? gives the number for that name




import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.*;

public class PhoneNumbers
{
    public static void main(String [] args)
    {
        System.out.println("Enter a name and number, or a name and ? to query (!! to exit)");
        Scanner in = new Scanner(System.in);
        Map<String, Integer> phonebook = new HashMap<>();
        String line = in.nextLine();
        while( ! line.equals("!!"))
        {
            String [] phones = line.split(" ",0);
            if ( phones[1].equals("?"))
            {
                
                if(phonebook.keySet().contains(phones[0]))
                {
                System.out.println(phones[0] + " has number " + phonebook.get(phones[0]));
                }
                else
                {
                    System.out.println("Sorry, there is no " + phones[0]);
                }
            }
            else
            {
                phonebook.put(phones[0],Integer.parseInt(phones[1]));
            }
                
            line = in.nextLine();
        }
        System.out.println("Bye");
        
    }
}