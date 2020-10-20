import java.util.Scanner;

public class AboveAverage
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many numbers: ");
        int num = in.nextInt();
        
        // Create an array
        double [] numbers = new double[num];
        System.out.print("Enter " + num + " numbers: ");

        // Now read in the numbers
        double sum = 0;
        for(int i =0; i < numbers.length; i = i + 1)
        {
            double next = in.nextDouble();
            numbers[i] =  next;
            sum = sum + next;
        }
        // Print out the numbers greater than the average
        double avg = sum/num;
        int i = 0;
        System.out.println("The above average numbers are:");
        while(i < num)
        {
            if(numbers[i] > avg)
            {
                System.out.print(" " + numbers[i]);
            }
            i = i + 1;
        }
        // You can use the following code to print out one number
        //System.out.print(" " + numbers[i]); // You may want to put this in a loop.

        System.out.println(); // Should finish with a new line
    }
}