/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Dyogo
 */
public class FormasGeometricas2 {
    /*
    1 - Triangulo
    2 - Quadrado
    3 - Circulo
    */
    
    int tipo;
    double area, base, altura, lado, raio;
    static ArrayList<FormasGeometricas> triangulos = new ArrayList<>(); // Tamanho dinamico
    static ArrayList<FormasGeometricas> quadrados = new ArrayList<>();
    static ArrayList<FormasGeometricas> circulos = new ArrayList<>();
    
    public static void armazenar(FormasGeometricas fg, int tipo){
        switch(tipo){
            case 1: 
                triangulos.add(fg);
                break;
            case 2:
                quadrados.add(fg);
                break;
            case 3:
                circulos.add(fg);
                break;
                
        }
        
    }            
    public static void calculaAreaTriangulo(double base, double altura,FormasGeometricas fg, int tipo){
         fg.area = base * altura/2;
         armazenar(fg, tipo);
    }
    public static void calculaAreaQuadrado(double lado, FormasGeometricas fg, int tipo){
         fg.area = lado * lado;
         armazenar (fg, tipo);
    }
    public static void calculaAreaCirculo(double raio, FormasGeometricas fg, int tipo){
         fg.area = raio * raio * 3.14;
         armazenar(fg, tipo);
    }
    
    public static void informaTipo(){
        int op;
        do{
        op = Integer.parseInt(JOptionPane.showInputDialog("<html> 0 - Sair <br> 1 - Triangulo<br> 2 - Quadrado <br> 3 - Circulo<br> 4 - Mostrar </html>"));
        if(op > 0){
        verificaTipo(op);
        }
        }
        while(op!= 0);
    }
    
    public static void verificaTipo(int tipo){
        FormasGeometricas fg = new FormasGeometricas();
        switch(tipo){
            case 1: 
                fg.base = Double.parseDouble(JOptionPane.showInputDialog("Valor da Base"));
                fg.altura = Double.parseDouble(JOptionPane.showInputDialog("Valor da altura"));
                calculaAreaTriangulo(fg.base, fg.altura, fg, tipo);
                break;
            case 2:
                fg.lado = Double.parseDouble(JOptionPane.showInputDialog("Valor do lado"));
                calculaAreaQuadrado(fg.lado, fg, tipo);
                break;
            case 3: 
                fg.raio = Double.parseDouble(JOptionPane.showInputDialog("Valor do raio"));
                calculaAreaCirculo(fg.raio, fg, tipo);
                break;
            case 4: 
                mostrarResultado();
            default:
                tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor valido!"));
                verificaTipo(tipo);
                break;
        }
    }
    
    public static void mostrarResultado(){
        JPanel painel = new JPanel();
        JLabel texto = new JLabel("<html>Area: <br> <br> " + triangulos + "</html>");
        painel.setBackground(Color.pink);
        painel.setMinimumSize(new Dimension(300,300));
        painel.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
        texto.setFont(new Font("Times New Roman", 1, 20));
        painel.add(texto);
        JOptionPane.showMessageDialog(null, painel);
    }

    
    public static void main(String[] args) {
        informaTipo();
        // Metodo estatico eh importante para a classe, quando ele eh essencial
    }
    
}
