class deposit{
	long principal;
	int time;
	double rate;
	double totalAmount;
	deposit(){
		this.principal=50000;
		this.time=2;
		this.rate=11;
	}
	deposit(long a, int b, double c){
		this.principal=a;
		this.time=b;
		this.rate=c;
	}
	deposit(long a, int b){
		this.principal=a;
		this.time=b;
		this.rate=10.6;
	}
	deposit(long a, double b){
		this.principal=a;
		this.time=2;
		this.rate = b;
	}
	void display(){
		System.out.println("Principal : "+principal);
		System.out.println("Rate : "+rate);
		System.out.println("time : "+time);
	}
	double calcAmt() {
		totalAmount = principal+(principal*rate*time)/100;
		return totalAmount;
	}
}
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		deposit d1 = new deposit();
		d1.display();
		System.out.println("Total amount:"+d1.calcAmt()+"\n");
		
		deposit d2 = new deposit(10000,5,10);
		d2.display();
		System.out.println("Total amount:"+d2.calcAmt()+"\n");
		
		deposit d3 = new deposit(50000,2);
		d3.display();
		System.out.println("Total amount:"+d3.calcAmt()+"\n");
		
		deposit d4 = new deposit(40000,8.5);
		d4.display();
		System.out.println("Total amount:"+d4.calcAmt()+"\n");
		
	}

}







//output
// Principal : 50000
// Rate : 11.0
// time : 2
// Total amount:61000.0

// Principal : 10000
// Rate : 10.0
// time : 5
// Total amount:15000.0

// Principal : 50000
// Rate : 10.6
// time : 2
// Total amount:60600.0

// Principal : 40000
// Rate : 8.5
// time : 2
// Total amount:46800.0

