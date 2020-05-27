/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.modificadoresacesso;

import java.util.Scanner;

/**
 *
 * @author Dyogo
 */
public class Pessoa {
    private int idade;
    public String nome;
    public Eleicoes e = new Eleicoes();
    
    public void votar(){
        e.verificaVoto(idade);
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Pessoa p = new Pessoa();
        int idade = teclado.nextInt();
        p.setIdade(idade);
        p.votar();
    }
}
