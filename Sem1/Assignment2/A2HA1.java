import java.util.Scanner;

public class A2HA1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of minutes: ");

		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();
		
		int yr = min / 525600;
		int day = (min%525600)/1440;
		System.out.println(min+" minutes is approximately "+yr+" years and "+day+" days.");
		sc.close();
	}

}
