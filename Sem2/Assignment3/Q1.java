import java.util.Scanner;

public class Q1 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
            		System.out.print("Enter your lucky number: ");
            		int luckyNumber = sc.nextInt();
            		if (luckyNumber < 0) {
               			throw new NumberFormatException("Negative number not allowed");
            		}
            		System.out.println("Your lucky number is: " + luckyNumber);
        	} catch (NumberFormatException e) {
            		System.out.println(e);
        	} finally {
            		sc.close();
        	}
	}

}








//output
// Enter your lucky number: -90
// java.lang.NumberFormatException: Negative number 
