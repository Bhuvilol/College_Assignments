import java.util.Scanner;

class complex{
	int real;
	int imag;
	void setData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of real part");
		real = sc.nextInt();
		System.out.println("Enter value of imaginary part");
		imag = sc.nextInt();
	}
	void display() {
		System.out.println(real+"+"+imag+"j");
	}
	complex add(complex c1 , complex c2) {
		complex c3 = new complex();
		c3.real=c1.real+c2.real;
		c3.imag =c1.imag+c2.imag;
		return c3;
	}
}
public class Q2 {
	public static void main(String[] args) {
		complex c1 = new complex();
		c1.real=2;
		c1.imag=5;
		c1.display();

		complex c2 = new complex();
		c2.setData();
		c2.display();
		
		complex c = new complex();
		c = c.add(c1, c2);
		System.out.println("Addition of c1 and c2 is ");
		c.display();
	}
	
}








//output
// 2+5j
// Enter value of real part
// 6
// Enter value of imaginary part
// 9
// 6+9j
// Addition of c1 and c2 is 
// 8+14j
