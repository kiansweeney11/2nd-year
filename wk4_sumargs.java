public class TotalArgs
{
    public static void main(String [] args)
    {
      int i = 0;
      int length = args.length;
      int sum = 0;
      while(i < length)
      {
          
          sum = sum + Integer.valueOf(args[i]);
          i = i + 1;
      }
    System.out.println("The sum of all the args is " + sum + ".");
        
    }
}