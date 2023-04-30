
package problema_29;

public class Pilha {
    private int vet[];
    private int tamanho;
    private int topo;
    
    public Pilha(){
        vet = new int[5];
        tamanho = 5;
        topo = 0;
    }
    public void push(int valor){
        if ((topo+1)%5 == 0) this.realocar();
        this.vet[topo++] = valor;
    }
    public void pop(){
        this.topo--;
    }
    public int top(){
        return (vet[topo]);
    }
    public int top_pop(){
        int aux = this.top();
        this.pop();
        return (aux);
    }
    private void realocar(){
        int aux[] = new int[tamanho];
        aux = vet;
        tamanho +=5;
        this.vet = new int[tamanho];
        vet = aux;
    }
            
}
