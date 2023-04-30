
package problema_3;
public class Partida_de_Futebol {
    private String time1;
    private String time2;
    private int gols1;
    private int gols2;
    
    public Partida_de_Futebol (String t1, String t2, int a, int b){
        this.setTimes (t1, t2);
        this.setGols (a, b);
    }
    
    private void setTimes(String t1, String t2){
        this.time1 = t1;
        this.time2 = t2;
     }
    
    private void setGols(int g1, int g2){
        if (g1 >= 0 && g2 >= 0){
            this.gols1 = g1;
            this.gols2 = g2;
        }
        else{
            System.out.println("Valores inválidos para os gols!");
        }
    }
    
    public String Vencedor (){
        if (this.gols1 > this.gols2) return (this.time1);
        if (this.gols1 < this.gols2) return (this.time2);
        return ("");
    }
    
    public int NumeroDeGols (String time){
        if (time.equalsIgnoreCase(this.time1)) return (this.gols1); // não se importa com maiuscula e minuscula
        if (time.equalsIgnoreCase(this.time2)) return (this.gols2);
        System.out.println("Esse time não estava na partida");
        return (-1);
    }
}
