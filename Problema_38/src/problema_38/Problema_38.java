
package problema_38;
import java.util.Scanner;

public class Problema_38 {

    public static void main(String[] args) {
        ListaDatas ld = new ListaDatas();
        ListaDatas Feriados = new ListaDatas();
        Feriados.inserir("01/01/2021");
        Feriados.inserir("15/02/2021");
        Feriados.inserir("02/04/2021");
        Feriados.inserir("21/04/2021");
        Feriados.inserir("01/05/2021");
        
        String vet[] = new String[10];
        vet = Feriados.busca_mês("Junho");
        System.out.println("\nFeriados no mês de abril");
        for (int i = 0; vet[i] != "fim"; i++){
            System.out.println(vet[i]);
        }
        
        while(true){
            ld.exibir();
            System.out.println("Insira a opção desejada\n" +
                               "1 - Adicionar data à lista\n" + 
                               "2 - Remover uma data da lista\n" +
                               "3 - Verificar se uma data está na lista\n" +
                               "Outro - Finalizar\n");
            Scanner ler = new Scanner(System.in);
            switch (ler.nextInt()){
                case 1 ->{
                    ler.nextLine();
                    System.out.println("Digite a data a ser adicionada: ");
                    String data = ler.nextLine();
                    ld.inserir(data);
                    if (Feriados.pertence(data)) System.out.println("Essa data é um feriado :D\n");
                }
                case 2 ->{
                    ler.nextLine();
                    System.out.println("Digite a posição da data a ser removida : ");
                    ld.remover(ler.nextInt());
                }
                case 3 ->{
                    ler.nextLine();
                    System.out.println("Digite a data pra verificar: ");
                    if (ld.pertence(ler.nextLine())) System.out.println("Pertence");
                    else System.out.println("Não Pertence");
                }
                default ->{
                    break;
                }
            }
        }
    }
    
}
