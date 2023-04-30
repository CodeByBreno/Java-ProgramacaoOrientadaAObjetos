
package Problema_8a16;
import java.util.Scanner;

public class Hora implements MedidorDeTempo{
    private String nome;
    private String hour; //01:25 seria uma string
    
    //construtor da classe
    public Hora (String name, String entrada){
        this.setNome(name);
        this.setHour(entrada);
    }
    
    //métodos setters
    private void setNome(String name){
        this.nome = name;
    }
    private void setHour (String entrada){
        if (this.testeHora(entrada))
            this.hour = entrada;
        else
            this.Erro();
    }
    
    //métodos getters
    public String getNome (){
        return (this.nome);
    }
    public String getHour(){
        return (this.hour);
    }
    
    //-------------métodos implementados a partir da interface---------------
    @Override
    public void atualizar(String novo){
        this.setHour(novo);
    }
    @Override
    public boolean equal(String compara){
        return (this.hour.equals(compara));
    }
    @Override
    public boolean anterior(String compara){
        if (this.equal(compara)) return false;
        else return (!this.posterior(compara));
    }
    @Override
    public boolean posterior(String compara){
        if (this.equal(compara)) return false;
        else{
            for (int i = 0; i < 5; i++){
                if (this.hour.charAt(i) < compara.charAt(i)) return false;
                if (this.hour.charAt(i) > compara.charAt(i)) return true;
            }
        }
        return false;
    }
    
    //----------------métodos adicionais que decidi implementar:---------------
    
    //testa se o valor inserido para hora é válido
    private boolean testeHora(String entrada){
        if (entrada.length() == 5 && entrada.charAt(2) == ':'){
            //testando se a string dada possui o formato dd:dd
            for (int i = 0; i < 5; i++){
                if (i == 2) i++;
                if (!(entrada.charAt(i) >= '0' && entrada.charAt(i) <= '9')) return false;
            }
            //testando se a string dada constitui um horário válido
            if (entrada.charAt(0) > '2') return false;
            if (entrada.charAt(0) == '2' && entrada.charAt(1) >= '5') return false; //impede 24, 25, ... horas
            if (entrada.charAt(3) >= '6') return false; // impede 60, 65, 70, 82, ... minutos
            return true;
        }
        else return false;    
    }
    
    //método para exibição de erro
    private void Erro(){
        System.out.println("Entrada inválida");
        System.exit(1);
    }
    
    // isso não foi pedido, mas estou usei como teste dos métodos
    public void compara_com(String hora){
        if (this.equal(hora)) System.out.println("As horas são iguais\n");
        if (this.anterior(hora)) System.out.println("A hora no(a) " + this.getNome() + " está adiantada");
        if (this.posterior(hora)) System.out.println("A hora no(a) " + this.getNome() + " está atrasada");
    } 
}

