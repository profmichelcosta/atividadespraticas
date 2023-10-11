/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author michel.costa
 */
public class Animal {
    String tipo;
    int patas;
    public Animal(){
    }
    public Animal(String tipo, int patas){
        this.tipo = tipo;
        this.patas = patas;
    }
    void imprimir (){
        System.out.println("Tipo: "+this.tipo);
    }
}
