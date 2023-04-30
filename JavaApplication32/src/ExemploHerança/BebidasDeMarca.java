
package ExemploHerança;

public class BebidasDeMarca extends Bebidas{
    private String Marca; 
    private int Preço;
    private String Recipiente; //garrafa, copo, latinha, etc//garrafa, copo, latinha, etc

    public BebidasDeMarca(String n, int a, int qa, int qs, int amgz, boolean alc, boolean energ,
    String marca){
        super(n, a, qa, qs, amgz, alc, energ);
        this.Marca = marca; //só mudei a marca, para ficar mais fácil de entender
    }
    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getPreço() {
        return Preço;
    }

    public void setPreço(int Preço) {
        this.Preço = Preço;
    }

    public String getRecipiente() {
        return Recipiente;
    }

    public void setRecipiente(String Recipiente) {
        this.Recipiente = Recipiente;
    }
    
}
