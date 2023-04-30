
package ExemploHerança;

public class Sucos extends Bebidas{
    public String fruta; //guarda a ultima fruta adicionada na mistura
    public String sabor; //combina todas as frutas num sabor unico
    
    public Sucos(String n, int a, int qa, int qs, int amgz, boolean energ, String f, String s){
        super(n, a, qa, qs, amgz, false, energ);
        this.fruta = f;
        this.sabor = s;
    }
    public void preparar(String fruta, String sabor){
        this.fruta = fruta;
        this.sabor = sabor;
    }
    public void adicionar(String fruta){
        this.fruta = fruta;
        this.sabor = this.sabor.concat(" com " + fruta);
    }
}
