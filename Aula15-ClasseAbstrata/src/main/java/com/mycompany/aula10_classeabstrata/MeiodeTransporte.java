/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula10_classeabstrata;

import java.util.Arrays;

/**
 *
 * @author Dyogo
 */
public abstract class MeiodeTransporte{
    // heranca serve para quando varias classes possuem metodos e atributos semelhantes
    // seus metodos nao sao obrigatorios na classe que a herda
    int qtdrodas;
    String marca, modelo;
    public abstract void mudaStatus(); // Metodos nomeados com abstract sao obrigatorios
    public void abastecer(){
        System.out.println("Abastecido");
    
    }
    public abstract void lavar();
    public void frear(){
        System.out.println("Carro parando...");
    }
    
}
