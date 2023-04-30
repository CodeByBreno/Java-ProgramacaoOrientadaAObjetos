
package exercício.pkg5;
public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private int carga;
    private int keepvolume;
    private int canal;
    private boolean pause;
    
    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.carga = 80;
        this.keepvolume = 0;
        this.canal = 5;
    }
    
    public void Status(){
        if (this.getLigado() == true) {
            System.out.println ("O controle está ligado");
            System.out.println("Ele está setado no canal " + this.getCanal());
            System.out.println ("A tv atualmente está pausada : " + this.pause);
            System.out.println ("Ele possui " + this.getCarga() + " de carga");
            System.out.print ("Volume: ");
            if (this.keepvolume == 0){
                for (int i = 0; i < this.getVolume(); i+=2){
                    System.out.print ("|");
                }
                System.out.println("( " + this.volume + " )");
           }
            else 
                System.out.println ("Mudo");
        }
        else{
            System.out.println ("O controle está desligado");
        }
    }
    
    private int getVolume(){
        return (this.volume);
    }
    
    private boolean getLigado(){
        return (this.ligado);
    }
    
    private int getCarga(){
        return (this.carga);
    }
    
    public void setVolume (int m){
        this.volume = m;
    }
    
    public void setCarga (int m){
        if (m < 0) this.carga = 0;
        else this.carga = m;
    }
    
    public int getCanal (){
        return (this.canal);
    }
    
    public void setCanal (int m){
        if (m > 11) this.canal = 12;
        else if (m > 0) this.canal = m;
    }
    
    // Métodos Abstratos
    @Override
    public void liga() {
        if (getCarga() != 0){
            this.ligado = true;
            this.setCarga(this.carga - 5);
        }
        else
            System.out.println("O controle está sem carga! Troque a pilha");
    }
    
    @Override
    public void maisVolume() {
        if (this.getLigado() == true){
            this.setCarga(this.carga - 1);
            if (this.keepvolume == 0){
                if (this.volume < 100) this.setVolume (this.volume + 1);
                else System.out.println ("O volume já está no máximo!");
            }
            else 
                System.out.println ("O sistema está mudo. Tire do mudo para mudar o volume");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado() == true){
            if (this.keepvolume == 0){
                this.setCarga(this.carga - 1);
                if (this.volume > 0) this.setVolume (this.volume - 1);
                else System.out.println("O dispositivo já está mudo");
            }
            else
                System.out.println("O sistema está mudo. Tire do mudo para mudar o volume");
        }
    }

    @Override
    public void Mudo() {
        if (this.getLigado() == true){
            this.setCarga (this.carga - 2);
            int a = this.volume;
            this.volume = this.keepvolume;
            this.keepvolume = a;
        }
    }

    @Override
    public void Pause() {
        if (this.getLigado() == true){
            this.setCarga(this.carga - 2);
            if (this.pause == false) this.pause = true;
            else this.pause = true;
        }
    }

    @Override
    public void TrocarPilha() {
        this.setCarga (100);
    }

    @Override
    public void proxCanal() {
        this.setCarga (this.carga - 2);
        if (this.getLigado() == true) this.setCanal (this.canal + 1);
    }

    @Override
    public void antCanal() {
        this.setCarga (this.carga - 2);
        if (this.getLigado() == true) this.setCanal (this.canal - 1);
    }
}
