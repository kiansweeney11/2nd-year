import java.util.Scanner;

public class Reverse
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        // Read in the numbers
        System.out.print("How many numbers: ");
        int len = in.nextInt();
        System.out.print("Enter " + len + " numbers: ");
        int [] values = new int[len];
        for(int i = 0; i < len; i = i + 1)
        {
            int num = in.nextInt();
            values[i] = num;
        }
        
        // reverse the numbers
        System.out.print("The numbers reversed are:");
        int j = len - 1;
        while(j >= 0)
        {
            System.out.print(" " + values[j]);
            j = j - 1;
        }
        // print them out
        System.out.println();
        // Use System.out.print(" " + num[i]); and finish with a newline.
    }
}