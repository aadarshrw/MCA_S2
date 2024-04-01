import java.util.Scanner;
class complex
{
	float a,b;
	complex(float x,float y)
	{
		a=x;
		b=y;
	}
	void display()
	{
		System.out.println(a+" + "+b+"i");
	}
}
class main
{
	public static complex add(complex a1,complex a2)
	{
		complex a3 = new complex(0,0);
		a3.a = a1.a+a2.a;
		a3.b = a1.b+a2.b;
		return a3;
	}
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first complex number:");
		float i = s.nextFloat();
		float j = s.nextFloat();
		complex a1 = new complex(i,j);
		System.out.println("Enter the second complex number:");
		i = s.nextFloat();
		j = s.nextFloat();
		complex a2 = new complex(i,j);
		System.out.print("The first complex number: ");
		a1.display();
		System.out.print("The second complex number: ");
		a2.display();
		complex a3 = add(a1,a2);
		System.out.print("The sum: ");
		a3.display();
	}
}
