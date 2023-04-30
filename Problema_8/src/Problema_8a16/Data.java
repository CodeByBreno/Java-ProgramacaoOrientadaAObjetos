
package Problema_8a16;

public class Data implements MedidorDeTempo{
    private String Data;
    
    //Contrutor da classe
    public Data (String entrada){
        this.setData(entrada);
    }
    
    //métodos getters
    public String getData(){
        return (this.Data);
    }
    
    //métodos setters
    private void setData(String data){
        this.atualizar(data);
    }
    
    //métodos da interface
    @Override
    public boolean equal(String compara){
        return (this.Data.equals(compara));
    }
    @Override
    public boolean anterior(String compara){
        if (this.equal(compara)) return false;
        else return (!this.posterior(compara));
    }
    @Override
    public boolean posterior(String compara){
        if (this.equal(compara)) return false;
        else{
            for (int i = 6; i < 10; i++){
                if (this.Data.charAt(i) < compara.charAt(i)) return false;
                if (this.Data.charAt(i) > compara.charAt(i)) return true;
            }
            for (int i = 3; i != 2; i++){
                if (this.Data.charAt(i) > compara.charAt(i)) return true;
                if (this.Data.charAt(i) < compara.charAt(i)) return false;
                if (i == 4) i = -1;
            }
            return false;
        }
    }

    @Override
    public void atualizar(String novo) {
        if (this.testeData(novo)) this.Data = novo;
        else this.erro();
    }
    
    //métodos adicionais 
    private boolean testeData (String entrada){
        //primeiro verifico se a string realmente contém somente numeros e barras
        if (entrada.length() == 10 && entrada.charAt(2) == '/' && entrada.charAt(5) == '/'){
            for (int i = 0; i < 10; i++){
                if (i == 2 || i == 5) i++;
                if (entrada.charAt(i) < '0' || entrada.charAt(i) > '9') return false;
            }
        }
        else return false;
        //verifico se os números são coerentes
        if (entrada.charAt(3) == '0' && entrada.charAt(4) == '0') return false;
        if (entrada.charAt(0) > '3') return false;
        if (entrada.charAt(3) > '1') return false;
        if (entrada.charAt(3) == '0' && entrada.charAt(4) == '2') //fevereiro
            if (entrada.charAt(0) > '2' || entrada.charAt(1) > '8') return false;
        //verifica se o mês tem 30 dias
        if (entrada.charAt(3) == '0')
                if (entrada.charAt(4) == '4' || entrada.charAt(4) == '6' || entrada.charAt(4) == '9') 
                    if (entrada.charAt(0) == '3' && entrada.charAt(1) != '0') return false;
        if (entrada.charAt(3) == '1' && entrada.charAt(4) == '1')
                if (entrada.charAt(0) == '3' && entrada.charAt(1) != '0') return false;
        return true;
    }
    private void erro(){
        System.out.println("Entrada inválida");
        System.exit(1);
    }
    
    //questão 23
    public int getDistanciaDias(Data data1){
        String dia1 = this.getData().substring(0, 2);
        String mes1 = this.getData().substring(3, 5);
        String ano1 = this.getData().substring(6, 10);
        
        int d1 = Integer.parseInt(dia1);
        int m1 = Integer.parseInt(mes1);
        int a1 = Integer.parseInt(ano1);
        
        String dia2 = data1.getData().substring(0, 2);
        String mes2 = data1.getData().substring(3, 5);
        String ano2 = data1.getData().substring(6, 10);
        System.out.println(dia2 + mes2 + ano2);
        
        int d2 = Integer.parseInt(dia2);
        int m2 = Integer.parseInt(mes2);
        int a2 = Integer.parseInt(ano2);

        return (d2 - d1 + (m2 - m1)*30 + (a2 - a1)*365);
    }
}

