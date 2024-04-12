import java.util.Scanner;

class Commission{
	double sales;
	public Commission(double sales) {
		this.sales = sales;
	}
	double getCommission(){
		if (sales<100) {
			return 0.02*sales;
		} else if(sales>500 && sales<5000){
			return 0.05*sales;
		} else if(sales>=5000){
			return 0.08*sales;
		} else {
			return 0;
		}
	}
}
public class HAQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount of sales:");
		
		double s1 = sc.nextDouble();
		Commission c1 = new Commission(s1);
		if (s1<0) {
			System.out.println("Invalid Input");
		} else {
			System.out.println("Commission paid is : "+c1.getCommission());
		}
	}

}








//output
// Enter the amount of sales:
// 40000
// Commission paid is : 3200.0
