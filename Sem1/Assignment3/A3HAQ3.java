import java.util.Scanner;

public class A3HAQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your input");
		int num = sc.nextInt();
		
		String year;
		switch(num) {
		case 1:year = "January";break;
		case 2:year = "February";break;
		case 3:year = "March";break;
		case 4:year = "April";break;
		case 5:year = "May";break;
		case 6:year = "June";break;
		case 7:year = "July";break;
		case 8:year = "August";break;
		case 9:year = "September";break;
		case 10:year = "October";break;
		case 11:year = "November";break;
		case 12:year = "December";break;
		}
		System.out.println("Year = "+year);
	}

}
