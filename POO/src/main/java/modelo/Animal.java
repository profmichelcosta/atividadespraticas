package modelo;
public class Animal {
  String especie;
  String tipo;
  int patas;
  String comunicacao;
  public Animal(String especie,String tipo,int patas, String comunicacao){
      this.especie = especie;
      this.tipo = tipo;
      this.patas = patas;
      this.comunicacao = comunicacao;
  }
  public void Imprimir(){
      System.out.println("Especie: "+this.especie);
      System.out.println("Tipo: "+this.tipo);
      System.out.println("Patas: "+this.patas);   
      System.out.println("Comunicacao: "+this.comunicacao);
  }
}