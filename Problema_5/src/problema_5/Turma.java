
package problema_5;

public class Turma {
    public String nome, coerequisito;
    private int max_mat = -1, atual_mat = -1;
    
    public Turma(String n, String c, int mm, int am){
        this.nome = n;
        this.coerequisito = c;
        if (mm > 0) this.max_mat = mm;
        if (am >= 0 && am < mm) this.atual_mat = am;
        else System.out.println("Atenção! O valores de alunos inseridos são inválidos");
    }
    
    public boolean Vagas_Disponiveis (){
        if (atual_mat < max_mat) return (true);
        else return (false);
    }
    
    public void matricular(){
        if (this.Vagas_Disponiveis())
            this.atual_mat++;
        else 
            this.atual_mat = 10000;
    }
    
    public int getVagas (){
        return (max_mat - atual_mat); 
    }
}
