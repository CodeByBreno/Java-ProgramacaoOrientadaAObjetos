
package exercicio.pkg6;

public interface Lutador {
    public abstract void Atacar(Criatura c);
    public abstract void ReceberDano(int m, String atacante);
    public abstract void ArmarDefesa();
    public abstract void UsarItem(int d);
    public abstract void Desistir();
    public abstract void ganharLuta();
    public abstract void perderLuta();
    public abstract void empatarLuta();
}
