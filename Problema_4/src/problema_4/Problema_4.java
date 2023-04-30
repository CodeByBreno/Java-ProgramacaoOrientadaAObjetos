
package problema_4;
public class Problema_4 {
    public static void main(String[] args) {
        Banda Detonadores = new Banda ("Detonadores", "Rock");
        CD Bombinha = new CD ("Bombinha", 2009, Detonadores);
        System.out.println("O CD " + Bombinha.getTitulo() + " lançado em " +
                Bombinha.getAno() + " foi o primeiro sucesso da banda " + 
                Bombinha.getBandaAutora().getNome() + "\nhoje um classico da musica "
                + Bombinha.getBandaAutora().getEstilo());
    } 
}
