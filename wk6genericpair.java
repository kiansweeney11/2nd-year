public class Pair<T,U>
{
    private T firstinstance;
    private U secondinstance;
    public  Pair(T first, U sep)
    {
        this.firstinstance = first;
        this.secondinstance = sep;
    }
    public String toString()
    {
        return this.firstinstance +" "+ this.secondinstance;
    }
}