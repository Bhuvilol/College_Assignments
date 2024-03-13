
public class A1HAQ10a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int w=1,g=2,k=3,a=4,b;
		System.out.println("Before exchanging:\nW="+w+"\nG="+g+"\nK="+k+"\nA="+a);
		b=w;
		w=a;
		a=k;
		k=g;
		g=b;
		System.out.println("After exchanging:\nW="+w+"\nG="+g+"\nK="+k+"\nA="+a);
	}

}
