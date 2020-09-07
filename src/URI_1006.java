import java.io.IOException;
import java.util.Scanner;

public class URI_1006 {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double media = ((a*2) + (b*3) + (c*5))/10;
        System.out.printf("MEDIA = %.1f", media);
        System.out.println();
	}
}
