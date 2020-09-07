import java.io.IOException;
import java.util.Scanner;

public class URI_1020 {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int ano = 0;
        int mes = 0;
        
        while(a>=365) {
        	a -= 365;
        	ano = ano +1;
        }
        while(a>=30) {
        	a -= 30;
        	mes = mes+1;
        }
        while(mes>=12) {
        	mes -= 12;
        	ano = ano+1;
        }
        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(a + " dia(s)");
	}
 
}
