
package exercicio.pkg4;

public class Pessoa {
    public String Nome;
    public int Idade;
    private float Dinheiro;
    ContaBancaria C = new ContaBancaria (this.Dinheiro, this.Nome);
    
    public Pessoa (String N, int a, float d){
        this.Nome = N;
        this.Idade = a;
        this.Dinheiro = d;
        this.depositar_dinheiro(d/2);
        C.mudarDono(N);
    }
    
    public void status (){
       System.out.println(this.Nome + " possui " + this.Idade + " anos");
       System.out.println("atualmente ele tem " + this.Dinheiro + " reais");
       C.situation();
    }
    
    protected void sacar_dinheiro (float m){
        if (C.retirar_Fortuna(m) == -1) 
            System.out.println("The account has no money\n");
        else 
            this.Dinheiro += m;
    }
    
    protected void depositar_dinheiro (float m){
        C.inserir_Fortuna(m);
        this.Dinheiro -= m;
    }
   
    public void ganhar_dinheiro (float m){
        C.inserir_Fortuna(m);
    }
    
    public void pagar (Pessoa P, float m){
        this.Dinheiro -= m;
        P.ganhar_dinheiro(m);
    }
}