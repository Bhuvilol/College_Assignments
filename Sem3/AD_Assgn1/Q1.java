import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sum Of N Numbers
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of inputs : ");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			System.out.print("Enter input no. "+i+" :");
			int in = sc.nextInt();
			sum+=in;
		}
		System.out.println("Sum of "+n+" inputs user provided is "+sum);
	}

}
