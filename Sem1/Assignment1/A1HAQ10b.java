
public class A1HAQ10b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int w=1,g=2,k=3,a=4;
		System.out.println("Before exchanging:\nW="+w+"\nG="+g+"\nK="+k+"\nA="+a);
		w=w+g;
		g=w-g;
		w=w-g;
		
		g=g+k;
		k=g-k;
		g=g-k;
		
		k=k+a;
		a=k-a;
		k=k-a;
		System.out.println("After exchanging:\nW="+w+"\nG="+g+"\nK="+k+"\nA="+a);
	}

}
