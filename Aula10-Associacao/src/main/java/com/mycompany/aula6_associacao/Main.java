/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula6_associacao;

/**
 *
 * @author Dyogo
 */
public class Main {
    Pessoa p;
    Trabalho t;
    // Agregacao sempre precisa de 3 classes - Uma tercira classe une 2 classes independentes
    
    public void agregar(Pessoa p, Trabalho t){
        this.p = p;
        this.t = t;
    }
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.nome = "Asdrubaldo";
        p.idade = 28; 
        
        Trabalho t = new Trabalho();
        t.jornada = 20;
        t.nome = "Analista";
        t.salario = 5000;
        t.local = "Microsoft";
        
        Main m = new Main();
        m.agregar(p, t);
        
        System.out.println(m.p.nome + " - "+ m.t.nome);
        System.out.println("Local de trabalho" + m.t.local);
    }
}
