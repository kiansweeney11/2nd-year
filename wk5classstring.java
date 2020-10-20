//Create a constructor which reads in a string containing three integers and initialises the Date appropriately.
//String input = "21 9 2015";

public class Date
{
    private int day;
    private int month;
    private int year;
    
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
    
    public String toString()
    {
        return day + "/" + month + "/" + year;
    }
}