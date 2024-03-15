import java.util.Scanner;

public class Q5 {
	public static int sum_of_digits(int n) {
		int sum =0;
		while (n>0) {
			sum+=n%10;
			n/=10;
		}
		return sum;
	}
	public static int result(int num) {
		int result = num;
		while (true) {
			if (result<10) {
				return result;
			} else {
				result = sum_of_digits(result);
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		System.out.println("Sum of digits of "+num+" until the number is a single digit is "+result(num));
	}
}

//output 
//Enter a number 9294
// Sum of digits of 9294 until the number is a single digit is 6

