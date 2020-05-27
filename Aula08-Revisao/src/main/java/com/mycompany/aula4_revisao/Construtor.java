/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula4_revisao;

import java.util.ArrayList;

/**
 *
 * @author Dyogo
 */
public class Construtor {
    String nome;
    int idade;
    static ArrayList<Construtor> lista = new ArrayList<>();  // <> generalizacao, indica o que vai conter dentro
    public Construtor(){ // Metodo magico
        
    }
    public Construtor(Construtor c){
        c.idade = 16;
        c.nome = "Anacleto";
    }
    public Construtor (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public static void main(String[] args) {
        Construtor c = new Construtor();
        c.nome="Asdrubaldo";
        c.idade=15;
        
        
        Construtor c1 = new Construtor(c);
        
        Construtor c2 = new Construtor("Bactrim", 17);
        
        lista.add(c);
        lista.add(c1);
        lista.add(c2);
        
        for(int i = 0; i < lista.size(); i ++ ){
            System.out.println("Elemento 1: nome: " + lista.get(i).nome + " idade: " + lista.get(i).idade); // Codif
        }
    }
}
