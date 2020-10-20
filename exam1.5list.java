import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Test
{
    // Add a static method called medium to this class.
    public static List<AirCraft> medium(List<AirCraft> planes)
    {
        List<AirCraft> aircrafts = new ArrayList<>();
        for (AirCraft ac : planes)
        {
            
            if (ac.getNumSeats() >= 20 && ac.getNumSeats() <= 100)
            {
                aircrafts.add(ac);
            }
        }
        return aircrafts;
    }
}



///
You are to write a method which takes a list of aircraft as a parameter and will return a new list of medium sized aircraft which have between 20 and 100 seats inclusive. The method should be a static method of the Test class and should be called medium().

Your program will be tested with code similar to the following:

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class AC
{
   public static void main(String [] args)
   {
      AirCraft [] group = {
               new AirCraft("Douglas", 110),
               new AirCraft("Messerschmitt", 90),
               new AirCraft("Boeing", 300),
               new AirCraft("Lockheed", 90),
               new AirCraft("Airbus", 70),
               new AirCraft("Zeppelin", 1000),
               new AirCraft("Victory", 55),
               new AirCraft("McDonnellD", 63),
               new AirCraft("Tupolev", 63),
            };

      // Convert array to a List
      List<AirCraft> aircraft = Arrays.asList(group);
      
      // Call the student's program
      List<AirCraft> medium = Test.medium(aircraft);

      for(AirCraft ac : medium)
         System.out.println(ac);
   }
}

The program will be compiled using javac GroupAirCraft.java and run using java GroupAirCraft The output should be:

$ java GroupAirCraft
Messerschmitt -> 90
Lockheed -> 90
Airbus -> 70
Victory -> 55
McDonnellD -> 63
Tupolev -> 63