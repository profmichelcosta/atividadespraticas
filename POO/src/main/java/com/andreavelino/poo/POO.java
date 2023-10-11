package com.andreavelino.poo;
import modelo.*;
public class POO {
    public static void main(String[] args) {
        Animal cachorro = new Animal("Mamifero", "Cachorro", 4, "AUUUU!");
        cachorro.Imprimir();
        
        Veiculo ferrari = new Veiculo("Ferrari", "Spider", 2023, "QWE-1A55");
        ferrari.Imprimir();
    }
}
