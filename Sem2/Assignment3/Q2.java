
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        String[] C = new String[4];
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter four colors:");
            for (int i = 0; i < 4; i++) {
                C[i] = sc.nextLine();
            }

            System.out.println("Convert string to integer:");
            Integer.parseInt(C[0]);

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }

        try {
            System.out.println("Enter one more color:");
            C[4] = sc.nextLine();

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
            System.out.println("The colors entered are:");
            for (int i = 0; i < C.length; i++) {
                System.out.println(C[i]);
            }
        }
    }
}
