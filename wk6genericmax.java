public class Test
{
    public static <T extends Thing> T max(T first, T second)
    {
        if (first.greaterThan(second))
        {
            return first;
        }
        return second;
    }
}
