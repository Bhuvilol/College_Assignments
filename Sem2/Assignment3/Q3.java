import java.util.Scanner;

class MarksOutOfBoundException extends Exception{
	public MarksOutOfBoundException(String message) {
		super(message);
	}
}
class Student{
	String name;
	int marks;
	Student(String a, int m)  {
		name=a;
		marks=m;
	}
}
public class Q3 {

	public static void main(String[] args) throws MarksOutOfBoundException{
		// TODO Auto-generated method stub
		Student s1 = new Student("Bhabesh", 45);
		System.out.println("Student name : "+s1.name+"\nmarks : "+s1.marks);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sahil's marks");
		int m = sc.nextInt();
		if (m>100) {
			throw new MarksOutOfBoundException("Marks cannot be greater than 100");
		} else {
			Student s2 = new Student("Sahil", m);
			System.out.println("Student name : "+s2.name+"\nmarks : "+s2.marks);
		}
	}
}
