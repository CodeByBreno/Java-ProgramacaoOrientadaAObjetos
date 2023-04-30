
package problema_32_34;

public class Conta {
    protected double saldo;
    protected long numero;
    
    public void creditar (double entrada){
        this.saldo += entrada;
    }
    public void debitar (double entrada){
        this.saldo -= entrada;
    }
    
}
