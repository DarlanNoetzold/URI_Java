

import java.io.IOException;
import java.util.Scanner;

public class URI_1013 {
		public static void main(String[] args) throws IOException {
			Scanner input = new Scanner(System.in);
	        int a = input.nextInt();
	        int b = input.nextInt();
	        int c = input.nextInt();
	        int maior1 = (a + b + Math.abs(a-b))/2;
	        int maior2 = (maior1 + c + Math.abs(maior1-c))/2;
	        
	        System.out.println(maior2+" eh o maior");
		}
	
}
