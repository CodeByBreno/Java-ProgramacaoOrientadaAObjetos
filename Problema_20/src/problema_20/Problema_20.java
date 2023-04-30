
package problema_20;
import java.util.Scanner;

public class Problema_20 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a = ler.nextInt();
        int b = ler.nextInt();
        int soma = 0;
        if (b < 0) 
            for (int i = 0; i > b; i--) soma -= a;
        else
            for (int i = 0; i < b; i++) soma += a;
        System.out.println("Resultado = " + soma);
    }
}
