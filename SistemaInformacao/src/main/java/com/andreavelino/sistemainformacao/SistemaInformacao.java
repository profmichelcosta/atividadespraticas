/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.andreavelino.sistemainformacao;

import java.util.ArrayList;
import model.Pessoa;

/*
 * @author michel.costa
 */
public class SistemaInformacao {

    public static void main(Pessoa[] args) {
        Pessoa p = new Pessoa();
        Pessoa joao = new Pessoa("Joao", "999.999.999-00");
        Pessoa julia = new Pessoa("Julia", "999.999.999-00");
        ArrayList<Pessoa> listapessoas  = new ArrayList<>();
        listapessoas.add(joao);
        listapessoas.add(julia);
        listapessoas.add(joao);
        listapessoas.add(joao);
        listapessoas.size();
        
        
        System.out.println("Numero elementos: "+
                listapessoas.size());
        
    }  
}
