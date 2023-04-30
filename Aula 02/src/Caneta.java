public class Caneta {
    int carga;
    float ponta;
    String modelo;
    String cor;
    boolean tampado;
    
    void Status(){
        System.out.println ("A caneta tem cor " +this.cor);
        System.out.println ("A ponta da caneta é: " +this.ponta);
        System.out.println ("Seu modelo é " +this.modelo);
        System.out.println ("Ela atualmente está tampada : " +this.tampado);
        System.out.println ("Resta " + this.carga + " de carga");
    }
    
    void Tampar(){
        this.tampado = true;
    }
    
    void Destampar(){
        this.tampado = false;
    }
    
    void Escrever(){
        if (this.tampado == true){
            System.out.println ("A caneta esta tampada!\n");
        }
        else{
            if(this.carga == 0)
                System.out.println ("A caneta não tem tinta\n");
            else{
                System.out.println ("Escrevi");
                if (this.carga > 5) this.carga -= 5;
                else this.carga = 0;
                }
            }
        }
}
