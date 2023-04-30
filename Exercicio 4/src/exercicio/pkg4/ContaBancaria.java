
package exercicio.pkg4;

public class ContaBancaria {
    private float Fortuna;
    public float Anuidade = 100f;
    String Dono;
    
    public void mudarDono (String N){
        this.Dono = N;
    }
    
    public ContaBancaria (float a, String b){
        this.Fortuna = a - this.Anuidade;
        this.Dono = b;
    }
    
    protected float getFoturna (){
        return (this.Fortuna);
    }
    
    protected void inserir_Fortuna (float m){
        this.Fortuna += m;
    }
    
    protected float retirar_Fortuna (float m){
        if (m > this.Fortuna) {
            System.out.println ("There's not enough fund\n");
            return (-1f);
        }
        else{
            this.Fortuna -= m;
            return (m);
        }     
    }
    
    protected void situation (){
        System.out.println("Sua conta bancária possui " + this.Fortuna);
        System.out.println("O dono dessa conta é o sr." + this.Dono);
    }
}
