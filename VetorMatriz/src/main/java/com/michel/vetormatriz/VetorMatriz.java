package com.michel.vetormatriz;
public class VetorMatriz {
    public static void main(String[] args) {
        System.out.println("MATRIZES E VETORES");
        String[] carros= {"fusca", "clio", "uno",
            "RX7", "Ferrari"};
        System.out.println("--------NUMEROS---");
        int[] numeros= {1,100, 999, 888, 77,8,3
                , 5, 55, 12, 30,26};
        for(int i=0; i<= (numeros.length-1); i++){
            System.out.println(numeros[i]);
        }
        System.out.println("--------CARROS---"
                + "--------");
        System.out.println(carros[0]);
        System.out.println(carros[1]);
        for(int i=0; i<= (carros.length-1); i++){
            System.out.println(carros[i]);
        }
        int n = 3;
        String g = "";
        String[][] Matriz={{"Abacaxi",  "Abacate", "Abacate"}, 
                            {"Couve",     "Alface", "jhvjh"}
        }; 
        System.out.println(Matriz[1][2]);
        System.out.println("---- IMPRRIMIR A MATRIZ");//
         //System.out.println(Matriz[1][2]);
        for(int i=0; i<= (Matriz.length - 1);i++){
            for(int j=0; j<= 2; j++){
                System.out.println(Matriz[i][j]);
            }
        }
        
    }
}
