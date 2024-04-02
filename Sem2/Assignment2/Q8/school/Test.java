package school;

import java.util.Scanner;

public class Test extends Student{
	protected int mark1;
	protected int mark2;
	Scanner sc = new Scanner(System.in);
	protected void inputDetails() {
		super.inputDetails();
		System.out.println("Enter marks of subject 1");
		mark1 = sc.nextInt();
		System.out.println("Enter marks of subject 2");
		mark2 = sc.nextInt();
	}
	protected void showDetails() {
		super.showDetails();
		System.out.println("Marks in subject 1 : "+mark1);
		System.out.println("Marks in subject 2 : "+mark2);
	}
}
