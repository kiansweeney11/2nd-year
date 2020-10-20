import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Previous
{
    public static void main(String [] args)
    {
        Set<Integer> setofitems = new HashSet<Integer>();
        System.out.println("Enter some numbers (-1 to end)");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("Previous:");
        while(num != -1)
        {
            if (setofitems.contains(num))
            {
                System.out.println(num);
            }
            else
            {
                setofitems.add(num);
            }
            num = in.nextInt();
        }
    }
}