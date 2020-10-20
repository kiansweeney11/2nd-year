//You are to submit an appropriate Point class (it should be the same as for the previous exercise)
//which will cause the sort method to properly sort the points.
//Points should be compared based on their distance from the origin.

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
        return (x * x + y * y) < (p.x * p.x + p.y * p.y);
    }
}