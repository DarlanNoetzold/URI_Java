import java.io.IOException;
import java.util.Scanner;

public class URI_1004 {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
        int b = input.nextInt();
        int prod = a*b;
        System.out.printf("PROD = " + prod);
        System.out.println();
	}
}
