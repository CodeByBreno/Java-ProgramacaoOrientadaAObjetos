
package problema_4;

public class Banda {
    private String nome, estilo;
    private int numerodeintegrantes = 5;
    
    public Banda(String nome, String estilo){
        this.setEstilo(estilo);
        this.setNome(nome);
    }
    
    public String getEstilo (){
        return (this.estilo);
    }
    public String getNome (){
        return (this.nome);
    }
    
    public void setEstilo (String Estilo){
        this.estilo = Estilo;
    }
    public void setNome (String nome){
        this.nome = nome;
    }
}
