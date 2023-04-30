
package problema_46;

public class Arrayinteiros {
    private int N = 10;
    private int[] valores = new int[N];
    
    public Arrayinteiros(int[] vet){
        this.valores = vet;
    }
    
    public void exibir(){
        for(int i = 0; i < N; i++){
            System.out.print(this.valores[i] + " ");
        }
    }
    
    public void inverte(){
        int aux;
        for (int i = 0; i < N/2; i++){
            aux = valores[i];
            this.valores[i] = valores[N-1-i]; 
            this.valores[N-1-i] = aux;
        }
    }
}
