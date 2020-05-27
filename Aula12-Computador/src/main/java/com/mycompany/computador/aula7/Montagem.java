/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.computador.aula7;

/**
 *
 * @author Dyogo
 */
public class Montagem {
    public static void criaComputador(){
        Computador c = new Computador();
        c.armazenamento = criaHD();
        c.memoria = criaMemoria();
        c.monitor = criaMonitor();
        c.mouse = criaMouse();
        c.processador = criaProcessador();
        c.teclado = criaTeclado();
    }
    public static Armazenamento criaHD(){
        Armazenamento a = new Armazenamento();
        a.capacidade = 500;
        a.tipo = "SSD"; 
        return a;
    }
    public static Processador criaProcessador(){
        Processador p = new Processador();
        p.marca = "HP";
        return p;
    }
    public static Memoria criaMemoria(){
        Memoria m = new Memoria();
        m.capacidade = 8;
        return m;
    }
    public static Monitor criaMonitor(){
        Monitor m = new Monitor();
        m.marca = "LG";
        m.polegadas = 15;
        return m;
    }
    public static Mouse criaMouse(){
        Mouse m = new Mouse();
        m.marca = "Razer";
        return m;
    }
    public static Teclado criaTeclado(){
        Teclado t = new Teclado();
        t.luz = true;
        t.pais = "Brasil";
        return t;
    }
    public static void main(String[] args) {
        criaComputador();
    }
}
