abstract class Marks{
	int markICP;
	int markDSA;
	double percentage;
	abstract double getPercentage();
}
class CSE extends Marks{
	int algoDesign;
	CSE(int a, int b, int c){
		markICP = a;
		markDSA = b;
		algoDesign = c;
	}
	double getPercentage(){
		percentage = ((markICP+markDSA+algoDesign)/3);
		return percentage ;
	}
}
class NonCSE extends Marks{
	int enggMechanics;
	NonCSE(int a, int b, int c){
		markICP = a;
		markDSA = b;
		enggMechanics = c;
	}
	double getPercentage(){
		percentage = (1.0*(markICP+markDSA+enggMechanics)/3) ;
		return percentage;
	}
}
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CSE s1 = new CSE(70,90,88);
		s1.getPercentage();
		System.out.println("Percentage secured by the CSE student : "+s1.percentage);
		NonCSE s2 = new NonCSE(80,69,90);
		s2.getPercentage();
		System.out.println("Percentage secured by the NonCSE student : "+s2.percentage);
	}

}
