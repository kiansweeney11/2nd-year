//Create a Dog and a Cat class, each of which inherit from Animal. 
//Each class should have a constructor which initialses their name and a hello method.
//The cat's hello method should return the string "Meow" and 
//the dog's hello method should return the string  "Woof".


public class Dog extends Animal
{
    public Dog(String n)
    {
        super(n);
    }
    
    public String hello()
    {
        return("Woof");
    }
}

public class Cat extends Animal
{
    public Cat(String n)
    {
        super(n);
    }
    
    public String hello()
    {
        return("Meow");
    }
}