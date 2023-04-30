package exercicio.pkg4;

public class Exercicio4 {
    
    public static void main(String[] args) {
        Pessoa P = new Pessoa("Breno Gabriel", 19, 400f);
        Pessoa P2 = new Pessoa("Alana Rodrigues", 19, 1000f);
        P.status();
        P2.status();
        P.ganhar_dinheiro(500f);
        P.sacar_dinheiro(200f);
        P.status();
        P2.pagar(P, 500);
        P.status();
        P2.status();
    }  
}
