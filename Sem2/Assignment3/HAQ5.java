
public class HAQ5 {
	public static String rev(String s) {
		if (s.isEmpty()) {
			return s;
		}
		return rev(s.substring(1))+s.charAt(0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rev("pots&pans"));
	}

}
