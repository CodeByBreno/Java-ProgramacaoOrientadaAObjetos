package com.mycompany.aula03;

public class Aula03 {
    public int value = 500;
    
    public static void main(String[] args){
        Casa house = new Casa();
        house.entra_pessoa();
        house.entra_pessoa();
        house.entra_pessoa();
        house.baternaporta();
        house.consulta_num_habt();
        house.baternaporta();
        house.consulta_contas();
        house.pagar_conta(0);
    }
}
