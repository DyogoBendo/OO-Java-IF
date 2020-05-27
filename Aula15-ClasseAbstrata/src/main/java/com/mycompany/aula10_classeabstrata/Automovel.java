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
public class Automovel extends MeiodeTransporte implements Interface {

    @Override // Sinal de @ significa comentario, que nao eh ignorado pelo compilador, chamado de anotacao
    public void dirigir() {
        System.out.println("Pisar no acelarador");
    }

    @Override
    public void mudaStatus() {
        System.out.println("Liga");
    }
    public static void main(String[] args) {
        Automovel auto = new Automovel();
        auto.marca = "Fiat";
        auto.modelo = "Uno";
        auto.qtdrodas = 4;
        auto.abastecer();
        auto.dirigir();
        auto.envelhecer();
        auto.lavar();
        auto.manutenir();
        auto.mudaStatus();
        
    }

    @Override
    public void lavar() {
        System.out.println("O sapo nao lava o pe, mas eu lavo o automovel");
    }

    @Override
    public void envelhecer() {
        System.out.println("Na vida, tudo envelhece");
    }

    @Override
    public void manutenir() {
        System.out.println("Tamo arrumando");
    }
}
