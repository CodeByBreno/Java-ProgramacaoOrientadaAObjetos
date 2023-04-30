
package teste_bridge;

public class BetterRemoteControl extends RemoteControl{
    int lastValue = device.getValue();
    
    BetterRemoteControl(Device D){
        super(D);
    }
    
    @Override
    void passValue(){
        super.passValue();
        this.lastValue = device.getValue();
        device.setValue(device.getValue() + 1);
    }
    @Override
    void returnValue(){
        super.returnValue();
        this.lastValue = device.getValue();
        device.setValue(device.getValue() - 1);
    }
    @Override
    void enterValue(int v){
        super.enterValue(v);
        this.lastValue = device.getValue();
        device.setValue(v);
    }
    
    void comebackValue(){
        device.setValue(this.lastValue);
    }
    
}
