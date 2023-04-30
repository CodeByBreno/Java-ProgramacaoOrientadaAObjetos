
package problema_26;
import java.util.Scanner;

public class Problema_26 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int cont = 0;
        int cont2 = 0;
        double soma = 0;
        double produto = 1;
        while(true){
            double a = ler.nextDouble();
            if (a < 0) break;
            cont++;
            soma += a;
            produto *= a;
            if(a % 2 == 0) cont2++;
        }
        if (cont == 0) System.out.println("Nenhum valor foi entrado!");
        else{
            System.out.println("Foram entrados " + cont + " valores,\nque"
                        + " juntos somaram " + soma + ",\ncujo produto valeu "
                        + produto + ",\ncom valor médio igual a" + soma/cont 
                        + "\ne por fim foram inseridos " + cont2 + " valores pares");
        }
    }
}
