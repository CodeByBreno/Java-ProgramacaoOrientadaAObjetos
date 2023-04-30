
package problema_32_34;
import java.util.Scanner;
import java.util.Iterator;

public class ContaExtrato extends Conta{
    private Extrato ext = new Extrato();
    private EntradaExtrato atividade = new EntradaExtrato();
    int i = 0;
    
    public void RealizarOperação(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira a data atual: ");
        atividade.setData(ler.nextLine());
        System.out.println("Qual operação você pretende realizar?\n" +
                           "1 - Retirar Dinheiro\n" +
                           "2 - Depositar Dinheiro\n" +
                           "3 - Transferir Dinheiro para outra conta\n" +
                           "Outro - Fechar\n");
        switch (ler.nextInt()){
            case 1 -> {
                System.out.println("Quanto dinheiro pretende retirar?\n");
                double v = ler.nextDouble();
                this.atividade.setValor(v);
                this.ext.entradas.add(atividade);
                if (v <= this.saldo){
                    this.atividade.setOperação("Debito");
                    this.debitar(v);
                    }
                else {
                    System.out.println("Você não possui dinheiro suficiente\n");
                    this.atividade.setOperação("SemSaldo");
                }
            }
            case 2 ->{
                System.out.println("Quanto dinheiro pretende depositar?\n");
                double v = ler.nextDouble();
                this.creditar(v);
                this.atividade.setValor(v);
                this.atividade.setOperação("Credito");
                this.ext.entradas.add(atividade);
            }
            case 3 ->{
                System.out.println("Digite o código da conta para o qual "
                        + "pretende transferir o dinheiro");
                Conta c2 = new Conta();
                c2.numero = ler.nextInt(); //meramente simbólico//
                System.out.println("Quanto pretende transferir?");
                double v = ler.nextDouble();
                this.transferir(c2, v);
                this.atividade.setValor(v);
                this.atividade.setOperação("Tranferir");
                this.ext.entradas.add(atividade);
            }
            default->{
                return;
            }
        }
    }
    
    public void transferir (Conta c, double v){
        this.debitar(v);
        c.creditar(v);
    }
    
    public void getExtrato(){
        if (ext.entradas.isEmpty()){
            System.out.println("Nenhuma operação foi realizada");
            return;
        }
        Iterator<EntradaExtrato> itr = ext.getIterator();
        while (itr.hasNext()){
            EntradaExtrato a = itr.next();
            System.out.printf("%s : no valor de %f (%s)\n", a.getOperação(),
                    a.getValor(), a.getData());
        }
    }
}
