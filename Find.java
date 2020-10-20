public class Find
{
    public static <T> int find(T [] a, T b)
    {
        for(int i = 0; i < a.length; i++)
        {
            if(a[i].equals(b))
            {
                return i;
            }
        }
        return -1;
    }
}

// ca269 exam q 1.7