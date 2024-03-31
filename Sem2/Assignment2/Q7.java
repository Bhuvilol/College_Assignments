interface DetailInfo{
	void display();
	int count();
}
class people implements DetailInfo{
	static int maxcount;
	String name;
	people(String name) {
		this.name = name;
	}
	public void display() {
		System.out.println("Name of person = "+name);
		System.out.println("No. of character name comtains = "+maxcount);
	}
	public int count() {
		maxcount = name.length();
		return maxcount;
	}
}
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		people p1 = new people("Bhabesh");
		p1.count();
		p1.display();
		people p2 = new people("Nibedita");
		p2.count();
		p2.display();
	}

}







//output
// Name of person = Bhabesh
// No. of character name comtains = 7
// Name of person = Nibedita
// No. of character name comtains = 8

