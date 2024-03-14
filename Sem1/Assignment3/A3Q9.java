import java.util.Scanner;

public class A3Q9 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of a,b,c");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		if(a>b && a>c) 
		{
			System.out.println("Largest number:"+a);
			if(b>c) 
			{
				System.out.println("2nd Largest number: "+b);
			}
			else 
			{
				System.out.println("2nd Largest number: "+c);
			}
		}
		else if(b>a&&b>c) 
		{
			System.out.println("Largest number:"+b);
			if(a>c) 
			{
				System.out.println("2nd Largest number: "+a);
			}
			else 
			{
				System.out.println("2nd Largest number: "+c);
			}
		}
		else 
		{
			System.out.println("Largest number:"+c);
			if(b>a) 
			{
				System.out.println("2nd Largest number: "+b);
			}
			else 
			{
				System.out.println("2nd Largest number: "+a);
			}
			
		}
		sc.close();		
	}
}
		
	


