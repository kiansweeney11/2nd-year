//Create a class to represent a 24 hour time. This will be represented by a 4 digit string,
//where the first pair of digits represents the hour (0 to 23) and the
//second pair represents the number of minutes (0-59). For example the time "2359" is a minute before midnight.


public class Time
{
   // Private variables
   // Constructor (with a String parameter)
   // isLater(Time otherTime) // boolean method to compare two times
   // String toString() // return a String representation of the time (hh:mm)
   private int h;
   private int m;
   public Time(String s)
   {
       h = Integer.parseInt(s.substring(0,2));
       m = Integer.parseInt(s.substring(2,4));
   }
   public boolean isLater(Time t)
   {
       if (h > t.h)
       {
           return true;
       }
       if (h == t.h && m > t.m)
       {
           return true;
       }
       return false;
   }
   public String toString()
    {
        if (m < 10 && h < 10)
        {
            return "0" + h + ":0" + m;
        }
        else if (m < 10)
        {
            return h + ":0" + m;
        }
        else if (h < 10)
        {
            return "0" + h + ":" + m;
        }
        return h + ":" + m;
    }
   
}