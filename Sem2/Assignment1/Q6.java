import java.util.Scanner;

public class Q6 {
	public static boolean isOdd(int n) {
		if ((n&1)==1) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		if (isOdd(a)) {
			System.out.println(a+" is a odd number.");
		} else {
			System.out.println(a+" is a even number.");
		}
	}

}
