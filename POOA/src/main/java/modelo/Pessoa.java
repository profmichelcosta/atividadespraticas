/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author michel.costa
 */
public class Pessoa {
    String nome;
    String cpf;
    public Pessoa(String nome, String cpf){
        this.nome=nome;
        this.cpf = cpf;
    }
    public void Imprimir(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
    }
    
}
