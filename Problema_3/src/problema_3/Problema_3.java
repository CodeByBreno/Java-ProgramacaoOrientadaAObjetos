
package problema_3;
public class Problema_3 {
    public static void main(String[] args) {
        Partida_de_Futebol Campeonato_Nacional = new Partida_de_Futebol("Flamengo", "Palmeiras", 3, 1);
        System.out.println("Vencedor = " + Campeonato_Nacional.Vencedor());
        System.out.println("Placar final = " + Campeonato_Nacional.NumeroDeGols("Flamengo") +
                " X " + Campeonato_Nacional.NumeroDeGols("Palmeiras"));
    }
}
