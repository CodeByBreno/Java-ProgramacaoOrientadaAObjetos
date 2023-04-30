
package problema_45;

public class Problema_45 {

    public static void main(String[] args) {
        ConjuntoDeStrings c = new ConjuntoDeStrings();
        c.exibir();
        System.out.println();
        String vet[] = {"Lucario", "Slaking", "Seagull", "Starmie", "Pikachu", "Cacturne"};
        c.Dividir(vet);
        System.out.println();
        c.exibir();
    }
}
