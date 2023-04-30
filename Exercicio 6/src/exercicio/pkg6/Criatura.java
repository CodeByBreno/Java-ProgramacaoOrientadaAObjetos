
package exercicio.pkg6;

import java.util.Random;

public class Criatura implements Lutador {
    String nome;
    private final int itens[] = new int[3];
    private int hp;
    private int dano;
    private int defesa;
    private boolean protect;
    private int vitórias;
    private int derrotas;
    private int empates;
    private int critico;
    private int sorte;

    //método construtor
    public Criatura(String nome, int itn, int hp, int dano, int defesa, 
            int v, int d, int e, int critic){
        this.setNome(nome);
        this.setItem(itn, itn, itn);
        this.setHp (hp);
        this.setDano (dano);
        this.setDefesa(defesa);
        this.protect = false;
        this.setVitórias(v);
        this.setDerrotas(d);
        this.setEmpates(e);
        this.setCritico (critic);
        this.setSorte() ;
    }
    
    //método status
    public void Status(){
        System.out.println (this.getNome() + 
                "\nHp : " + this.getHp() +
                "\nDano : " + this.getDano() +
                "\nDefesa : " + this.getDefesa() +
                "\nSorte : " + this.getSorte() +
                "\nIncremento de Critico : " + this.getCritico() +
                "\nEstá protegido? : " + this.getProtect() +
                "\nVitórias : " + this.getVitórias() +
                "\nDerrotas : " + this.getDerrotas() +
                "\nEmpates : " + this.getEmpates() );
    }
    
    //métodos getters
    public String getNome (){
        return (this.nome);
    }
    public int getHp (){
        return (this.hp);
    }
    public int getItem (int i){
        return (itens[i]);
    }
    public int getDano (){
        return (this.dano);
    }
    public int getDefesa(){
        return (this.defesa);
    }
    public boolean getProtect (){
        return (this.protect);
    }
    private int getVitórias (){
        return (this.vitórias);
    }
    private int getDerrotas (){
        return (this.derrotas);
    }
    private int getEmpates (){
        return (this.empates);
    }
    public int getSorte (){
        return (this.sorte);
    }
    private int getCritico(){
        return (this.critico);
    }
    
    //métodos setters
    private void setNome (String nome){
        this.nome = nome;
    }
    private void setHp(int m){
        this.hp = m;
    }
    private void setItem (int a, int b, int c){
        this.itens[0] = a;
        this.itens[1] = b;
        this.itens[2] = c;
    }
    private void setDano(int m){
        this.dano = m;
    }
    private void setDefesa (int m){
        this.defesa = m;
    }
    private void setProtect (boolean m){
        this.protect = m;
    }
    private void setVitórias (int m){
        this.vitórias = m;
    }
    private void setDerrotas (int m){
        this.derrotas = m;
    }
    private void setEmpates (int m){
        this.empates = m;
    }
    private void setSorte (){
        Random k = new Random();
        int srt = k.nextInt(20);
        this.sorte = srt;
    }
    private void setCritico (int critic){
        this.critico = critic;
    }
    
    //métodos visíveis
    @Override
    public void Atacar(Criatura c) {
        System.out.println (this.getNome() + " vai atacar!");
        Random num = new Random();
        int dado = num.nextInt(20);
        if (this.sorte > dado)
            c.ReceberDano(this.getDano() + this.critico, this.getNome());
        else
            c.ReceberDano(this.getDano(), this.getNome());
    }

    @Override
    public void ArmarDefesa() {
        System.out.println(this.getNome() + " está melhorando sua defesa!");
        this.setDefesa (this.getDefesa() + 2);
    }

    @Override
    public void UsarItem(int i) {
        switch (i){
            // Poção de Cura
            case 0 -> {
                if (this.getItem(0) > 0){
                    System.out.println(this.nome + " usou uma poção de cura!");
                    this.setHp (this.getHp() + 10);
                    this.itens[0]--;
                }
                else System.out.println("Acabaram as poções de cura! :O");
                break;
            }
            // Poção de Dano
            case 1 -> {
                if (this.getItem(1) > 0){
                     System.out.println(this.nome + " usou uma poção de dano!");
                     this.setDano (this.getDano() + 5);
                     this.itens[1]--;
                }
                else System.out.println ("Acabaram as poções de dano! :O ");
                break;
            }
            // Poção de Proteção
            case 2 -> {
                if (this.getItem(2) > 0){
                    System.out.println (this.nome + " usou uma poção de proteção!");
                    this.itens[2]--;
                    if (this.protect != true) this.setProtect (true);
                    else System.out.println ("Contudo ele já estava protegido e isso não mudou nada...");
                }
                else System.out.println ("Acabaram as poções de defesa :O ");
                break;
            }
        }
    }

    @Override
    public void Desistir() {
        System.out.println (this.getNome() + "desistiu");
        this.setDerrotas(this.getDerrotas() + 1);
    }

    @Override
    public void ReceberDano(int d, String atacante) {
        if (this.getProtect() == true){
            System.out.println(this.getNome() + " estava protegida de ataques!");
            this.setProtect(false);
        }
        else{
            if (d > this.getDefesa()){
                this.setHp(this.getHp() + this.getDefesa() - d);
                System.out.printf("%s sofreu um dano de %d do ataque que %s fez\n", this.getNome(), - this.getDefesa() + d, atacante);
            }
            else
                System.out.println (this.getNome() + " sustentou o ataque de " + atacante + " sem se ferir!");
        }
        if (this.getHp() <= 0) System.out.println("O " + this.getNome() + " Morreu! D: ");
    }

    @Override
    public void ganharLuta() {
        System.out.println (this.getNome() + " Ganhou! :D ");
        this.setVitórias(this.getVitórias() + 1);
    }

    @Override
    public void perderLuta() {
        System.out.println (this.getNome() + " Perdeu! :( ");
        this.setDerrotas(this.getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() {
        System.out.println (this.getNome() + " Ganhou... mais um empate :/ ");
        this.setEmpates(this.getEmpates() + 1);
    }
}
