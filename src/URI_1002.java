
import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */
public class URI_1002 {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
		double pi = 3.14159;
		double raio = input.nextDouble();
		double area = pi * Math.pow(raio, 2);
		System.out.printf("A=%.4f", area);
		System.out.println();
 
    }
 
}