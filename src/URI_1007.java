
import java.io.IOException;
import java.util.Scanner;

public class URI_1007 {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int media = (a*b) - (c*d);
        System.out.printf("DIFERENCA = " + media);
        System.out.println();
	}
}

