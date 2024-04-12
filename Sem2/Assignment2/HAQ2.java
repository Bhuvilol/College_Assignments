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








// output
// Enter the details of the book 1 :
// Enter the name of book
// bhabesh
// Enter the edition of the book
// 2
// Enter the price of the book
// 4000

// Enter the details of the book 2 :
// Enter the name of book
// LIKU
// Enter the edition of the book
// 3
// Enter the price of the book
// 2499

// Enter the details of the book 3 :
// Enter the name of book
// Ritesh
// Enter the edition of the book
// 1
// Enter the price of the book
// 500

// Enter the details of the book 4 :
// Enter the name of book
// Nibedita
// Enter the edition of the book
// 4
// Enter the price of the book
// 2400

// Enter the details of the book 5 :
// Enter the name of book
// Rishi
// Enter the edition of the book
// 3
// Enter the price of the book
// 6000

// Book having maximum price is :
// Name of book : Rishi
// Edition of the book : 3
// Price of the book is : 6000.0
