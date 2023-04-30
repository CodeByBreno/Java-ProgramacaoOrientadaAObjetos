
package ExemploHerança;

public class Bebidas {
    private int acidez;
    private int quant_Açucar;
    private int quant_Sal;
    private int amarguez;
    private String Nome;
    private boolean ehAlcoolica;
    private boolean ehEnergetica;

    public Bebidas (String n, int a, int qa, int qs, int amgz, boolean alc, boolean energ){
        this.Nome = n;
        this.acidez = a;
        this.quant_Açucar = qa;
        this.quant_Sal = qs;
        this.amarguez = amgz;
        this.ehAlcoolica = alc;
        this.ehEnergetica = energ;
    }
    public void misturar (Bebidas b){ //coloca nessa bebida o resultado da mistura
        this.acidez += b.getAcidez();
        this.quant_Açucar += b.getQuant_Açucar();
        this.quant_Sal += b.getQuant_Sal();
        this.amarguez += b.amarguez;
        if (b.isEhAlcoolica() || ehAlcoolica) this.setEhAlcoolica(true);
        if (b.isEhEnergetica() || ehEnergetica) this.setEhEnergetica(true);
    }
    public int getAcidez() {
        return acidez;
    }

    public void setAcidez(int acidez) {
        this.acidez = acidez;
    }

    public int getQuant_Açucar() {
        return quant_Açucar;
    }

    public void setQuant_Açucar(int quant_Açucar) {
        this.quant_Açucar = quant_Açucar;
    }

    public int getQuant_Sal() {
        return quant_Sal;
    }

    public void setQuant_Sal(int quant_Sal) {
        this.quant_Sal = quant_Sal;
    }

    public int getAmarguez() {
        return amarguez;
    }

    public void setAmarguez(int amarguez) {
        this.amarguez = amarguez;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public boolean isEhAlcoolica() {
        return ehAlcoolica;
    }

    public void setEhAlcoolica(boolean ehAlcoolica) {
        this.ehAlcoolica = ehAlcoolica;
    }

    public boolean isEhEnergetica() {
        return ehEnergetica;
    }

    public void setEhEnergetica(boolean ehEnergetica) {
        this.ehEnergetica = ehEnergetica;
    }
    
    
    
}
