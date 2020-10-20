//Create a Circle class which extends Shape.

public class Circle extends Shape
{
    private double r;
    
    public Circle(String name, Double r1)
    {
        super(name);
        r = r1;
    }
    
    
    public double area()
    {
        return Math.PI * r * r;
    }
}