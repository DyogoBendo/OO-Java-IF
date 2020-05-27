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
public class Computador {
    String marca, modelo;
    int ano; 
    double memoria, processador, armazenamento;
    
    public Computador() {
        Random gerador = new Random();
       
        this.modelo = "ProBook";
        this.marca = gerarMarca();
        this.ano = gerador.nextInt(21) + 2000;
        this.memoria = gerador.nextInt(3) + 6 ;
        this.processador = gerador.nextDouble() * 0.9 + 2.4; 
        this.armazenamento = gerador.nextInt(2) + 1;
    }
    
    public  Computador[] criaObjeto(int quantidade){
        Computador c[] = new Computador[quantidade];
        for(int i = 0; i < quantidade; i ++){
            c[i] = new Computador();
        }
        return c;
    }
    
    public String gerarMarca(){
        Random gerador = new Random();
        String[] marcas = {"HP", "Acer", "Dell", "LeNovo", "Asus"};
        return marcas[gerador.nextInt(5)];
    }
    
    public void mostrarComputador(Computador c1[]){
        for(int i = 0; i < c1.length; i ++){
            System.out.println("-----------------"+c1[i]+"---------------------------");
            System.out.println("Computador :" + (i + 1));
            System.out.println("Marca " + c1[i].marca);
            System.out.println("Modelo " + c1[i].modelo);
            System.out.println("Ano " + c1[i].ano);
            System.out.println("Memoria " + c1[i].memoria);
            System.out.printf("Processador %.2f", c1[i].processador);
            System.out.println();
            System.out.println("Armazenamento " + c1[i].armazenamento);
        }
    }
   
    public static void main(String[] args) {
        Computador pc = new Computador();
        pc.mostrarComputador(pc.criaObjeto(10));
    }
}
