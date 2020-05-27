/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula4_revisao;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Dyogo
 */
public class Eletrodomestico {
    
    boolean status;
    String cor;
    String marca, funcao;
    int voltagem;
    
    public Eletrodomestico(){
        this.status = false;
        this.cor = "preto"; 
        this.marca = "Boa";
        this.voltagem = 220;
        this.funcao = "processar";
    }
    
    public void mudaStatus(){
        this.status = !this.status;
    }
    public boolean verificaStatus(){
        return this.status;
    }
    public String mostraStatus(){
        if(this.verificaStatus()){
            return "O aparelho esta ligado";
        }
        else{
            return "O aparelho esta desligado";
        }
    }
    public void processarAlimento(String alimento){
        if(this.verificaStatus() && !alimento.equals(""))
        System.out.println("O alimento " + alimento + " esta sendo processado");
        else
            System.out.println("Impossivel processar, aparelho desligado");
    }
    
    public void mostraEletrodomestico(){
        JLabel texto = new JLabel("<html> <span style= 'color: navy;'> Status: </span> <span color= red>"+ mostraStatus() + " <br> </span> <span color= navy>Cor: </span> <span color= red> " + cor + " </span> <br> <span color= navy> Marca: </span> <span color= red> " + marca + "</span> <br> <span color= navy> Voltagem:</span> <span color= red> " + voltagem + "</span> <br> <span color= navy> Funcao: </span> <span color= red>" + funcao + "</span></html>");
        JPanel painel = new JPanel();
        texto.setFont(new Font("Times New Roman", 1, 20));
        painel.setBackground(Color.pink);
        painel.add(texto);
        JOptionPane.showMessageDialog(null,painel , "Eletrodomestico", JOptionPane.CLOSED_OPTION);
    }
    
    public static void limpar(){
        System.out.println("Aparelho esta limpo!");
    }
    public static void main(String[] args){
        Eletrodomestico e = new Eletrodomestico();
        limpar();
        e.mudaStatus();
        System.out.println(e.mostraStatus());
        e.processarAlimento("Banana");
        e.mostraEletrodomestico();
    }
}
// Usar metodos statics quando nao eh necessario fazer manipulacao de objetos, nem de dados. 
// Utilizados quando o objeto ja foi criado, foi usado e desejamos mostrar os dados dele 