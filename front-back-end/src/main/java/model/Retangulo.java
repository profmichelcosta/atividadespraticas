package model;
public class Retangulo {
   float ladoA;
   float LadoB;
   String tipoRetangulo;
   public Retangulo(float ladoa,float ladob){
       this.ladoA=ladoa;
       this.LadoB = ladob;
   }
   public Retangulo(){
   }
   public String verificaForma(){
       if(this.ladoA == this.LadoB){
           tipoRetangulo = "Forma geometrica Quadrado";
       }else{
           tipoRetangulo = "Forma geometrica Retangulo";
       }
       return tipoRetangulo; 
   }
   public float calculaRetangulo(){
       float area = this.ladoA*this.LadoB;
       return area;
   } 
    public float calculaTriangulo(){
       float area = (this.ladoA*this.LadoB)/2;
       return area;
   } 
}
