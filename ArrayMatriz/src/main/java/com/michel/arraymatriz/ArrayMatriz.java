package com.michel.arraymatriz;

import java.util.Scanner;
public class ArrayMatriz {
    public static void main(String[] args) {
        System.out.println("Escreva seu nome:");//escreva
        Scanner in = new Scanner( System.in );
        String nome = in.nextLine();//leia
        System.out.println("Escreva seu Sobrenome:");
        String sobrenome = in.nextLine();//leia
        String idade = in.nextLine();//leia
        System.out.println("Nome Completo: "+nome+" "+sobrenome+ 
        " IDADE:  "+idade);
    }
}
