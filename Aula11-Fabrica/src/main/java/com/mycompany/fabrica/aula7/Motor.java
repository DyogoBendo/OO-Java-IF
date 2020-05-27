/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fabrica.aula7;

/**
 *
 * @author Dyogo
 */
public class Motor {
    int hp;
    float potencia;
    String combustivel;
    public Motor(){
        
    }

    @Override
    public String toString() {
        return "Motor{" + "hp=" + hp + ", potencia=" + potencia + ", combustivel=" + combustivel + '}';
    }
    
}
