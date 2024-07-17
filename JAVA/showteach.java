import java.util.Scanner;
class person
{
    String name;
    int age;
    person(String a,int b)
    {
        name = a;
        age = b;
    }
}
class employee extends person
{
    int salary;
    employee(String a,int b,int c)
    {
        super(a,b);
        salary = c;
    }
}
class teacher extends employee
{
    String subject;
    teacher(String a,int b,int c,String d)
    {
        super(a,b,c);
        subject = d;
    }
    void display()
    {
        System.out.println("--------------------");
        System.out.println("Name: "+name+"\nAge: "+age+"\nSalary: "+salary+"\nSubject: "+subject);
        System.out.println("--------------------");
    }
}
class showteach
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int i,age,salary;
        String name,subject;
        teacher t[] = new teacher[4];
        for(i=0;i<4;i++)
        {
            System.out.println("Enter the name,age,salary and subject of the teacher: ");
            name = s.next();
            age = s.nextInt();
            salary = s.nextInt();
            subject = s.next();
            t[i] = new teacher(name,age,salary,subject);
        }
        for(i=0;i<4;i++)
        {
            t[i].display();
        }
    }
}