import java.util.Scanner;

public class A2HA3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter three point for a triangle:");
		
		Scanner sc = new Scanner(System.in);
		
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double x3 = sc.nextDouble();
		double y3 = sc.nextDouble();
		
		double a = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
		double b = Math.sqrt(((x3-x2)*(x3-x2))+((y3-y2)*(y3-y2)));
		double c = Math.sqrt(((x1-x3)*(x1-x3))+((y1-y3)*(y1-y3)));
		
		double s = (a+b+c)/2;
		
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("The area of triangle is "+area);
		sc.close();
	}

}
