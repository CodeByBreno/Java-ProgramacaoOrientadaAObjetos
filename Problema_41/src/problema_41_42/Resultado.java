
package problema_41_42;

public class Resultado {
    public int N = 10;
    private int[] maiores = new int[N];
    private int a = 0;
    private int[] menores = new int [N];
    private int b = 0;
    private int[] iguais = new int[N];
    private int c = 0;
    
    public int getMaior(int i){
        return (maiores[i]);
    }
    public int getMenor(int i){
        return (menores[i]);
    }
    public int getIguais(int i){
        return (iguais[i]);
    }
    public void add_maior(int v){
        this.maiores[a] = v;
        this.a++;
    }
    public void add_menor(int v){
        this.menores[b] = v;
        this.b++;
    }
    public void add_igual(int v){
        this.iguais[c] = v;
        this.c++;
    }
}
