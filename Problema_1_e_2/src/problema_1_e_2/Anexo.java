
package problema_1_e_2;

public class Anexo {
    private String name;
    private String text;
    
    public Anexo(String name, String text){
        this.setName(name);
        this.setText(text);
    }
    
    //métodos getters 
    
    public String getName(){
        return (this.name);
    }
   
    public String getText(){
        return (this.text);
    }
    
    // métodos setters 
    
    private void setName(String n){
        this.name = n;
    }
    
    private void setText(String text){
        this.text = text;
    }   
    
    // métodos específicos
    
    public boolean contains (String trecho_de_busca){
        int cont = 0;
        for (int i = 0; i < text.length(); i++){ 
            if (trecho_de_busca.charAt(cont) == text.charAt(i)){
                cont++;
                if (cont == trecho_de_busca.length()) return (true);
            }
            else{
                if (i == text.length() - trecho_de_busca.length()) break;
                cont = 0;
            }
        }
        return false;
    }
}