
package problema_36;
import java.util.Scanner;

public class Problema_36 {

   
    public static void main(String[] args) {
        int c = 1,  max = 0;
        String texto = null, ant = null, atual = null;
        Scanner ler = new Scanner(System.in);
        
        while (true){
            ant = atual;
            atual = ler.nextLine();
            if (atual.equals(ant)) break;
            if (ant == null) texto = atual;
            else texto = texto.concat(atual);
            c++;
            if (atual.length() > max) max = atual.length();
        }
        System.out.println(texto + " -- " + c + " -- " + max);
        
        
    }
    
}
