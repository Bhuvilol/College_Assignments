class Distance{
	int m,cm;
	int total;
	
	public Distance(int m, int cm) {
		this.m = m;
		this.cm = cm;
	}
	void display() {
		System.out.println(m+" metres and "+cm+" centimetres.");
	}
	void sum(Distance d1, Distance d2) {
		int totalM = d1.m+d2.m;
		int totalCM = d1.cm+d2.cm;
		totalM += totalCM/100;
		totalCM %= 100;
		System.out.println("Total distance covered = "+totalM+" metres and "+totalCM+" centimetres.");
	}
}
public class HAQ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Distance d1 = new Distance(3,40);
		Distance d2 = new Distance(5,88);
		System.out.println("Distance 1 : ");
		d1.display();
		System.out.println("Distance 2 : ");
		d2.display();
		Distance sum = new Distance(0, 0);
		sum.sum(d1,d2);
	}

}





//output
// Distance 1 : 
// 3 metres and 40 centimetres.
// Distance 2 : 
// 5 metres and 88 centimetres.
// Total distance covered = 9 metres and 28 centimetres.
