import java.util.Scanner;

public class Q3 {
	public static int sum_digit(int num) {
		int sum = 0;
		while (num > 0) {
			sum += (num % 10);
			num /= 10;
		}
		return sum;
	}

	public static int mul_digit(int num) {
		int mul = 1;
		while (num > 0) {
			mul *= (num % 10);
			num /= 10;
		}
		return mul;
	}

	public static boolean isspynum(int a, int b) {
		if (a == b) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		if (isspynum(sum_digit(num), mul_digit(num))) {
			System.out.println(num + " is a spy number.");
		} else {
			System.out.println(num + " is not a spy number.");
		}
	}

}

//output
// Enter a number
// 1124
// 1124 is a spy number.

