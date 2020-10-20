// An abstract Animal
//
// You will need to add a greeting method.
//
//  Also, the greeting method needs to be able to access its subclasses hello method.
//
// It seems a little messy at first. You will need to think about it


//This time we want the Animal greeting method to be modified so that it will be:
//Hello, my name is name
//Where Hello is species specific, that is a dog would say "woof" and a cat would say "Meow".
//Name has the usual meaning. You will only have to change the Animal class.
//Otherwise, the code will be the same as for the previous exercise.



public abstract class Animal
{
    public Animal(String name)
    {
        this.name = name;
    }
 
    // private
    private String name;
    public abstract String hello();
    
    public String greeting()
    {
        return(hello() + ", my name is " + name);
    }
}