/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author michel.costa
 */
public class Pessoa {
    String nome;
    int idade;
    String cpf;
    float altura;
    String sexo;
    float peso;
    public Pessoa(){
    }
    public Pessoa(String nome, int idade, String cpf,float altura, String sexo, float peso){
        this.nome = nome;
        this.idade = idade;
        this.cpf=cpf;
        this.altura =altura;
        this.sexo= sexo;
        this.peso = peso;
    }
    public void Imprimir(){
        System.out.println("Nome: "+ nome+ "CPF: "+cpf);
    }
}
