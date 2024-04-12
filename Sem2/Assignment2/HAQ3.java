class Bank{
	String bankNname;
	int depositAamount;
	static int totalAamount=0;
	void setBankName(String a) {
		this.bankNname=a;
	}
	void setAmount(int b) {
		this.depositAamount=b;
		totalAamount+=b;
	}
	void show() {
		System.out.println("BankName : "+bankNname);
		System.out.println("Depositted amount : "+depositAamount);
	}
	static void minDep(Bank[] b) {
		double minDepo = Double.MAX_VALUE;
		String minBank ="";
		for (Bank x : b) {
			if (x.depositAamount<minDepo) {
				minDepo=x.depositAamount;
				minBank=x.bankNname;
			}
		}
		System.out.println("Bank with minimum deposit : "+minBank+" having deposit = "+minDepo);
	}
}
public class HAQ3{
	public static void main(String[] args) throws Exception{
		Bank[] b = new Bank[3];
		b[0]=new Bank();
		b[0].setBankName("Mahindra");
		b[0].setAmount(10000);
		
		b[1]=new Bank();
		b[1].setBankName("Kotak");
		b[1].setAmount(20000);
		
		b[2]=new Bank();
		b[2].setBankName("ICICI");
		b[2].setAmount(30000);
		
		for (int i = 0; i < b.length; i++) {
			b[i].show();
		}
		
		System.out.println("Total amount deposited = "+Bank.totalAamount);
		Bank.minDep(b);
	}
}







//output
// BankName : Mahindra
// Depositted amount : 10000
// BankName : Kotak
// Depositted amount : 20000
// BankName : ICICI
// Depositted amount : 30000
// Total amount deposited = 60000
// Bank with minimum deposit : Mahindra having deposit = 10000.0
