import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.*;
public class ListSort
{
    public static void main(String [] args)
    {
        List<Integer> listers = new ArrayList<Integer>();
        System.out.print("Enter numbers: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        while(num != -1)
        {
            listers.add(num);
            num = in.nextInt();
        }
        Collections.sort(listers);
        System.out.println();
        System.out.print("Sorted: ");
        for(int numinstance: listers)
        {
            System.out.print(" "+ numinstance);
        }
    }
}