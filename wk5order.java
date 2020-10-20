//Modify the Point class so that it properly implements the Order interface.
//Two Points will be compared by first checking the x coordinate. 
//Whichever Point has the smaller x coordinate, then that Point will be regarded as being smaller.
//If the two x coordinates are the same, then use the y coordinate as a decider.


public class Point implements Order
{
    private double x, y;
    
    public Point(double newX, double newY)
    {
        x = newX;
        y = newY;
    }
    
    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }
    
    public boolean lessThan(Order other)
    {
        Point p = (Point) other;
        if (x < p.x)
        {
            return true;
        }
        if (x == p.x)
        {
            if(y < p.y)
            {
                return true;
            }
        }
        return false;
    }
}