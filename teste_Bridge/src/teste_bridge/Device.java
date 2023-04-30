
package teste_bridge;

public class Device {
    private int Volume = 0;
    private int Value = 1;
    private boolean State = false;
    
    int getVolume(){
        return this.Volume;
    }
    void setVolume(int v){
        this.Volume = v;
    }
    
    int getValue(){
        return this.Value;
    };
    void setValue(int c){
        this.Value = c;
    };
    
    void turnOn(){
        this.State = true;
    }
    void turnOff(){
        this.State = false;
    }
    boolean isOn(){
        return (this.State);
    }
    
}
