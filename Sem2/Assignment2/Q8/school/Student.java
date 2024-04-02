package school;

import java.util.Scanner;

public class Student {
	String name;
	int roll;
	Scanner sc = new Scanner(System.in);
	void inputDetails() {
		System.out.println("Enter name of the student");
		name = sc.nextLine();
		System.out.println("Enter roll number of the student");
		roll = sc.nextInt();
	}
	void showDetails() {
		System.out.println("Name : "+name);
		System.out.println("Roll number : "+roll);
	}
}
