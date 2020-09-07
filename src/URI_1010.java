package URI_1010;


import java.io.IOException;
import java.util.Scanner;

public class URI_1010 {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
        int cod1 = input.nextInt();
        int numPec1 = input.nextInt();
        double valPec1 = input.nextDouble();
        int cod2 = input.nextInt();
        int numPec2 = input.nextInt();
        double valPec2 = input.nextDouble();
        
        double valPag = (numPec1 * valPec1) + (numPec2 * valPec2);
        
        System.out.printf("VALOR A PAGAR: R$ %.2f", valPag);
        System.out.println();
	}
	
}