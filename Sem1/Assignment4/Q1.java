import java.util.Iterator;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int a = sc.nextInt();
		System.out.print("Enter first number : ");
		int b = sc.nextInt();
		System.out.print("Enter first number : ");
		int c = sc.nextInt();
		int sum = 0;
		for (int i = a; i <= b; i=i+c) {
			System.out.print(i+" ");
			sum = sum + i;
		}
		System.out.println("\nThe sum of number displayed is "+sum);
	}

}
