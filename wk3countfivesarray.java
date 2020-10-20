import java.util.Scanner;
public class Test
{
    public static int countFives(int[] num)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
        int count = 0;
        for(int i = 0; i < num.length; i = i + 1)
        {
            if(num[i] == 5)
            {
                count = count + 1;
            }
        }
        return count;
    }
    // Create a static method called countFives which returns the number of fives in the array
}