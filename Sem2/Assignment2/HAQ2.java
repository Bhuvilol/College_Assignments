import java.util.Scanner;

class Book{
	String BName;
	int BEdition;
	double BPrice;
	public Book(String a, int b, double c) {
		BName = a;
		BEdition = b;
		BPrice = c;
	}
	public void display() {
		System.out.println("Name of book : "+BName);
		System.out.println("Edition of the book : "+BEdition);
		System.out.println("Price of the book is : "+BPrice);
	}
}
public class HAQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Book[] book = new Book[5];
		for (int i = 0; i < book.length; i++) {
			System.out.println("Enter the details of the book "+(i+1)+" :");
			System.out.println("Enter the name of book");
			String name = sc.nextLine();
			System.out.println("Enter the edition of the book");
			int edition = sc.nextInt();
			System.out.println("Enter the price of the book");
			double price = sc.nextDouble();
			book[i] = new Book(name,edition,price);
			sc.nextLine();
		}
		Book mprice = book[0];
		for (int i = 0; i < book.length; i++) {
			if (book[i].BPrice>mprice.BPrice) {
				mprice = book[i];
			}
		}
		System.out.println("\nBook having maximum price is :");
		mprice.display();
	}

}
