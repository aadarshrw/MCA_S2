import java.util.Scanner;
class fibonacci implements Runnable
{
    int limit,i;
    fibonacci(int l)
    {
        limit = l;
    }
    public void run()
    {
        int a=0,b=a+1,c=a+b;
        System.out.print(a+" "+b+" ");
        for(i=0;c<limit;i++)
        {
            c = a+b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
    }
}
class even implements Runnable
{
    int limit,i;
    even(int l)
    {
        limit = l;
    }
    public void run()
    {
        for(i=1;i<limit;i++)
        {
            if(i%2 == 0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
class fiboeven
{
    public static void main(String args[])
    {
        Thread t1 = new Thread(new fibonacci(20));
        Thread t2 = new Thread(new even(20));
        System.out.print("Fibonacci series: ");
        t1.start();
        System.out.print("Even numbers: ");
        t2.start();
    }
}