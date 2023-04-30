package com.mycompany.aula03;

public class Casa {
    private int habitantes = 0;
    private float conta = 0;
    protected int limpesa = 100;
    private boolean call = false;
    public int contas_a_pagar = 5;
    
    public void baternaporta(){
        this.call = true;
    }
    
    public void entra_pessoa(){
        this.habitantes++;
    }
    
    public void sai_pessoa (){
        this.habitantes--;
    }
  
    public void consulta_num_habt(){
        if (this.call == true){
            System.out.println ("A casa tem " + this.habitantes + " habitantes\n");
            this.call = false;
        }
        else System.out.print ("Voce precisa bater primeiro!\n");
    }
    
    public void receber_dinheiro (int valor){
        this.conta += valor;
    }
    
    public void pagar_conta(int valor){
        if (this.contas_a_pagar > 0){
            this.conta -= valor;
            this.contas_a_pagar--;
        }
        else{
            System.out.print ("Todas as contas já foram pagas\n");
        }
    }
    
    public void consulta_contas(){
        if (this.call == true){
            if (this.contas_a_pagar > 0) System.out.print ("Ainda existem contas a pagar\n");
            else System.out.print ("Todas as contas já foram pagas\n");
            this.call = false;
        }
        else{
            System.out.print ("Você precisa bater primeiro!\n");
        }
    }
}
