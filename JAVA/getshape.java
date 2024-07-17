import graphics.*;
class getshape
{
    public static void main(String args[])
    {
        circle c = new circle(5);
        double area = c.area();
        System.out.println("Area of the circle is "+area);
        rectangle r = new rectangle(4,5);
        area = r.area();
        System.out.println("Area of the rectangle is "+area);
    }
}