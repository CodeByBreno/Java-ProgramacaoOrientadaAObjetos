
package problema_24e25;

public class Calculadora {
    
    public int Somar(int a, int b){
        return (a + b);
    }
    public int Subtrair(int a, int b){
        return (a - b);
    }
    public int Multiplicar(int a, int b){
        int result = 0;
        if (b < 0) 
            for (int i = 0; i > b; i--) result -= a;
        else
            for (int i = 0; i < b; i++) result += a;
        return result;
    }
    public int Dividir(int a, int b){
        int quoc = 0;
        int sinal = 1;
        int vl = a;
                
        if (this.Multiplicar(a,b) < 0) sinal = -1;
        if (vl < 0) vl = this.Multiplicar(-1,vl);
        if (b < 0) b = this.Multiplicar(-1,b);
        
        if (b == 0){
            System.out.println("ERRO!");
            return 0;
        }
        else{
            while (true){
                vl -= b;
                if (vl == 0) quoc++;
                if (vl <= 0) break;
                quoc++;
                }
            return (this.Multiplicar(quoc,sinal));
        }
    }
    public int Resto (int a, int b){
        int quoc = this.Dividir(a, b);
        if (b >= 0) return (a - this.Multiplicar(b,quoc));
        else return(a + this.Multiplicar(b,quoc));
    }
    public int fatorial (int a){
        if (a < 0) return -1;
        else {
            if (a == 1) return 1;
            else return (this.Multiplicar(a, this.fatorial(a-1)));
        }
    }
}
