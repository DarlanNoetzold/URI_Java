
import java.io.IOException;
import java.util.Scanner;

public class URI_1008 {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
        int b = input.nextInt();
        double c = input.nextDouble();
        double sal = b*c;
        System.out.printf("NUMBER = " + a);
        System.out.println();
        System.out.printf("SALARY = U$ %.2f", sal);
        System.out.println();
	}
}
