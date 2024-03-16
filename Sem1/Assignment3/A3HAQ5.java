
import java.util.*;
public class A3HAQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("What is your gender(M or F):");
		Scanner sc = new Scanner(System.in);
		char gender = sc.next().charAt(0);
		System.out.print("First name: ");
		String fn = sc.next();
		System.out.print("Last name: ");
		String ln = sc.next();
		System.out.print("Age: ");
		int age = sc.nextInt();
		if((gender=='f')||(gender=='F')){
			if(age>=20) {
				System.out.print("Are you married, "+fn+" (y or n)?");
				char mar = sc.next().charAt(0);
				if((mar=='n')||(mar=='N')) 	System.out.println("Then I shall call you Ms. "+fn+" "+ln+".");
				else if((mar=='y')||(mar=='Y'))System.out.println("Then I shall call you Mrs. "+fn+" "+ln+".");
				else System.out.println("Invalid input.");
			}
			else System.out.println("Then I shall call you "+fn+" "+ln+".");
			
		}
		else if((gender=='m')||(gender=='M')) {
			if(age>=20) System.out.println("Then I shall call you Mr. "+fn+" "+ln+".");
			else System.out.println("Then I shall call you "+fn+" "+ln+".");
		}
		else System.out.println("Invalid input");
		sc.close();
	}

}
