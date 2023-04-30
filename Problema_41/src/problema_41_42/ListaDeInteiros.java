
package problema_41_42;
import java.util.Scanner;

public class ListaDeInteiros {
    public int N = 10;
    private int[] elementos = new int[N];
    private int proxima;
    
    public int getValue (int i){
        return (this.elementos[i]);
    }
    public void setLista(){
        System.out.println("Insira os elementos da lista\n");
        Scanner ler = new Scanner(System.in);
        for (int i = 0; i < N; i++){
            this.elementos[i] = ler.nextInt();
        }
    }
    public int[] elementos_sem_repetição(){
        int vet[] = new int[N];
        boolean flag = true;
        int c = 0;
        int aux[] = new int[N];
        for (int i = 0; i < N; i++){
            for (int j = 0; j < vet.length; j++, flag = true){
                if (this.elementos[i] == vet[j]){
                    flag = false;
                    break;
                }
            }
            if (flag) vet[c++] = this.elementos[i];
        }
        return vet;
    }
    public Resultado Dividir(int controle){
        Resultado resp = new Resultado();
        for (int i = 0; i < N; i++){
            if (this.elementos[i] > controle) resp.add_maior(this.elementos[i]);
            if (this.elementos[i] < controle) resp.add_menor(this.elementos[i]);
            if (this.elementos[i] == controle) resp.add_igual(this.elementos[i]);
        }
        return resp;
    }
}