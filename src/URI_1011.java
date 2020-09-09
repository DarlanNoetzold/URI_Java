import java.io.IOException;
import java.util.Scanner;

public class URI_1011 {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
        double raio = input.nextDouble();
        
        double area = (4/3.0) * 3.14159 * Math.pow(raio, 3);
        
        System.out.printf("VOLUME = %.3f", area);
        System.out.println();
	}
	
}
