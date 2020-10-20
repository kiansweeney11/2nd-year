public class Swap
{
    public static <T> void swap(T[] a,int first, int second)
    {
        T tmp = a[first];
        a[first] = a[second];
        a[second] = tmp;
    }
}