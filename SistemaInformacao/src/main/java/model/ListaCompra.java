/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author michel.costa
 */
public class ListaCompra {
    String produto;
    private ArrayList<String> listacompra= new ArrayList<>();
    public ListaCompra(){}
    public ListaCompra(String produto){
        this.produto = produto;
    }
    public void adicionar(String prod){
        this.listacompra.add(prod);
    }
    public void limpar(){
        this.listacompra.clear();
    }
    public ArrayList<String> getListacompra(){
        return listacompra;
    }
    public void imprimirListaCompras(){
        this.listacompra
        .forEach(p -> System.out.println("Produto: "+p));
    }
}
