
package problema_29;

public class ExpressãoBinária extends Numero{
    protected int A;
    protected int B;
    Character tipo;
    
    public ExpressãoBinária(int A, int B, Character tipo){
        this.A = A;
        this.B = B;
        this.tipo = tipo;
    } 
    
    @Override
    public int getValor() {
        switch (tipo){
            case '+' ->{
                return (A + B);
            }
            case '-' ->{
                return (A - B);
            }
            case '*' ->{
                return (A * B);
            }
            case '/' ->{
                return (A / B);
            }
            case '^' ->{
                for (int i = 0; i < B; i++){
                    A *= A;
                }
                return A;
            }
            default ->{
                return(1);
            }
        }
    }
}
