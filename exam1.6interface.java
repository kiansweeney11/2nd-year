public class AirCraft implements Order
{
    private String make;
    private int numSeats;

    public AirCraft(String make, int numSeats)
    {
      this.make = make;
      this.numSeats = numSeats;
    }

    public String getMake()
    {
      return make;
    }

    public int getNumSeats()
    {
      return numSeats;
    }
    
    public boolean greaterThan(Order other)
    {
        AirCraft air = (AirCraft) other;
        if (numSeats > air.numSeats)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
   
   public String toString()
   {
       return make + " -> " + numSeats;
   }
}


///
Here is an Order interface

public interface Order
{
    public boolean greaterThan(Order other);
}
Modify the AirCraft class so that it properly implements the Order interface. An AirCraft will be greater than another if it has more seats.

The Main.java and Order.java files are supplied.

Your program will be compiled using the following command:

javac Main.java
and run using

java Main
and here is the Main.java file:

import java.util.Scanner;

public class Main
{
    public static AirCraft getAirCraft(Scanner in)
    {
        // Read in the AirCraft details
        String name = in.next();
        int numSeats = in.nextInt();
        
        // Create and return the AirCraft
        return new AirCraft(name, numSeats);
    }
    
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        AirCraft a1 = getAirCraft(in);
        AirCraft a2 = getAirCraft(in);
        
        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);
        System.out.println("a1.greaterThan(a2) = " + a1.greaterThan(a2));
    }
}
