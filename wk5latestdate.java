import java.util.Scanner;

public class Date
{
    private int day;
    private int month;
    private int year;
    
    public String toString()
    {
        return day + "/" + month + "/" + year;
    }
    public Date()
    {
        day = 1;
        month = 1;
        year = 2000;
    }
    public Date(String s)
    {
        String [] date = s.split(" ");
        day = Integer.parseInt(date[0]);
        month = Integer.parseInt(date[1]);
        year = Integer.parseInt(date[2]);
    }
    public Date(int d, int m, int y)
    {
        day = d;
        month = m;
        year = y;
    }
    
    // Insert the isAfter method here.
    public boolean isOnOrAfter(Date d1)
    {
        if (d1.year <= year)
        {
            if (d1.month <= month)
            {
                if (d1.day <= day)
                {
                    return true;
                }
            }
        }
        return false;
    }
    
    // Here is the main method which will read in a sequence of dates.
    // Modify it so that it prints the latest date.
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        String line;
        Date old = new Date(0, 0, 0);
        while(in.hasNextLine())
        {
           line = in.nextLine();
           
           if(line.length() != 0)
           {
              Date date = new Date(line);
              if (date.isOnOrAfter(old))
              {
                  old = date;
              }
           }

        }
        System.out.println(old); // Print the latest date
    }
}
