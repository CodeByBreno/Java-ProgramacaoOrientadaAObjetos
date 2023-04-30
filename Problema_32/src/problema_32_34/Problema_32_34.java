
package problema_32_34;
import java.util.Scanner;

public class Problema_32_34 {
    
    public static void main(String[] args) {
        ContaExtrato c = new ContaExtrato();
        while (true){
            System.out.println("Insira a opção desejada: \n" +
                    "1 - Realizar uma Operação\n" +
                    "2 - Sacar o Extrato da Conta\n" +
                    "Outro - Sair");
            Scanner ler = new Scanner(System.in);
            switch (ler.nextInt()){
                case 1 -> {
                    c.RealizarOperação();
                }
                case 2 ->{
                    c.getExtrato();
                }
                default ->{
                    break;
                }
            }
        }
    }
}
