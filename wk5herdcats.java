//The cats will have to implement the Order interface and they should compare based on the length of their names. 
//That's all you have to do, modify the
//Cat class so that it implements the Order interface and add the lessThan method that compares based on name length. 


public class Cat implements Order
{
    private String name;
    
    public Cat(String n)
    {
        name = n;
    }
    
    public String toString()
    {
        return "Cat: " + name;
    }
    public boolean lessThan(Order other)
    {
    	Cat c = (Cat) other;
    	if(name.length() < c.name.length())
    		return true;
    	return false;
    }
}