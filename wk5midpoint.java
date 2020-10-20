//Write a midPoint method of the point class which calculates the mid point between
//the point and another point which is passed as a parameter. 
//The method should return a new Point representing the mid point. 


public class Point
{
   private double x;
   private double y;

   public Point(double newX, double newY)
   {
      x = newX;
      y = newY;
   }
   
   public Point midPoint(Point p1)
   {
       double x1 = (x + p1.x) / 2;
       double y1 = (y + p1.y) / 2;
       return new Point(x1, y1);
   }

   public String toString()
   {
      return "(" + x + ", " + y + ")";
   }
}
