import java.util.Scanner;

public class A3Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the amount of units consumed ");
		Scanner sc= new Scanner(System.in);
		int units = sc.nextInt();
		double tariff;
		if(units<=50) {
			tariff=units*3.0;
		}
		else if(units<=200) {
			tariff=(50*3)+(units-50)*4.8;
		}
		else if(units<=400) {
			tariff=(50*3.0)+(150*4.8)+(units-200)*4.8;
		}
		else {
			tariff=(50*3.0)+(150*4.8)+(5.8*200)+(units-400)*6.2;
		}
		System.out.println("Total tariff= "+tariff);
		sc.close();
	}

}
