
package ExemploHerança;

public class ExemploHerança {

    public static void main(String[] args) {
        BebidasGaseificadas Coca = new BebidasGaseificadas("Coca", 
        15, 50, 20, 5, false, true, "Coca-cola");
        //usando os métodos da classe ancestral
        System.out.println("Acidez: " + Coca.getAcidez() +
                "\nQuantidade de Sal na bebida: " + Coca.getQuant_Sal());
        //usando métodos da classe pai e da própria classe
        System.out.println("A " + Coca.getNome() + 
                " é uma bebida da marcar " + Coca.getMarca()
                + " ela agora está " + Coca.qunt_Gas + "% gaseificada");
        Coca.abrir();
        System.out.println("Agora ela está " + + Coca.qunt_Gas + "% gaseificada");
        
        //misturando tudo
        Sucos sm = new Sucos ("Suco de Maracuja", 30, 80, 0, 0, false, "Maracuja", "Maracuja");
        System.out.println("Acabo de fazer um " + sm.getNome() + " com " + sm.getQuant_Açucar() + "g de açucar");
        sm.adicionar("Morango");
        System.out.println("Adiconei um " + sm.fruta + ", agora tem um gosto de ... " + sm.sabor);
        Coca.misturar(sm);
        System.out.println("Misturando a Coca com o suco temos uma bebida com "
        + Coca.getQuant_Açucar() + "g de açucar");
        
        //deixando a bebida energética
        Bebidas cf = new Bebidas("Café", 0, 0, 0, 40, false, true);
        System.out.println("Fiz um " + cf.getNome() + " com " + cf.getQuant_Açucar() + "g de açucar! Ficou bom até");
        Coca.misturar(cf);
        if (Coca.isEhEnergetica() == true) System.out.println("A coca+suco ficou energetica agora que a misturei com café!");
    }
}
