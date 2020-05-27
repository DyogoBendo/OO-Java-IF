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
public class Eleicoes {
    private int votos;
    
    public void verificaVoto(int idade){
        if (idade < 16) {
            System.out.println("Proibido votar");
        }
        else{
            System.out.println("Pode votar!");
            this.setVotos();
        }
    }
    
    public void setVotos(){
            this.votos ++;
        }
}
