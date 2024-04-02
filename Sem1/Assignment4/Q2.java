import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int sumDig = 0;
		for (int i = n; i > 0 ; i/=10) {
			//System.out.println(i%10);
			sumDig += (i%10);
		}
		System.out.println("Sum of digits of the given number is "+sumDig);
		if(sumDig % 9 ==0) {
			System.out.println("The number "+n+" is divisible by 9.");
		}
		else
			System.out.println("The number "+n+" is not divisible by 9");
	}

}
