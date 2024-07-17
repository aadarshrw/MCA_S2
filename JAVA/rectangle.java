package graphics;
public class rectangle implements shape
{
    int length,breadth;
    rectangle(int l,int b)
    {
        length = l;
        breadth = b;
    }
    public double area()
    {
        return length*breadth;
    }
}