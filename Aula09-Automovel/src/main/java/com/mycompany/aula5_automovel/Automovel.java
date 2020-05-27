/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula5_automovel;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

/**
 *
 * @author Dyogo
 */
public class Automovel {
    String marca, modelo, cor; 
    int ano;
    double combustivel;
    boolean status, manutencao;
    static ArrayList <Automovel> lista  = new ArrayList<>();
    public static void telaInicial(){
        int resp;
        String[] escolha = {"Criar Carro", "Mostrar Carros", "Sair"};

        do{
        resp = JOptionPane.showOptionDialog(null, "O que deseja fazer?", "Automovel", 0, JOptionPane.QUESTION_MESSAGE, null, escolha, escolha[0]);
            switch (resp) {
                case 0:
                    criaCarro();
                    break;
                case 1:
                    mostraCarros();
                    break;
                default:
                    break;
            }
        } while(resp != 2); 
    }
    public static void criaCarro(){
        Automovel a = new Automovel();
        armazenar(a);
    }
    public static void armazenar(Automovel a){
        lista.add(a);
    }
    public static String textoCarros(){
        String texto = "<span style= 'color: green; font-family: Times New Roman; font-size: 30pt;'> Automoveis: </span> <br> <br> ";
        for(int i = 0; i < lista.size(); i ++){
            System.out.println(lista.get(i));
            texto += "<span style= 'color: navy; font-family: Times New Roman; font-size: 18pt;'> Carro " + (i + 1) + ": "
                    + "</span> <br> <br> <span color=red> Marca: </span> <span color=black>" + lista.get(i).marca + 
                    "</span> <br> <span color=red>  Modelo: </span> <span color=black>" + lista.get(i).modelo + " </span> <br> <span color=red> Cor:                            </span> <span color=black> "
                    + lista.get(i).cor + " </span> <br>"
                    + "<span color=red> Ano: </span> <span color=black> " + lista.get(i).ano + " </span> <br> <span color=red> Combustivel: </span> <span                       color=black> " + 
                    lista.get(i).combustivel + " </span> <br> <span color=red> Status:  </span> <span color=black> " + lista.get(i).mostraStatus() + 
                    " </span> <br> <span color=red> Manutencao: </span> <span color=black> " + lista.get(i).mostraManutencao() + "</span> <br> <br>";
        }
        return texto;
    }
    public static void mostraCarros(){
        JLabel texto = new JLabel("<html>" +  textoCarros() + "</html>");
        JScrollPane tela = new JScrollPane(texto);
        
        
        tela.getViewport().setBackground(Color.white);
        tela.setPreferredSize(new Dimension(300, 300));
        tela.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        tela.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
        JOptionPane.showMessageDialog(null, tela, "Automoveis", JOptionPane.CLOSED_OPTION);
    }
    
    public Automovel(){
        this.marca = JOptionPane.showInputDialog("Insira a marca");
        this.modelo = JOptionPane.showInputDialog("Insira o modelo");
        this.cor =  JOptionPane.showInputDialog("Insira a cor");
        this.ano = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano"));
        this.combustivel = Double.parseDouble(JOptionPane.showInputDialog("Insira o combustivel existente"));
        JOptionPane.showMessageDialog(null, this.mostraAutomovel());
        mostraOpcoes();
    }
    
    public final String mostraAutomovel(){
        String texto = "<html> <span color=red> Marca: </span> <span color=black>" + this.marca + 
                    " </span> <br> <span color=red>  Modelo: </span> <span color=black>" + this.modelo + " </span> <br> <span color=red> Cor: </span> <span color=black> "
                    + this.cor + " </span> <br>"
                    + "<span color=red> Ano: </span> <span color=black> " + this.ano + " </span> <br> <span color=red> Combustivel: </span> <span color=black> " + 
                    this.combustivel + " </span> <br> <span color=red> Status:  </span> <span color=black> " + this.mostraStatus() + 
                    " </span> <br> <span color=red> Manutencao: </span> <span color=black>" + this.mostraManutencao() + " </span><br> <br> </html>";
        return texto;
    }
    
    public final void mostraOpcoes(){
        String[] escolha = {"Manutenir", "Rodar", "Ligar/Desligar", "Mostrar Automovel", "Sair"};
        int resp;
        do{
        resp = JOptionPane.showOptionDialog(null, "O que deseja fazer?", "Automovel", 0, JOptionPane.QUESTION_MESSAGE, null, escolha, escolha[0]);
            switch (resp) {
                case 0:
                    mudaManutencao();
                    break;
                case 1:
                    rodar();
                    break;
                case 2:
                    mudaStatus();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, this.mostraAutomovel());
                    break;
                default:
                    break;
            }
        } while(resp != 4); 
    }
    
    public String mostraStatus(){
        if (status) {
            return "O carro esta ligado";
        } else{
            return "O carro esta desligado";
        }
    }
    public void mudaStatus(){
        this.status = !this.status;
    }
    public boolean verificaStatus(){
        return status; 
    }
    
    public void mudaManutencao(){
        if (!manutencao) {
            JOptionPane.showMessageDialog(null, "O carro agora esta em manutencao");
            manutencao = true;
        }
        else{
            JOptionPane.showMessageDialog(null, "O carro saiu da manutencao");
            manutencao = false;
        }
    }
    
    public String mostraManutencao(){
        if (manutencao) {
            return "O carro esta em manutencao";
        }
        else{
            return "O carro nao esta em manutencao";
        }
    }
    public boolean verificaManutencao(){
        return manutencao;
    }
    
    public void abastecer(){
        if (verificaStatus() && combustivel < 100) {
            JOptionPane.showMessageDialog(null, "O carro esta sendo abastecido...");
            combustivel = 100; 
        }
        else if(!verificaStatus() && combustivel >= 100){
            JOptionPane.showMessageDialog(null, "Impossivel abastecer, carro esta ligado e o combustivel cheio!");
        }
        else if(!verificaStatus()){
            JOptionPane.showMessageDialog(null, "Impossivel abastecer, carro esta ligado!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Impossivel abastecer, combustivel cheio!");
        }
    }
    
    public void rodar(){
        if (verificaStatus() && !verificaManutencao()) {
            JOptionPane.showMessageDialog(null, "Carro esta rodando...");
        }
        else{
            if (!verificaStatus() && verificaManutencao()) {
                JOptionPane.showMessageDialog(null, "Impossivel andar! Carro esta desligado e em manutencao...");
            }
            else if(!verificaStatus()){
                JOptionPane.showMessageDialog(null, "Impossivel andar! Carro esta desligado...");
            }
            else{
                JOptionPane.showMessageDialog(null, "Impossivel andar! Carro em manutencao...");
            }
            
        }
    }
    
    public static void main(String[] args) {
        telaInicial();
    }
}
