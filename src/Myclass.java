import java.util.Scanner;

public class Myclass {
	int x,y;
	Scanner s=new Scanner(System.in);
	
	
	public void read()
	{
		System.out.println("enter the first byts");
		x=s.nextInt();
	
		System.out.println("enter the 2nd byts");
		y=s.nextInt();
		
								
	}
	public void calc()
	{
		int c=x & y;
		System.out.println(c);
		System.out.println("enter the boolean values");
		boolean a=s.nextBoolean();
		boolean b=s.nextBoolean();
		boolean d=a && b;
		System.out.println(d);
		
	}
	public static void main(String args[])
	{
		Myclass my=new Myclass();
		my.read();
		my.calc();
		
	}
}
