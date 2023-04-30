
package Problema_8a16;
public interface MedidorDeTempo {
    public abstract boolean equal(String compara);
    public abstract boolean anterior(String compara);
    public abstract boolean posterior(String compara);
    public abstract void atualizar(String novo);
}
