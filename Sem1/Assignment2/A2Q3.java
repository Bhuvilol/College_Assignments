
public class A2Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bs = 15600;
		System.out.println("Enter basic salary: "+bs);
		float da = (float)(bs*0.4);
		float hra = (float)(bs*0.2);
		int gs = (int)(bs+da+hra);
		System.out.println("DA is "+da+"\nHRA is "+hra+"\nGross salary is "+gs);
	}

}
