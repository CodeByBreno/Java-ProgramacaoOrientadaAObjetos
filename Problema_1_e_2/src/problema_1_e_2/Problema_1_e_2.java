
package problema_1_e_2;

public class Problema_1_e_2 {

    public static void main(String[] args) {
        Anexo n1 = new Anexo("Documento", "Abacates sao doces durante a primavera");
        Anexo n2 = new Anexo("Lista de Comidas", "Comprar Ovos, Arroz e carne");
        Anexo n3 = new Anexo("Codigo de inscrição", "9999999999");
        
        Email nova_mensagem = new Email("breno@gmail.com", "joazin@gmail.com", "11/05/2021", n1, n2, n3);
        nova_mensagem.status();
        
    }
}
