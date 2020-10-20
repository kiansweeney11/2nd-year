import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class EvenOdd
{
    public static void main(String [] args)
    {
        List<Integer> odd = new ArrayList<Integer>();
        List<Integer> even = new ArrayList<Integer>();
        System.out.print("Enter numbers: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        while(num != -1)
        {
            if (num % 2 ==0)
            {
                even.add(num);
            }
            else
            {
                odd.add(num);
            }
            num = in.nextInt();
        }
        System.out.println();
        System.out.print("Odd: ");
        for(int numinstance: odd)
        {
            System.out.print(" "+ numinstance);
        }
        System.out.println();
        System.out.print("Even: ");
        for(int numinstance: even)
        {
            System.out.print(" "+ numinstance);
        }
    }
}