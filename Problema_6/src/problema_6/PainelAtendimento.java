
package problema_6;

public class PainelAtendimento {
    private int prox_ficha;
    private int atend_livre;
    
    public PainelAtendimento(int atendente){
        this.Inicializar(atendente);
    }
    
    private void Inicializar (int primeiro_atend){
        this.atend_livre = primeiro_atend;
        this.prox_ficha = 1;
    }
    
    public void indicarProximo (int prox_atend){
        this.atend_livre = prox_atend;
        if (this.prox_ficha != 99) this.prox_ficha++;
        else this.prox_ficha = 0;
    }
    
    public int getProximas (){
        return (99 - this.prox_ficha);
    }
    
    public int getFichaAtual (){
        return (this.prox_ficha);
    }
    
    public int getAtendente (){
        return (this.atend_livre);
    }
}
