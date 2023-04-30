
package problema_32_34;

public class EntradaExtrato {
    private String data;
    private double valor;
    private String operação;
    
    //getters
    public String getData(){
        return (this.data);
    }
    public double getValor(){
        return (this.valor);
    }
    public String getOperação(){
        return (this.operação);
    }
    
    //setters
    public void setData(String data){
        this.data = data;
    }
    public void setValor (double v){
        this.valor = v;
    }
    public void setOperação (String op){
        this.operação = op;
    }
}
