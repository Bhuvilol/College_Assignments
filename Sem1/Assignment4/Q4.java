import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number :");
		int a = sc.nextInt();
		System.out.print("Enter the second number :");
		int b = sc.nextInt();
		int x=a,y=b,gcd,temp;
		while (true) {
			if (x%y==0) {
				gcd = y;
				break;
			}
			else {
				temp = x%y;
				x=y;
				y = temp;
			}
		}
		System.out.println("GCD of "+x+" and "+y+" is "+gcd);
	}

}
