
package problema_27;

public class NumeroBinario {
    String num;
    
    public int ConverterParaDecimal(){
        int decimal = 0;
        int a = 1; 
        for (int i = this.num.length() - 1; i >= 0; i--){
            if (this.num.charAt(i) == '1') decimal += a;
            a = 2*a;
        } 
        return decimal;
    }
}
