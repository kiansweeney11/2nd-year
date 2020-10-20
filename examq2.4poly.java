// You need to submit two files for this exercise: the Shape class and the TestShape program. (Use the tabs above)
public abstract class Shape
{
    
    public abstract double area();
    
}

//
// TestShape: you need to modify the code below to make it polymorphic.
// In particular, you will have to remove the IF statement and use
// polymorphism to ensure that it still functions properly.
//
public class TestShape
{
   public static void main(String [] args)
   {
      Shape [] shapes = {
          new Circle(3),
          new Rectangle(6,1),
          new Rectangle(1, 2),
          new Circle(1)
      		};
      
      // Clunky non polymorphic way of doing it.
      for(Shape shape: shapes)
      {
          System.out.println("The area is " + String.format("%.3f", shape.area()));
      }
   }
}