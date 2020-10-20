import java.util.Scanner;

public class VowelDouble
{
   public static void main(String [] args)
   {
      System.out.print("Enter a word :");
      String word = new Scanner(System.in).next();
      
      String vowelDouble = "";
      // Insert your code here
      word = word.toLowerCase();
      int i = 0;
      while(i<word.length())
      {
          char ch = word.charAt(i);
          if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
          {
              vowelDouble = vowelDouble + ch + ch;
              i++;
          }
          else
          {
              vowelDouble = vowelDouble + ch;
              i++;
          }
      }
      
      
      System.out.println("VowelDoubled is :" + vowelDouble + ":");
   }
}