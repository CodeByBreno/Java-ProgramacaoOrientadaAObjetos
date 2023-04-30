
package problema_38;

public class ListaDatas {
    String vetor[] = null;
    int max = 0, tamanho = 1;
    
    public void inserir(String data){
        if (vetor == null || tamanho%5 == 0){
            this.expandir_capacidade();
        }
        this.vetor[tamanho-1] = data;
        tamanho++;
    }
    public void remover(int i){
        this.vetor[i-1] = null;
        for (int c = i-1; c < tamanho-1; c++){
            this.vetor[c] = this.vetor[c+1];
        }
        tamanho--;
    }
    public boolean pertence(String data){
        for (int c = 0; c < tamanho; c++){
            if (this.vetor[c].equals(data)) return true;
        }
        return false;
    }
    
    private void expandir_capacidade(){
        String aux[] = new String[tamanho];
        aux = vetor;
        if (max == 0) max = 5;
        else max += 5;
        this.vetor = new String[max];
        if (tamanho != 1)
            for (int i = 0; i < tamanho; i++){
                this.vetor[i] = aux[i];
            }
    }
    
    public void exibir(){
        if (tamanho == 1){
            System.out.println("A lista está vazia");
            return;
        }
        for (int c = 0; c < tamanho-1; c++){
            System.out.println(c + 1 + " : " + this.vetor[c]);
        }
    }
    
    /*public String[] busca_abril(){
        String datas[] = new String[tamanho];
        int i = 0;
        for (int c = 0; vetor[c] != null ; c++){
            if (this.vetor[c].charAt(3) == '0' && this.vetor[c].charAt(4) == '4')
                datas[i++] = this.vetor[c];
        }
        datas[i] = "fim";
        return datas;
    }*/
    
    public String[] busca_mês(String mês){
        char A = 0;
        char B = 0;
        System.out.println(mês);
        if (mês.equalsIgnoreCase("Janeiro")){ A = '0'; B = '1'; }
        if (mês.equalsIgnoreCase("Fevereiro")){ A = '0'; B = '2'; }
        if (mês.equalsIgnoreCase("Março")){ A = '0'; B = '3'; }
        if (mês.equalsIgnoreCase("Abril")){ A = '0'; B = '4'; }
        if (mês.equalsIgnoreCase("Maio")){ A = '0'; B = '5'; }
        if (mês.equalsIgnoreCase("Junho")){ A = '0'; B = '6'; }
        if (mês.equalsIgnoreCase("Julho")){ A = '0'; B = '7'; }
        if (mês.equalsIgnoreCase("Agosto")){ A = '0'; B = '8'; }
        if (mês.equalsIgnoreCase("Setembro")){ A = '0'; B = '9'; }
        if (mês.equalsIgnoreCase("Outubro")){ A = '1'; B = '0'; }
        if (mês.equalsIgnoreCase("Novembro")){ A = '1'; B = '1'; }
        if (mês.equalsIgnoreCase("Dezembro")){ A = '1'; B = '2'; }
        System.out.printf("%c%c", A, B);
        String datas[] = new String[tamanho];
        int i = 0;
        for (int c = 0; vetor[c] != null ; c++){
            if (this.vetor[c].charAt(3) == A && this.vetor[c].charAt(4) == B)
                datas[i++] = this.vetor[c];
        }
        datas[i] = "fim";
        return datas;
    }
}