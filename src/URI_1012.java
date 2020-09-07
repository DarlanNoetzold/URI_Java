

import java.io.IOException;
import java.util.Scanner;

public class URI_1012 {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        
        double arTri = (a*c)/2;
        double arCirc = Math.pow(c, 2)* 3.14159;
        double arTrap = ((a+b)*c)/2;
        double arQuad = b*b;
        double arRet = a*b;
        System.out.printf("TRIANGULO: %.3f", arTri);
        System.out.println();
        System.out.printf("CIRCULO: %.3f", arCirc);
        System.out.println();
        System.out.printf("TRAPEZIO: %.3f", arTrap);
        System.out.println();
        System.out.printf("QUADRADO: %.3f", arQuad);
        System.out.println();
        System.out.printf("RETANGULO: %.3f", arRet);
        System.out.println();
	}
	
}
