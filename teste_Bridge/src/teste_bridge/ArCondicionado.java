
package teste_bridge;

public class ArCondicionado extends Device{
    @Override
    int getVolume(){
        System.out.println("Ar Condicionado não tem volume!!");
        return -1;
    }
    @Override
    void setVolume(int v){
        System.out.println("Ar Condicinado não tem volume!!");
    }
}
