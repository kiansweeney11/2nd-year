import java.util.Scanner;
public class Test
{
    
    // Create a static method called getSum which sums an array of ints
    public static int getSum(int[] num)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
        int sum = 0;
        for(int i = 0; i < num.length; i = i + 1)
        {
            sum = sum + num[i];
        }
        return sum;
    }
}