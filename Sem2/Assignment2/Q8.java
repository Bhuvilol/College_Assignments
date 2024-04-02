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

package sport;

public interface Sports {
	int score1 =5;
	int score2 =10;
}


package sport;

import school.Test;

public class GrandTotal extends Test implements Sports {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int GTmarks,GTscores;
		GrandTotal num = new GrandTotal();
		num.inputDetails();
		num.showDetails();
		GTmarks = num.mark1+num.mark2;
		GTscores = Sports.score1+Sports.score2;
		System.out.println("Total marks : "+GTmarks);
		System.out.println("Total Scores : "+GTscores);
	}

}








// output

// Enter name of the student
// Bhabesh
// Enter roll number of the student
// 23410210
// Enter marks of subject 1
// 92
// Enter marks of subject 2
// 88
// Name : Bhabesh
// Roll number : 23410210
// Marks in subject 1 : 92
// Marks in subject 2 : 88
// Total marks : 180
// Total Scores : 15