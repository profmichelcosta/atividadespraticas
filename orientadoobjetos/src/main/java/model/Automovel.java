/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author michel.costa
 */
public class Automovel {
    String modelo;
    int ano;
    String motor;
    String marca;
    String placa;
    float preco;
    String cor;
    public Automovel(){
    }
    public Automovel(String modelo,int ano, String motor,String marca, String placa, float preco,String cor){
        this.modelo = modelo;
        this.ano=ano;
        this.motor=motor;
        this.marca=marca;
        this.placa = placa;
        this.preco=preco;
        this.cor=cor;
    }
}
