
public class HAQ4 {
	public static int mul(int num,int m) {
		if (m==0) {
			return 0;
		}
		return num+mul(num, m-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mul(2, 3));
	}

}
