
package exercício.pkg5;

public class Exercício5 {

    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.Status();
        c.liga();
        c.proxCanal();
        for (int i = 0; i < 50; i++)
            c.menosVolume();
        c.Status();
    }    
}
