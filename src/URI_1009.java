
import java.io.IOException;
import java.util.Scanner;

public class URI_1009 {
	public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);
        String nome = entrada.nextLine();
        double salario = entrada.nextDouble();
        double bonus = entrada.nextDouble();
        double salariobonus = (salario+(bonus*0.15));
        System.out.printf("TOTAL = R$ %.2f\n",salariobonus);
	}
}