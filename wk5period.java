//You are now to create a Period class which represents a period of time. 
//It has a start time and an end time (both in 24 hour format) and where the start time is not later than the end time.

public class Period
{
   // Private variables
   // Constructor (with two Time parameters)
   // overlaps(Period otherPeriod) // boolean method to check if two periods overlap
   // String toString() // return a String representation of the Period
   private Time start;
   private Time end;
   public Period(Time t1, Time t2)
   {
       start = t1;
       end = t2;
   }
   
   public boolean overlaps(Period p1)
   {
       Time p1s = p1.start;
       Time p1e = p1.end;
       if (p1s.isLater(start) && end.isLater(p1s))
       {
           return true;
       }
       if (start.isLater(p1s) && p1e.isLater(start))
       {
           return true;
       }
       return false;
   }
   public String toString()
    {
        return start + " -> " + end;
    }
}