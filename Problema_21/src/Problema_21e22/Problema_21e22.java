
package Problema_21e22;
import java.util.Scanner;

public class Problema_21e22 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a = ler.nextInt();
        int b = ler.nextInt();
        int quoc = 0;
        int sinal = 1;
        int vl = a;
        
        if (a*b < 0) sinal = -1;
        if (vl < 0) vl = -vl;
        if (b < 0) b = -b;
        
        if (b == 0) System.out.println("ERRO!");
        else{
            while (true){
                vl -= b;
                if (vl == 0) quoc++;
                if (vl <= 0) break;
                quoc++;
            }
            System.out.println(quoc*sinal);
            if (a*b >= 0) System.out.printf("%d\n", a - b*quoc);
            else System.out.printf("%d\n", a + b*quoc);
        }
    }
}
