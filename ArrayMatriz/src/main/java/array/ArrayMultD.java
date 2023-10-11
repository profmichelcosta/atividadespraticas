package array;

public class ArrayMultD {
    
    public static void main(String [] args){
        int[][] array1 = { { 1,2,4 }, 
                           { 4, 5 ,4} };
        System.out.println("O que esta dentro do array1[0][0]:  "+array1[0][0]);
        System.out.println("O que esta dentro do array1[2][2]:  "+array1[1][2]);
        
        String [][] multDimensao = {{"posicao 0,0","posicao 0,1"},{"posicao 1,0","posicao 1,1"}};
        System.out.println(" Valor armazenado em multDimensao[1][1] : "+multDimensao[1][1]);
    }
}
