class product{
	String prodID;
	double price;
	int quantity;
	void display(){
		System.out.println("Product ID is "+prodID);
		System.out.println("Total quantity ordered = "+quantity);
		System.out.println("Price of one product = "+price);
		System.out.println("Total price of "+prodID+" is "+ (quantity*price));
		System.out.println();
	}
	static double totalPrice; //always associated with class not with object created
	product(String pID,double price,int amount){
		this.prodID = pID;
		this.price = price;
		this.quantity=amount;
	}
}
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
		product p1 = new product("abc123",50,100);
		p1.display();
		product p2 = new product("xyz999",20,66);
		p2.display();
		product p3 = new product("bha2003",39,50);
		p3.display();
		System.out.println("Total price to be paid by customer :");
		product.totalPrice=p1.price*p1.quantity + p2.price*p2.quantity + p3.price*p3.quantity;
		System.out.println(product.totalPrice);
	}

}

