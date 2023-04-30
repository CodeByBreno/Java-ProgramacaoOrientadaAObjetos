
package ExemploHerança;

public class BebidasGaseificadas extends BebidasDeMarca{
    public int qunt_Gas;
    
    public BebidasGaseificadas(String n, int a, int qa, int qs, int amgz, boolean alc, boolean energ,
    String marca){
        super (n, a, qa, qs, amgz, alc, energ, marca);
        this.qunt_Gas = 100;
    }
    public void abrir(){
        this.qunt_Gas -= 10;
    }
}
