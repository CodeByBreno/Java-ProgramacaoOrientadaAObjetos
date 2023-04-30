
package problema_4;

public class CD {
    private String titulo;
    private int ano;
    private Banda bandaautora;
    
    public CD (String nome, int ano, Banda autora){
        this.setTitulo(nome);
        this.setAno(ano);
        this.setBandaAutora(autora);
    }
    
    public String getTitulo (){
        return (this.titulo);
    }
    public int getAno (){
        return (this.ano);
    }
    public Banda getBandaAutora(){
        return (this.bandaautora);
    }
    
    private void setTitulo (String titulo){
        this.titulo = titulo;
    }
    private void setAno (int a){
        this.ano = a;
    }
    private void setBandaAutora (Banda b){
        this.bandaautora = b;
    }
}
