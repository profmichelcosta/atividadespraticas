/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

/**
 *
 * @author michel.costa
 */
public class Veiculo {
    String marca;
    String modelo;
    public Veiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo =modelo;
        this.imprimir();
    }
    public void imprimir(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
    }
}
