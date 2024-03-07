import java.util.Scanner;
class sandn
{
	public static int add(int a,int b)
	{
		return a+b;
	}
	public int sub(int a,int b)
	{
		return a-b;
	}
	public static void main(String args[])
	{
		try
		{
			Scanner s = new Scanner(System.in);
			System.out.print("Enter the first value: ");
			int a = s.nextInt();
			System.out.print("Enter the next value: ");
			int b = s.nextInt();
			int c = add(a,b);
			sandn s1 = new sandn();
			int d = s1.sub(a,b);
			System.out.println("Sum: "+c);
			System.out.println("Difference: "+d);
		}
		catch(Exception w)
		{
			System.out.println(w);
		}
	}
}

