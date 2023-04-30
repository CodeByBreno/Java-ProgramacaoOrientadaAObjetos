
package Problema_8a16;
import java.util.Scanner;

public class Problema_8a16 {

    public static void main(String[] args) {
        /* Teste do programa para a questão 8
        Hora relogio = new Hora("Relogio", "10:55");
        Hora telefone = new Hora("Telefone", "14:55");
        Hora internet = new Hora("Web", "09:12");
        
        System.out.println("O " + relogio.getNome() + " está marcando = " + relogio.getHour());
        relogio.Atualizar("12:55");
        System.out.print("O relogio agora marca = " + relogio.getHour()
                            + " mas o " + telefone.getNome() + " diz que são " 
                            + telefone.getHour() + "\nPortanto ");
        relogio.compara_com(telefone.getHour());
        
        System.out.print("Contudo a " + internet.getNome() + " marca " 
                            + internet.getHour() + "\nLogo ");
        relogio.compara_com(internet.getHour());
        System.out.print("\nE também ");
        telefone.compara_com(internet.getHour()); */
        
        //Programa da questão 9
        /*Scanner ler = new Scanner(System.in);
        System.out.println("Insira o primeiro horário: (respeite o formato hh:mm");
        Hora h1 = new Hora ("Entrada1", ler.nextLine());
        System.out.println("\nInsira o segundo horário: (respeite o formato hh:mm");
        Hora h2 = new Hora ("Entrada2", ler.nextLine());
        if (h1.posterior(h2.getHour())) System.out.println("A primeira hora é posterior á segunda");
        else System.out.println("A primeira hora NÃO é posterior à segunda");*/
        
        //Programa da questão 10 e 11
        /*Scanner ler = new Scanner(System.in);
        Data d[] = new Data[3];
        System.out.println("Insira a primeira data: (respeite a organização dd/mm/aa");
        d[0] = new Data(ler.nextLine());
        System.out.println("Insira a segunda data: ");
        d[1] = new Data(ler.next());
        System.out.println("Insira a tereceira data: ");
        d[2] = new Data(ler.next());
        
        
        Data max = d[2], min = d[0];
        for (int i = 0; i < 3; i++){
            if (d[i].posterior(max.getData())) max = d[i]; 
            if (d[i].anterior(min.getData())) min = d[i];
        }
        System.out.println("A maior das datas foi " + max.getData() +
                           "\nA menor das datas foi " + min.getData());*/
        
        //Teste extra do programa 10/11
        /*Scanner ler = new Scanner(System.in);
        Data d1 = new Data(ler.nextLine());
        Data d2 = new Data(ler.nextLine());
        if (d1.equal(d2.getData())) System.out.println("As datas são iguais");
        if (d1.anterior(d2.getData())) System.out.println("A primeira data é anterior a segunda");
        if (d1.posterior(d2.getData())) System.out.println("A primeira data é posterior à segunda");*/
        
        //Programa da questão 12
        /*Periodo p1 = new Periodo();
        Periodo p2 = new Periodo();
        if (p1.equal(p2)) System.out.println("O primeiro período é igual ao segundo");
        else if (p1.anterior(p2)) System.out.println("O primeiro período é anterior ao segundo");
        else if (p1.posterior(p2)) System.out.println("O primeiro período é posterior ao segundo");
        else System.out.println("Os periodos tem um intervalo comum");*/
        
        //Programa da questão 15
        /*Scanner ler = new Scanner(System.in);
        Periodo p[] = new Periodo[3];
        p[0] = new Periodo();
        p[1] = new Periodo();
        p[2] = new Periodo();
        
        if (p[0].temIntersec(p[1])) System.out.println("O primeiro periodo tem intersecção com o segundo");
        else System.out.println("O primeiro e segundo periodo são disjuntos");
        if (p[0].ehSubPeriodo(p[1])) System.out.println("O primeiro periodo é subperíodo do segundo!");
        else System.out.println("O primeiro periodo NÃO é subperiodo do segundo");
        if (p[2].estaNoPeriodo(p[0].getDataIn())) System.out.println("A primeira data está no terceiro período");
        else System.out.println("A primeira data NÃO está no terceiro período");
        
        int cont = 0;
        for (int i = 0; i < 3; i++){
            if (p[i].temDia("01") == 1) cont++;
            if (p[i].temDia("01") == 2) cont++;
            if (p[i].temDia("01") == 3) cont+=2;
            
            if (p[i].temMes("01") == 1 || p[i].temMes("07") == 1) 
                System.out.println(p[i].getDataIn());
            if (p[i].temMes("01") == 2 || p[i].temMes("07") == 2) 
                System.out.println(p[i].getDataFi());
            if (p[i].temMes("01") == 3 || p[i].temMes("07") == 3){
                System.out.println(p[i].getDataIn());
                System.out.println(p[i].getDataFi());
            }
        }
        System.out.println("Datas com dia 1 = " + cont);
        
        //Programa da questão 23
        System.out.println("A distancia entre o primeiro dia e o segundo é de "
            + p[0].tamanho() + " dias");
        System.out.println("A distancia etnre o terceiro e quarto dia é de "
            + p[1].tamanho() + " dias");
    }*/
        
        //programa teste para questão 23
        Scanner ler = new Scanner (System.in);
        Data d1 = new Data (ler.nextLine());
        Data d2 = new Data (ler.nextLine());
        int dist = d1.getDistanciaDias(d2);
        if (dist == 0) System.out.println("São o mesmo dia!");
        else{
            if (dist > 0) System.out.println("O primeiro dia é anterior ao segundo e"
                    + "a distancia entre as datas é de " + dist + " dias");
            else System.out.println("O primeiro dia é posterior ao segundo e "
                    + "a distancia entre as datas é de " + -dist + " dias");
        }
    }
}
