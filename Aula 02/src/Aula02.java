public class Aula02{
    
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.carga = 90;
        c1.tampado = true;
        
        c1.Status();
        c1.Escrever();
        c1.Destampar();
        c1.Escrever();
        c1.Status();
    }
}
