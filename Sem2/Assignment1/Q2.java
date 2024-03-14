import java.util.Scanner;

public class Q2 {
	public static double bmi(double weight, double height) {
		double bmi = weight/(Math.pow(height, 2));
		return bmi;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your weight in Kg(s)");
		double wt = sc.nextDouble();
		System.out.println("Enter your height in metres");
		double ht = sc.nextDouble();
		if (bmi(wt, ht)<18.5) {
			System.out.println("You are underweight");
		} else if (bmi(wt, ht)<25){
			System.out.println("You have normal weight");
		} else if (bmi(wt, ht)<30) {
			System.out.println("You are overweight");
		} else {
			System.out.println("You are obese");
		}
	}

}
