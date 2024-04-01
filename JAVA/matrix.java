import java.util.Scanner;
class matrix
{
	int i,j;
	int[][] insert(int[][] a, int r, int c)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the matrix values: ");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j] = s.nextInt();
			}
		}
		return a;
	}
	void display(int[][] a,int r,int c)
	{
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	int[][] add(int[][] a,int[][] b,int m,int n)
	{
		int[][] c = new int[10][10];
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;
	}
	public static void main(String args[])
	{
		matrix m = new matrix();
		int a[][] = new int[10][10];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of 1st array: ");
		int r1 = s.nextInt();
		int c1 = s.nextInt();
		System.out.println("Enter the number of rows and columns of 2nd array: ");
		int r2 = s.nextInt();
		int c2 = s.nextInt();
		if(r1 == r2 && c1 == c2)
		{
			a = m.insert(a,r1,c1);
			m.display(a,r1,c1);
			int b[][] = new int[10][10];
			b = m.insert(b,r2,c2);
			m.display(b,r2,c2);
			int c[][] = new int[10][10];
			c = m.add(a,b,r1,c1);
			System.out.println("The sum is: ");
			m.display(c,r1,c1);
		}
		else
		{
			System.out.println("Arrays cannot be added!!!");
		}
	}
}

