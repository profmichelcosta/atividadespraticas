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
public class ListaPessoa {
    
    private ArrayList<Pessoa> lista= new ArrayList<>();
    
    public ListaPessoa(Pessoa p){
        this.lista.add(p);
    }
    public ListaPessoa(){
    }
    public void adicionar(Pessoa p){
        this.lista.add(p);
    }
    public void limpar(){
        this.lista.clear();
    }
    public ArrayList<Pessoa> getListaPessoa(){
        return this.lista;
    }
    String dados="";
    public String imprimirListaPessoa(){
        
        for(Pessoa p: getListaPessoa()){
            dados = " Nome: "+p.getNome()+ " CPF: "+ p.getCpf();
        }
        return dados;
    }
}
