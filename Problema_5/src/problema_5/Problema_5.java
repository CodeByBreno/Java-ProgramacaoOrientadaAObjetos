
package problema_5;

public class Problema_5 {

    public static void main(String[] args) {
        Turma POO = new Turma ("Programção Orientada a Objetos", 
                "Introdução à Algoritmos", 30, 15);
        System.out.println("A disciplina de " + POO.nome + " exige a conclusão da turma"
                + "de " + POO.coerequisito + "\nAtualmente existem " + POO.getVagas()
                + " vagas disponiveis\n");
        for (int i = 0; i < 5; i++) POO.matricular();
        System.out.println("Agora existem " + POO.getVagas());
    }
}
