
package teste_bridge;

public class RemoteControl{
    Device device;
    
    RemoteControl (Device D){
        this.device = D;
    }
    void passValue(){
        if (device.isOn())
            device.setValue(device.getValue() + 1);
        else
            System.out.println("Ligue o dispoisitivo primeiro!");
    }
    void returnValue(){
        if (device.isOn())
            device.setValue(device.getValue() - 1);
        else
            System.out.println("Ligue o dispoisitivo primeiro!"); 
    }
    void enterValue(int v){
        if (device.isOn())
            device.setValue(v);
        else
            System.out.println("Ligue o dispoisitivo primeiro!");
    }
    void pressStartButton(){
        if (device.isOn()){
            device.turnOff();
        } else{
            device.turnOn();
        }
    }
}
