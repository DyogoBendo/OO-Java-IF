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
public class Montagem {
    public Montagem(){
        
    }
    
    public Automovel criarAutomovel(){
        Automovel a = new Automovel();
        return a;
    }
    
    public Motor criaMotor(){
        Motor m = new Motor();
        m.combustivel= "Gasolina";
        m.hp = 2000;
        m.potencia = 2;
        return m;
    }
    public Pneu criarPneu(){
        Pneu p = new Pneu();
        p.raio = 17;
        p.marca = "Goodyear";
        p.largura = 7;
        return p; 
    }
    
    public Opcionais criarOpcionais(){
        Opcionais op = new Opcionais();
        op.airbag = true;
        op.arCondicionado = true;
        return op;
    }
    
    public void mostrarAutomoveis(Automovel a){
        System.out.println(a); // metodo magico toString
    }
    
    public static void main(String[] args) {
        Montagem m = new Montagem();
        Automovel a = m.criarAutomovel();
        a.motor = m.criaMotor();
        a.pneu = m.criarPneu();
        a.opcionais = m.criarOpcionais();
        m.mostrarAutomoveis(a);
    }
    
    
}
