import java.util.Scanner;
class product
{
	int pcode,price;
	String pname;
	void accept()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the product code: ");
		pcode = s.nextInt();
		System.out.println("Enter the product name: ");
		pname = s.next();
		System.out.print("Enter the price: ");
		price = s.nextInt();	
	}
}
class productprice
{
	public static void main(String args[])
	{
		product p1 = new product();
		p1.accept();
		product p2 = new product();
		p2.accept();
		product p3 = new product();
		p3.accept();
		if(p1.price < p2.price)
		{
			if(p1.price < p3.price)
			{
				System.out.println(p1.pname+" has the lowest price");
			}
		}
		else if(p2.price < p3.price)
		{
			System.out.println(p2.pname+" has the lowest price");
		}
		else
		{
			System.out.println(p3.pname+" has the lowest price");
		}	
	}
}

