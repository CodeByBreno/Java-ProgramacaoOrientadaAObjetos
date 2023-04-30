
package problema_45;

public class ConjuntoDeStrings {
    private String[] strings = {"Pikachu", "Starmie", "Seagull", "Tropius", 
        "Murkrow", "Lucario", "Seaking", "Slaking", "Regice", "Flareon"};
    
    public void Dividir(String[] array){
        String original[] = new String[strings.length];
        original = strings;
        boolean flag = false;
        int c = 0;
        this.strings = new String[original.length];
        for (int i = 0; i < original.length; i++, flag = false){
            for (int j = 0; j < array.length; j++){
                if (original[i].equalsIgnoreCase(array[j])){
                    flag = true;
                    break;
                } 
            }
            if (!flag) this.strings[c++] = original[i];
        }
    }
    
    public void exibir(){
        for (int i = 0; i < strings.length; i++){
            System.out.println(strings[i]);
        }
    }
}
