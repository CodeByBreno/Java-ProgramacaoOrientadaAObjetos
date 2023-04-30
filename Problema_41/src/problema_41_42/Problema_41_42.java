
package problema_41_42;

public class Problema_41_42 {

    public static void main(String[] args) {
        ListaDeInteiros teste = new ListaDeInteiros();
        teste.setLista();
        for (int i = 0; i < teste.N; i++) System.out.print(teste.getValue(i) + " ");
        
        System.out.println();
        int vet[] = new int[teste.N];
        vet = teste.elementos_sem_repetição();
        for (int i = 0; i < teste.N; i++) System.out.print(vet[i] + " ");
        
        Resultado R = new Resultado();
        R = teste.Dividir(3);
        System.out.println("\n");
        for (int i = 0; i < teste.N; i++) System.out.print(R.getMaior(i) + " ");
        System.out.println("\n");
        for (int i = 0; i < teste.N; i++) System.out.print(R.getMenor(i) + " ");
        System.out.println("\n");
        for (int i = 0; i < teste.N; i++) System.out.print(R.getIguais(i) + " ");
        
    }
    
}
