import java.util.Scanner;

public class URI_1065 {
	public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
			int contador = 0;

			for (int i = 1; i <= 5; i++) {
			    int num = entrada.nextInt();
			    if (num % 2 == 0) {
			        contador += 1;
			    }
			}
			System.out.printf("%d valores pares\n", contador);
		}

    }
}
