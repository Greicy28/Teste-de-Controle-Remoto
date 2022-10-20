package groupidtreinamento;

import javax.lang.model.SourceVersion;

public class Controleremoto {
   String modelo;
   String cor;
   int botões;
   boolean apertou;
  boolean desapertou;
   
 public String getModelo(){
 return this.modelo;
 
 }  
 
 public Controleremoto(String m,String c){
this.modelo=m;
this.setCor(c);
}
 
 
 
 
 protected void setModelo(String m){ 
 this.modelo=m;
 
 }
 protected  String getCor(){
     return this.cor;
 }
 
public void setCor(String c){
this.cor=c;

}



 
 public boolean Apertou(){
return this.apertou;

 }
 public boolean getDesapertou(){
return this.desapertou;
 
 
 }
 
  void status(){
        System.out.println("Modelo do Controle:"+this.getModelo() );
        System.out.println("Cor do Controle:"+this.getCor());
        System.out.println("Quantidade de botões:"+this.botões);
        System.out.println("Foi apertado? " + this.Apertou());
        System.out.println("Foi desapertado? " + this.getDesapertou());
  }
 






}

 
 
 
 
 
 
 
 
 

