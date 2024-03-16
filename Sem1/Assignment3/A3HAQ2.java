import java.util.Scanner;

public class A3HAQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter today's day: ");
		int in = sc.nextInt();
		System.out.print("Enter the number of days elapsed since today: ");
		int el = sc.nextInt();
		int num = 1;
		String day = "A";
		num = in;
		switch(num) {
		case 0: day = "Sunday";break;
		case 1: day = "Monday";break;
		case 2: day = "Tuesday";break;
		case 3: day = "Wednesday";break;
		case 4: day = "Thursday";break;
		case 5: day = "Friday";break;
		case 6: day = "Saturday";break;
		default: day = "invalid day";
		}
		System.out.print("Today is "+day);
		num = num+(el%7);
		switch(num) {
		case 0: day = "Sunday";break;
		case 1: day = "Monday";break;
		case 2: day = "Tuesday";break;
		case 3: day = "Wednesday";break;
		case 4: day = "Thursday";break;
		case 5: day = "Friday";break;
		case 6: day = "Saturday";break;
		default: day = "invalid day";
		}
		System.out.print(" and the future day is "+day);
		
	}

}
