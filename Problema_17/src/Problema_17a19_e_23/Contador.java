
package Problema_17a19_e_23;

public class Contador {
    private int valor;
    private int desfeito;
    private int ult_inc, penult_inc;
    
    //métodos getters
    public int getValor (){
        return (this.valor);
    }
    
    //Construtor
    public Contador(){
        this.valor = 0;
        this.desfeito = 0;
        this.ult_inc = 0;
        this.penult_inc = 0;
    }
    
    //métodos pedidos
    public void Incrementar(){
        this.IncrementarValor(1);
    }
    
    public void Desfazer(){
        if (this.desfeito == 2) System.out.println("ERRO!");
        else{
            if (this.desfeito == 0) 
                if (this.valor - this.ult_inc >= 0)
                    this.valor -= this.ult_inc;
            if (this.desfeito == 1)
                if (this.valor - this.penult_inc >= 0)
                    this.valor -= this.penult_inc;
            else System.out.println("ERRO!");
            this.desfeito++;
        }
    }
    
    //métodos pedidos na questão 18 (continuação)
    public void IncrementarValor(int a){
        this.penult_inc = this.ult_inc;
        this.ult_inc = a;
        if (a > 0) this.valor += a;
        else System.out.println("ERRO!");
        if (this.desfeito != 0) this.desfeito--;
    }
    
}
