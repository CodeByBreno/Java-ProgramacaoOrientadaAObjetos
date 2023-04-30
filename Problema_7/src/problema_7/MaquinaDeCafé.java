
package problema_7;

public class MaquinaDeCafé {
    private int moedas = 0;
    private int valor_inserido = 0;
    private int custo[] = {2, 5, 3};
    
    public int getMoedas (){
        return (this.moedas);
    }
    
    public void introduzirMoeda (int valor){
        this.valor_inserido = valor;
    }
    
    public void botaoCafe (){
        this.prepararBebida(0);
    }
    public void botaoChocolate(){   
        this.prepararBebida(1);
    }
    public void botaoCapuccino(){
        this.prepararBebida(2);
    }
    
    private int prepararBebida (int i){
        if (this.valor_inserido >= this.custo[i]){
            System.out.println("Sua bebida está pronta!");
            this.moedas += this.custo[i];
            this.devolverDinheiro(true, i);
        }
        else{
            System.out.println("O valor inserido não é suficiente para comprar a bebida!");
            this.devolverDinheiro(false, i);
        }
        return (this.valor_inserido - this.custo[i]);
    }
    
    private int devolverDinheiro(boolean suficiente, int i){
        int aux = this.valor_inserido;
        this.valor_inserido = 0;
        
        if (suficiente == true){
            System.out.println("Seu troco é " + (aux - this.custo[i]) + " moedas");
            return (aux - this.custo[i]);
        }
        else{
            System.out.println("...Devolvendo suas " + aux + " moedas");
            return (aux);
        }
    }       
}
