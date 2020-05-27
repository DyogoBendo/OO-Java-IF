/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifpr.aula02;

/**
 *
 * @author Dyogo
 */
import java.util.Random;
public class Computador {
	   String marca, modelo;
	   int ano;
	   double memoria,processador,armazenamento;
    public Computador(){
    	System.out.println("****Objeto criado****");
    }
    public Computador(String x) {
    	this.marca=x;
    }
	public static void main(String[] args) {
	  int i=0;
	  while(i<10) {
	   Computador c1= new Computador("Hp"+i);
	   Random random = new Random();
	   c1.modelo="ProBook";
	   
	   int aleatorio=random.nextInt(2020)+2000;
	   c1.ano= aleatorio>2020?2020:aleatorio;
	   
	   c1.memoria=random.nextInt(8)+6;
	   c1.processador =random.nextDouble() * 4.;
	   c1.armazenamento=random.nextInt(2)+1;
	   
	   System.out.println("Computador :"+c1);
	   System.out.println("Marca "+c1.marca);
	   System.out.println("Modelo "+c1.modelo);
	   System.out.println("Ano "+c1.ano);
	   System.out.println("Memória "+c1.memoria);
	   System.out.println("Processador "+c1.processador);
	   System.out.println("Armazenamento "+c1.armazenamento);
	   i++;
	  }
   }
}
