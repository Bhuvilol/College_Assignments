import java.util.Scanner;

class personQ1{
	String name;
	int age;
	public void setData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String a = sc.nextLine();
		this.name = a;
		System.out.println("Enter age");
		int n = sc.nextInt();
		this.age =n;
	}
	public void displayData() {
		System.out.println("Name of the person is "+name);
		System.out.println("Age of the person is "+age);
	}

}

public class Q1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				personQ1 p1 = new personQ1();
				personQ1 p2 = new personQ1();
				p1.name = "Bhabesh Behera";
				p1.age = 21;
				p2.setData();
				p1.displayData();
				p2.displayData();
				System.out.println();
				if (p1.age>p2.age) {
					System.out.println(p1.name+" is older than "+p2.name);
				} else {
					System.out.println(p1.name+" is younger than "+p2.name);
				}

	}
}
