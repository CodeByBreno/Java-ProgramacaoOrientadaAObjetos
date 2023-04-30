package teste_bridge;

public class Teste_Bridge {

    public static void main(String[] args) {
        TV televisao1 = new TV();
        ArCondicionado arzin = new ArCondicionado();
        RemoteControl controle1 = new RemoteControl(arzin);
        
        controle1.enterValue(30);
        System.out.println(arzin.getValue());
        controle1.pressStartButton();
        System.out.println(arzin.getValue());
        controle1.enterValue(40);
        System.out.println(arzin.getValue());
        controle1.passValue();
        System.out.println(arzin.getValue());
        
        BetterRemoteControl controle2 = new BetterRemoteControl(televisao1);
        
        System.out.println ("MEXENDO NA TV: ");
        controle2.enterValue(30);
        System.out.println(televisao1.getValue());
        controle2.pressStartButton();
        System.out.println(televisao1.getValue());
        controle2.enterValue(40);
        System.out.println(televisao1.getValue());
        controle2.enterValue(65);
        System.out.println(televisao1.getValue());
        controle2.comebackValue();
        System.out.println(televisao1.getValue());
        
        
        
    }
}
