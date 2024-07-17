package graphics;
public class circle implements shape
{
    double radius;
    circle(double r)
    {
        radius = r;
    }
    public double area()
    {
        return 3.14*radius*radius;
    }
}