
package Problema_17a19_e_23;
import java.util.Scanner;

public class Problema_17a19_e_23 {
    public static void main(String[] args) {
        Contador c1 = new Contador();
        while(true){
            System.out.println("Contador = " + c1.getValor());
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Incrementa o Contador em 1");
            System.out.println("2 - Incremento o Contador em um valor de entrada");
            System.out.println("3 - Desfaz a última ação (max duas vezes");
            System.out.println("4 - Finaliza a execução");
            Scanner ler = new Scanner(System.in);
            int a = ler.nextInt();
            switch (a){
                case 1 -> c1.Incrementar();
                case 2 -> c1.IncrementarValor(ler.nextInt());
                case 3 -> c1.Desfazer();
                default -> System.exit(0);
            }
        }
    }
}
