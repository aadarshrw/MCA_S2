import java.util.Scanner;
class cpu
{
	int price;
	class processor
	{
		int cores;
		String manufact;
	}
	static class ram
	{
		int memory;
		String manufact;	
	}
}
class specs
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		cpu c = new cpu();
		cpu.processor p = c.new processor(); 
		ram r = new ram();
		System.out.print("Enter the CPU price: ");
		c.price = s.nextInt();
		System.out.println("Enter the processor cores and manufacturer:");
		p.cores = s.nextInt();
		p.manufact = s.next();
		System.out.println("Enter the RAM memory and manufacturer:");
		r.memory = s.nextInt();
		r.manufact = s.next();
		System.out.println("CPU Specs");
		System.out.println("---------");
		System.out.println("Price: "+c.price);
		System.out.println("---------");
		System.out.println("Processor Specs");
		System.out.println("---------------");
		System.out.println("Cores: "+p.cores);
		System.out.println("Manufacturer: "+p.manufact);
		System.out.println("---------------");
		System.out.println("RAM Specs");
		System.out.println("---------");
		System.out.println("Memory: "+r.memory);
		System.out.println("Manufacturer: "+r.manufact);
		System.out.println("---------");
	}	
}
