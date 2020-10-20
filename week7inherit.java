//basics
public class Child extends Parent
{
    
}

//inheritance-method overriding
public class Child extends Parent
{
    public int makeATwo()
    {
        return 3;
    }
}

//abstract methods
//An abstract Animal class
//and a method called greeting which returns a String.
public abstract class Animal
{
    public abstract String greeting();
}

//greetings constructor
public class Animal
{
    String name;
    public Animal(String n)
    {
        name = n;
    }
    public String greeting()
    {
        return ("Hello, my name is " + name);
    }
}