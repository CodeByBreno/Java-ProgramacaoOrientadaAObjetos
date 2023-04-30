
package problema_29;

public class ExpressãoUnária extends Numero{
    int tipo;
    ExpressãoNumérica exp = new ExpressãoNumérica();
    
    @Override
    public int getValor(){
        if (tipo == 1) return (-1*exp.Avaliar());
        ExpressãoQuadrado q = new ExpressãoQuadrado(exp.Avaliar());
        return (q.getValor());
    }
}
