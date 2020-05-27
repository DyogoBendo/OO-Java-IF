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
public class Computador {
        Armazenamento armazenamento;
        Processador processador;
        Memoria memoria;
        Monitor monitor;
        Mouse mouse;
        Teclado teclado;

    @Override
    public String toString() {
        return "Computador{" + "arsmazenamento=" + armazenamento + ", processador=" + processador + ", memoria=" + memoria + ", monitor=" + monitor + ", mouse=" + mouse + ", teclado=" + teclado + '}';
    }
        
        
}
