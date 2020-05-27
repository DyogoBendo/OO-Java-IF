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
public class Automovel {
    Pneu pneu;
    Motor motor;
    Estrutura estrutura;
    Opcionais opcionais;    
    public Automovel(){
        
    }

    @Override
    public String toString() {
        return "Automovel{" + "pneu=" + pneu + ", motor=" + motor + ", estrutura=" + estrutura + ", opcionais=" + opcionais + '}';
    }
    
}

