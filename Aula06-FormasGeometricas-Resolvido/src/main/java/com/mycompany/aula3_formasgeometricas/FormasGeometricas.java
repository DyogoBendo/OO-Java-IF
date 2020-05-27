/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula3_formasgeometricas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
// import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author Dyogo
 */
public class FormasGeometricas {
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
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "<html> 0 - Sair <br> 1 - Triangulo<br> 2 - "
                + "Quadrado <br> 3 - Circulo<br> 4 - Mostrar </html>", "Formas Geometricas", JOptionPane.CLOSED_OPTION));
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
                fg.base = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor da Base", "Triângulo", JOptionPane.CLOSED_OPTION));
                fg.altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor da Altura", "Triângulo", JOptionPane.CLOSED_OPTION));
                calculaAreaTriangulo(fg.base, fg.altura, fg, tipo);
                break;
            case 2:
                fg.lado = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor do Lado", "Quadrado", JOptionPane.CLOSED_OPTION));
                calculaAreaQuadrado(fg.lado, fg, tipo);
                break;
            case 3: 
                fg.raio = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor do Raio", "Círculo", JOptionPane.CLOSED_OPTION));
                calculaAreaCirculo(fg.raio, fg, tipo);
                break;
            case 4: 
                mostrarResultado();
                break;
            default:
                tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor valido!"));
                verificaTipo(tipo);
                break;
        }
    }
    
    public static String mostraTriangulo(){
        String triangulo = "<i>Triangulos: </i> <br> <br>";
        for(int i = 0; i < triangulos.size(); i ++){
            triangulo += "<u>Triangulo " + (i + 1) + ": </u> <br> Base: " + triangulos.get(i).base + 
                    "<br> Altura: " + triangulos.get(i).altura+ "<br> Area: " + triangulos.get(i).area + "<br> <br>";
        }
        return triangulo;
    }
    
    public static String mostraQuadrado(){
        String quadrado = "<i> Quadrados: </i> <br> <br>";
        for (int i = 0; i < quadrados.size(); i ++){
            quadrado += "<u> Quadrado " + (i + 1) + ": </u> <br> Lados: " + quadrados.get(i).lado + "<br> Area: " 
                    + quadrados.get(i).area + "<br> <br>";
        }
        return quadrado;
    }
    
    public static String mostraCirculo(){
        String circulo = "<i> Circulos: </i> <br> <br>";
        for(int i = 0; i < circulos.size(); i ++){
            circulo += "<u>Circulo " + (i + 1) + " </u> <br> Raio: " + circulos.get(i).raio + "<br> Area: " 
                    + circulos.get(i).area + "<br> <br>"; 
        }
        return circulo;
    }
    
    public static void mostrarResultado(){
       
        JLabel texto = new JLabel("<html>" + mostraTriangulo() + mostraQuadrado() + mostraCirculo() + "</html>");
        texto.setFont(new Font("Times New Roman", 1, 20));
        /*
        JPanel painel = new JPanel();
 
        painel.setPreferredSize(new Dimension(100, 3500));
        painel.setBackground(Color.pink);
        painel.add(texto);
        
        
        JFrame janela = new JFrame();
        janela.setContentPane(painel);
        janela.pack();
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setVisible(true);
        */
        JScrollPane scroll = new JScrollPane(texto);
        scroll.getViewport().setBackground(Color.pink);
        scroll.setPreferredSize(new Dimension(100, 500));
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
        JOptionPane.showMessageDialog(null, scroll, "Formas Geometricas", JOptionPane.CLOSED_OPTION);
    }

    
    public static void main(String[] args) {
        informaTipo();
        // Metodo estatico eh importante para a classe, quando ele eh essencial
    }
    
}
