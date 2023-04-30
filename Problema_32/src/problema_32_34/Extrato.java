
package problema_32_34;
import java.util.ArrayList;

public class Extrato {
    protected ArrayList<EntradaExtrato> entradas = new ArrayList();
    
    public java.util.Iterator getIterator (){
        return (entradas.iterator());
    }
}
