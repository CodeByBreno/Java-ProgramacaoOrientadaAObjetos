
package problema_43;

public class AB {
    private String[] A = {"123456789", "Filhos", "Pais", "Avos", "Padrastos", "Madrastas"};
    private String[] B = {"123456789", "Filhos", "Madrastas"};
    
    public String[] intersecção (){
        int tamanho, c = 0;
        if (A.length >= B.length) tamanho = A.length;
        else tamanho = B.length;
        String vet[] = new String[tamanho];
        for (int i = 0; i < A.length; i++){
            for (int j = 0; j < B.length; j++){
                if (A[i].equals(B[j])) vet[c++] = A[i];
            }
        }
        return vet;
    }
    public void exibir(String[] strings){
        for (int i = 0; i < strings.length; i++){
            System.out.println(strings[i]);
        }
    }
}
