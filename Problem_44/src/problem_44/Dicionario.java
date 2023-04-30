
package problem_44;
import java.util.Scanner;

public class Dicionario {
    private String[] palavras;
    private int proxima = 0;
    private int tamanho = 0;
    
    public void Controlador(){
        Scanner ler = new Scanner (System.in);
        while (true){
            this.exibir(palavras);
            System.out.println("O que deseja fazer?\n" +
                    "1 - Adicionar uma palavra\n" +
                    "2 - Buscar palavras com certa letra\n" +
                    "Outro - Finalizar");
            switch (ler.nextInt()){
                case 1 -> {
                    System.out.println("Insira a palavra: ");
                    this.add(ler.next());
                }
                case 2 -> {
                    System.out.println("Insira a letra inicial: ");
                    String resultado[] = this.selecionar_palavras(ler.next().charAt(0));
                    exibir(resultado);
                }
                default -> {
                    return;
                }
            }
        }
    }
    public void add(String n){
        if (tamanho%5 == 0) this.realocar();
        this.palavras[proxima++] = n;
        this.palavras[proxima] = "0";
    }
    private void realocar(){
        String aux[] = new String[tamanho];
        for (int i = 0; i < tamanho; i++) aux[i] = palavras[i];
        this.tamanho += 5;
        this.palavras = new String[tamanho];
        for (int i = 0; i < tamanho-5; i++) this.palavras[i] = aux[i];
    }
    
    public String[] selecionar_palavras (char c){
        String letra = new String();
        letra = letra.valueOf(c);
        String selecionadas[] = new String[proxima];
        int j = 0;
        for (int i = 0; i < proxima; i++){
            if (palavras[i].startsWith(letra)){
                selecionadas[j++] = palavras[i];
            }
        }
        selecionadas[j] = "0";
        return selecionadas;
    }
    private void exibir(String[] n){
        for (int i = 0; !n[i].equals("0"); i++){
            System.out.println(n[i]);
        }
        System.out.println();
    }
}
