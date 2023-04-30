
package exercicio.pkg6;

import java.util.Random;

public class Combate {
    private Criatura monstro1;
    private Criatura monstro2;
    private boolean estado;
    
    
    public Combate (Criatura m1, Criatura m2){
        if (m1 != m2) {
            this.setMonstro(m1, m2);
            this.estado = true;
        }
        else {
            System.out.println("Um monstro não pode lutar consigo mesmo!");
            this.estado = false;
        }
    }
    
    private void setMonstro(Criatura m1, Criatura m2){
        this.monstro1 = m1;
        this.monstro2 = m2;
    }
    
    private void info(int contador){
        if (contador != -1) System.out.printf("-------------------- ROUND %d -------------------\n", contador+1);
        else System.out.println("-------------------- FINAL -------------------\n");
        System.out.printf("%s -> Hp: %d Dano: %d Def: %d Sort: %d Itens: %d %d %d\n", 
                this.monstro1.getNome(), this.monstro1.getHp(), 
                this.monstro1.getDano(), this.monstro1.getDefesa(), 
                this.monstro1.getSorte(), this.monstro1.getItem(0),
                this.monstro1.getItem(1), this.monstro1.getItem(2));
        System.out.printf("%s -> Hp: %d Dano: %d Def: %d Sort: %d Itens: %d %d %d\n", 
                this.monstro2.getNome(), this.monstro2.getHp(), 
                this.monstro2.getDano(), this.monstro2.getDefesa(), 
                this.monstro2.getSorte(), this.monstro2.getItem(0),
                this.monstro2.getItem(1), this.monstro2.getItem(2));
        System.out.println("------------------------------------------------");
    }
    
    public void iniciar (){
        int contador = 0;
        if (this.estado){
            while (contador < 10){
                if (this.monstro1.getHp() <= 10 && this.monstro1.getItem(0) != 0) 
                    this.monstro1.UsarItem(0);
                else{
                    Random v = new Random();
                    int D = v.nextInt(6);
                    if (D < 4){
                        if (this.monstro1.getDano() < this.monstro2.getDefesa() &&
                                this.monstro1.getItem(1) != 0)
                            this.monstro1.UsarItem(1);
                        else
                            this.monstro1.Atacar(this.monstro2);
                    }
                    else{
                        if (D == 4) this.monstro1.ArmarDefesa();
                        if (D == 5){
                            Random aleat = new Random();
                            int D2 = aleat.nextInt(3);
                            if (D2 == 0) this.monstro1.UsarItem(0);
                            if (D2 == 1) this.monstro1.UsarItem(1);
                            if (D2 == 2) this.monstro1.UsarItem(2);
                        }
                    }
                }
                if (this.monstro2.getHp() <= 0) break;
                if (this.monstro2.getHp() < 20 && this.monstro2.getItem(0) != 0) 
                    this.monstro2.UsarItem(0);
                else{
                    Random v = new Random();
                    int D = v.nextInt(6);
                    if (D < 4){
                        if (this.monstro2.getDano() < this.monstro1.getDefesa() &&
                                this.monstro2.getItem(1) != 0)
                            this.monstro2.UsarItem(1);
                        else
                            this.monstro2.Atacar(this.monstro1);
                    }
                    else{
                        if (D == 4) this.monstro2.ArmarDefesa();
                        if (D == 5){
                            Random aleat = new Random();
                            int D2 = aleat.nextInt(3);
                            if (D2 == 0) this.monstro2.UsarItem(0);
                            if (D2 == 1) this.monstro2.UsarItem(1);
                            if (D2 == 2) this.monstro2.UsarItem(2);
                        }
                    }
                }
                if (this.monstro1.getHp() <= 0) break;
                this.info(contador);
                contador++;
            }
            if (contador == 10){
                System.out.println("O combate demorou demais e foi declarado empate!");
                this.monstro1.empatarLuta();
                this.monstro2.empatarLuta();
            }
            else if (this.monstro1.getHp() <= 0) {
                System.out.println(this.monstro2.getNome() + " venceu a luta");
                this.monstro2.ganharLuta();
                this.monstro1.perderLuta();
                }
            else if (this.monstro2.getHp() <= 0) {
                System.out.println(this.monstro1.getNome() + " venceu a luta");
                this.monstro1.ganharLuta();
                this.monstro2.perderLuta();
            }
        }
        else
            System.out.println("A luta não pode iniciar...");
        
        this.info(-1);
    }
}
