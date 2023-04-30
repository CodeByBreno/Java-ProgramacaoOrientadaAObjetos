
package problema_37;
import java.util.ArrayList;
import java.util.Scanner;

public class Problema_37 {

    public static void main(String[] args) {
        int c = 1, max = 0;
        String texto = null;
        ArrayList<String> frases = new ArrayList();
        Scanner ler = new Scanner (System.in);
        
        while(true){
            String aux = ler.nextLine();
            if (aux.length() > max) max = aux.length();
            c++;
            if (!frases.contains(aux)){
               frases.add(aux);
               if (frases.size() >= 15){
                    frases.remove(0);
                    for (int i = 0; i < 14; i++){
                        frases.set(i,frases.get(i+1));
                    }
                    frases.set(14, null);
               }
               if (frases.size() == 1) texto = aux;
               else texto = texto.concat(aux);
            }
            else{
                System.out.println(texto + " -- " + c + " -- " + max);
                break;
            }
        }
    }
}
