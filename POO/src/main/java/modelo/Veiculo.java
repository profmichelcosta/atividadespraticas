package modelo;
public class Veiculo {
    String marca;
    String modelo;
    int ano;
    String placa;
    public Veiculo(String marca, String modelo,int ano, String placa){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
    }
    
    public void Imprimir(){
      System.out.println("Marca: "+this.marca);
      System.out.println("Modelo: "+this.modelo);
      System.out.println("Ano: "+this.ano);   
      System.out.println("Placa: "+this.placa);
  }
}   
