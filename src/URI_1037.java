import java.io.IOException;
import java.util.Scanner;

public class URI_1037 {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        
        if(a >= 0 && a <=25.000) System.out.println("Intervalo [0,25]");
        else if(a >= 25.01 && a <= 50.000) System.out.println("Intervalo (25,50]");
        else if(a >= 50.01 && a <= 75.000) System.out.println("Intervalo (50,75]");
        else if(a >= 75.01 && a <= 100.00) System.out.println("Intervalo (75,100]");
        else System.out.println("Fora de intervalo");
	}
}