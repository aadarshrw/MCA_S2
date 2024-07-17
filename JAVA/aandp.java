import java.util.Scanner;
interface shapes
{
    double area();
    double perimeter();
}
class circle implements shapes
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
    public double perimeter()
    {
        return 2*3.14*radius;
    }
}
class rectangle implements shapes
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
    public double perimeter()
    {
        return 2*(length+breadth);
    }
}
class aandp
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        double area,perimeter;
        System.out.print("1.Circle\n2.Rectangle\n3.Exit\nEnter a choice: ");
        int choice = s.nextInt();
        switch(choice)
        {
            case 1: System.out.print("Enter the radius: ");
                    int radius = s.nextInt();
                    circle c = new circle(radius);
                    area = c.area();
                    perimeter = c.perimeter();
                    System.out.print("Area: "+area+"\nPerimeter: "+perimeter);
                    break;
            case 2: System.out.print("Enter the length: ");
                    int length = s.nextInt();
                    System.out.print("Enter the breadth: ");
                    int breadth = s.nextInt();
                    rectangle r = new rectangle(length,breadth);
                    area = r.area();
                    perimeter = r.perimeter();
                    System.out.print("Area: "+area+"\nPerimeter: "+perimeter);
                    break;
            case 3: System.exit(0);
            default:System.out.println("Invalid Input!!!");
        }
    }
}