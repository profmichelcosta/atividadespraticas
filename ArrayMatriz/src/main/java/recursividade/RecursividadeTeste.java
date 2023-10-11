/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividade;

/**
 *
 * @author michel.costa
 */
public class RecursividadeTeste {
    
    static int fatorial(int num){
        if(num == 0)
            return 1;
        System.err.println(" FATORIAL: "+num*fatorial(num-1));
        return num*fatorial(num-1);
    }
    public static void main(String[] args){
        fatorial(5);
    }
}
