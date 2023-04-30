
package problema_29;

public class ExpressãoQuadrado extends Numero {
    
    public ExpressãoQuadrado(int valor){
        this.valor = valor;
    }
    
    @Override 
    public int getValor(){
        return (valor*valor);
    }
}
