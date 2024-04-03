import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		int sum=0;
		for (int i = 1; i <= num/2; i++) {
			if (num%i==0) {
				sum = sum +i;
			}
		}
		if (sum==num) {
			System.out.println(num+" is a perfect number.");
		}
		else {
			System.out.println(num+" is not a perfect number.");
		}
	}

}
