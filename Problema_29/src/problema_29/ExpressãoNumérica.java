
package problema_29;
import java.util.ArrayList;

public class ExpressãoNumérica extends Numero{
    String exp;
    ArrayList<Integer> numeros = new ArrayList();
    ArrayList<Character> operadores = new ArrayList();
    ArrayList<Character> infix = new ArrayList();
    
    public void setExp (String exp){
        this.exp = exp;
    }
    public String Impress(){
        return (this.exp);
    }
    public int Avaliar(){
        Pilha valores = new Pilha();
        int controle = 0;
        for (int i = 0; i < exp.length; i++){
            if ()
        }
    }

    @Override
    public int getValor() {
        return (this.Avaliar());
    }
}
