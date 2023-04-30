
package exercicio.pkg6;
public class Exercicio6 {

    public static void main(String[] args) {
        // NOME ITENS HP DANO DEFESA VITORIAS DERROTAS EMPATES CRITICO
        Criatura Goblin = new Criatura       ("Goblin", 2, 35, 5, 2, 2, 2, 1, 5);
        Criatura Lobisomen = new Criatura ("Lobisomem", 0, 80, 15, 8, 5, 0, 1, 8);
        Criatura Elfo = new Criatura           ("Elfo", 5, 40, 12, 6, 4, 2, 3, 3);
        Criatura Robo = new Criatura           ("Robo", 2, 120, 8, 20, 4, 1, 0, 12);
        Criatura Mago = new Criatura           ("Mago", 5, 20, 25, 2, 8, 2, 3, 15);
        Criatura Morcegomem = new Criatura("Morcegomem",0, 35, 10, 5, 2, 5, 1, 5);
        Criatura O_Temivel_Gatinho = new Criatura ("O_Temivel_Gatinho", 12, 22, 5, 6, 3, 2, 1, 40);
        //Combate luta = new Combate(O_Temivel_Gatinho, Lobisomen);
        
        //luta.iniciar();
    }  
}
