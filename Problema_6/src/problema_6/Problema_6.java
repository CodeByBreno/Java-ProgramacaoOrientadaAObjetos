
package problema_6;

public class Problema_6 {

    public static void main(String[] args) {
        PainelAtendimento p1 = new PainelAtendimento(7);
        System.out.println("O dia acabou de começar, o atendente " + p1.getAtendente() +
                            " é quem está atendendo o pedido da ficha " + p1.getFichaAtual());
        for (int i = 0; i < 52; i++) p1.indicarProximo(i%8);
        System.out.println("Agora é o atendente " + p1.getAtendente() 
                            + " que está atendendo o ultimo pedido da ficha " +
                            p1.getFichaAtual() + "\nApós mais " + p1.getProximas() 
                            + " fichas a contagem será reiniciada");
        
    }
}
