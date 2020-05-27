/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula2;

import java.util.Random;

/**
 *
 * @author Dyogo
 */
public class Computador2 {
    String marca, modelo;
    int ano; 
    double memoria, processador, armazenamento;
    
    public String gerarMarca(){
        Random gerador = new Random();
        String[] marcas = {"HP", "Acer", "Dell", "LeNovo", "Asus"};
        return marcas[gerador.nextInt(5)];
    }
    
    public void setStatus(){
        Random gerador = new Random();
       
        this.marca = gerarMarca();
        this.modelo = "ProBook";
        this.ano = gerador.nextInt(21) + 2000;
        this.memoria = gerador.nextInt(3) + 6 ;
        this.processador = gerador.nextDouble() + 2.4; 
        this.armazenamento = gerador.nextInt(2) + 1;
    }
    
    public void mostraStatus(int i){
        System.out.println("-------------------- " + this+" ------------------------");
            System.out.println("Computador :" + i);
            System.out.println("Marca " + this.marca);
            System.out.println("Modelo " + this.modelo);
            System.out.println("Ano " + this.ano);
            System.out.println("Memoria " + this.memoria);
            System.out.printf("Processador %.2f", this.processador);
            System.out.println();
            System.out.println("Armazenamento " + this.armazenamento);
    }
   
    public static void main(String[] args) {
        for(int i = 0; i < 10; i ++){
            Computador2 c = new Computador2();
            c.setStatus();
            c.mostraStatus(i + 1);
        }
        
    }
    
}
