/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilha;

import java.util.Stack;

/**
 *
 * @author michel.costa
 */
public class Pilha {
    public static void main(String[]args){
        Stack<String> pilha_teste = new Stack();
        pilha_teste.push("Posicao: 0");
        pilha_teste.push("Posicao: 1");
        pilha_teste.push("Posicao: 2");
        pilha_teste.push("Posicao: 3");
        System.out.println("Tamanho do elemento: "+pilha_teste.size());
        
        
        
        System.out.println("Remover  o o ultimo elemento: "+pilha_teste.pop());
        System.out.println("Tamanho da Pilha: "+pilha_teste.size());
        
        
        pilha_teste.push("Posicao: 4");
        System.out.println();
        System.out.println("Tamanho da Pilha: "+pilha_teste.size());
        System.out.println();
        
    }
}
