/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.modificadoresacesso;

/**
 *
 * @author Dyogo
 */
public class EleicoesProf {
    public static void votar(Pessoa p){
        if (p.getIdade() >= 16) {
            System.out.println("Pode votar!");
        }
        else{
            System.out.println("Nao pode votar!");
        }
    }
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.nome = "Paulo";
        p.setIdade(15);
        
        votar(p);
    }
}
