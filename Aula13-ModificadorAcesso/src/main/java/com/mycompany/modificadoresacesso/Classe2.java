/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.modificadoresacesso;

/**
 *
 * @author Dyogo
 */
public class Classe2 {
    public static void main(String[] args) {
        Classe1 c = new Classe1();
        c.numero = 10; // Nao eh uma associacao, pois nao ha troca de informacoes entre as classes. 
        c.setNumero1(20);
       
        System.out.println("Numero : " + c.numero );
        System.out.println("Numero1 : " + c.getNumero1());
    }
    
}
