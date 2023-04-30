
package Problema_8a16;
import java.util.Scanner;

public class Periodo{
    private Data data_in;
    private Data data_fi;

    public Periodo(){
        this.atualizar();
    }
    
    //métodos getters
    public String getDataIn (){
        return (this.data_in.getData());
    }
    
    public String getDataFi (){
        return (this.data_fi.getData());
    }
    
    //métodos da interface - na verdade não são exatamente os da interface
    public boolean equal(Periodo p){
        if (this.data_in.equal(p.getDataIn()) && this.data_fi.equal(p.getDataFi()))
            return true;
        else 
            return false;
    }

    public boolean anterior(Periodo p) {
        if (this.data_fi.anterior(p.getDataIn()))
            return true;
        else 
            return false;
    }

    public boolean posterior(Periodo p) {
        if (this.data_in.posterior(p.getDataFi()))
            return true;
        else
            return false;
    }

    public void atualizar() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira a primeira data do intervalo: ");
        data_in = new Data(ler.nextLine());
        System.out.println("Insira a segunda: ");
        data_fi = new Data(ler.nextLine());
        if (!data_in.anterior(data_fi.getData())){
            System.out.println("A primeira data tem que vir antes da segunda!");
            System.exit(1);
        }
    }
    
    //classes adicionais da questão 12
    public boolean estaNoPeriodo (String data){
        if (data.equals(this.getDataIn()) || data.equals(this.getDataFi()))
            return true;
        return this.data_in.anterior(data) && this.data_fi.posterior(data);
    } //bordas inclusas
    
    public boolean temIntersec(Periodo p){
        return (this.estaNoPeriodo(p.getDataIn()) || this.estaNoPeriodo(p.getDataFi())) ;
    }
    
    public boolean ehSubPeriodo (Periodo p){
        return (this.data_in.anterior(p.getDataIn()) && this.data_fi.posterior(p.getDataFi()));
    }
    
    //classes adicionais para resolver a questão 16
    public int temDia (String dia){
        int option = 0;
        if (dia.length() != 2) option = -1;
        else{
            if(this.getDataIn().charAt(0) == dia.charAt(0) && this.getDataIn().charAt(1) == dia.charAt(1))
                option = 1;
            if(this.getDataFi().charAt(0) == dia.charAt(0) && this.getDataFi().charAt(1) == dia.charAt(1)) {
                if (option == 1) option = 3;
                else option = 2;
            } 
        }
        return option;
    }
    
    public int temMes (String mes){
        int option = 0;
        if (mes.length() != 2) option = -1;
        else{
            if(this.getDataIn().charAt(3) == mes.charAt(0) && this.getDataIn().charAt(4) == mes.charAt(1))
                option = 1;
            if(this.getDataFi().charAt(3) == mes.charAt(0) && this.getDataFi().charAt(4) == mes.charAt(1)) {
                if (option == 1) option = 3;
                else option = 2;
            } 
        }
        return option;
    }
    
    //extra da questão 23
    
    public int tamanho(){
        return (this.data_in.getDistanciaDias(this.data_fi));
    }
}
