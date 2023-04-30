
package problema_1_e_2;

import java.util.Scanner;

public class Email {
    private String Origin_Adress;
    private String Destine_Adress;
    private String Message;
    private String Date;
    private Anexo Files[] = new Anexo[3];
    
    //construtor
    
    public Email(String adrs1, String adrs2, String d, Anexo n1, Anexo n2, Anexo n3){
        this.setOrigin_Adress(adrs1);
        this.setDestine_Adress(adrs2);
        Scanner ler = new Scanner (System.in);
        this.setMessage(ler.nextLine());
        this.setDate(d);
        this.setFiles(n1, n2, n3);
    }
    
    //métodos getters
    
    public String getOrigin_Adress(){
        return (this.Origin_Adress);
    }
    public String getDestine_Adress(){
        return (this.Destine_Adress);
    }
    public String getMessage(){
        return (this.Message);
    }
    public String getDate(){
        return (this.Date);
    }
    public Anexo getFiles(int i){
        return (this.Files[i]);
    }
    
    //métodos setters
    
    private void setOrigin_Adress(String adress){
        this.Origin_Adress = adress;
    }
    private void setDestine_Adress(String adress){
        this.Destine_Adress = adress;
    }
    private void setMessage (String message){
        this.Message = message;
    }
    private void setDate (String date){
        this.Date = date;
    }
    private void setFiles(Anexo f1, Anexo f2, Anexo f3){
        if (f1 == f2 || f1 == f3 || f2 == f3) 
            System.out.println("Arquivos Inválidos");
        else{
            this.Files[0] = f1;
            this.Files[1] = f2;
            this.Files[2] = f3;
        }
    }
    
    //métodos específicos
    
    public void Editar_Mensagem (String nova_mensagem){
        this.setMessage(nova_mensagem + "\n\n(Arquivo editado da versão original de " + this.getDate() + ")");
    }
    
    public void status (){
        System.out.println("(" + this.getDate() + ")\n\n" +
                           "De: " + this.getOrigin_Adress() +
                           "\nPara: " + this.getDestine_Adress() +
                           "\n" + this.getMessage() +
                           "\n\nArquivos anexos: \n"
                           + this.Files[0].getName() + "\n"
                           + this.Files[1].getName() + "\n"
                           + this.Files[2].getName());
    }
}
