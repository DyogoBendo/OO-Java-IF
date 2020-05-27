/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.banco_aula9;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Dyogo
 */
public class Cofre {
    ArrayList<Moeda> dindin = new ArrayList<>();
    private int senha;
    String nome;
    public void setSenha(){
            int senha_nova;
            do {
                senha_nova = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite uma senha de 6 digitos"));
            } while (senha_nova > 1000000 || 99999 > senha_nova);
            this.senha = senha_nova;
        }
    public int getSenha(){
        return this.senha;
    }
    
}
