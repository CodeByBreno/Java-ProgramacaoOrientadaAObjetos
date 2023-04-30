
package problema_24e25;
import java.util.Scanner;

public class Problema_24e25 {
    public static void main(String[] args) {
        Calculadora c1 = new Calculadora();
        Scanner ler = new Scanner(System.in);
        while(true){
            System.out.println("Entre com o primeiro numero: ");
            int a = ler.nextInt();
            System.out.println("Escolha a operação a realizar: \n"
            + "( + )Soma   ( - )Subtração   ( * )Multiplicação\n"
            + "( / )Divisão( % )Resto       ( ! )Fatorial");
            ler.nextLine();
            String c = ler.nextLine();
            int b = 1;
            if (c.charAt(0) != '!') 
                b = ler.nextInt();
            switch (c.charAt(0)){
                case '+' -> 
                    System.out.println(c1.Somar(a, b));
                case '-' ->
                    System.out.println(c1.Subtrair(a, b));
                case '*' ->
                    System.out.println(c1.Multiplicar(a, b));
                case '/' ->
                    System.out.println(c1.Dividir(a,b));
                case '%' ->
                    System.out.println(c1.Resto(a,b));
                case '!' ->{
                    int fatorial = c1.fatorial(a);
                    if (fatorial == -1) System.out.println("ERRO!");
                    else System.out.println(fatorial);
                }
                default ->{
                    System.out.println("Finalizando");
                    System.exit(0);
                }
            }
        }
    }
}
