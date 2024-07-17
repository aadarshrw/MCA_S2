class area
{
    int findarea(int l,int b)
    {
        return l*b;
    }
    double findarea(int r)
    {
        return 3.14*r*r;
    }
}
class shapes
{
    public static void main(String args[])
    {
        area a = new area();
        int l = 10;
        int b = 5;
        int r = 5;
        double area = a.findarea(l,b);
        System.out.print("Area of the rectangle is "+area);
        area = a.findarea(r);
        System.out.print("\nArea of the circle is "+area);
    }
}