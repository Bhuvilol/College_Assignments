import java.util.Scanner;

public class A2HA2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of eggs you have:");
		Scanner sc = new Scanner(System.in);
		int egg = sc.nextInt();
		int gross = egg/144;
		int dozen = (egg%144)/12;
		int lo = (egg%144)%12;
		System.out.println("You have "+gross+" gross,"+dozen+" dozen, "+lo+" leftovers.");
		sc.close();
		}

}
