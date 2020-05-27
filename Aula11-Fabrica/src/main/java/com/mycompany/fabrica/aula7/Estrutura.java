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
public class Estrutura {
    float peso, largura, altura;
    String cor;
    public Estrutura(){
        
    }

    @Override
    public String toString() {
        return "Estrutura{" + "peso=" + peso + ", largura=" + largura + ", altura=" + altura + ", cor=" + cor + '}';
    }
    
}
