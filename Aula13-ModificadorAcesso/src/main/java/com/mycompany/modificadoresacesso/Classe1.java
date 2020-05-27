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
public class Classe1 {
    // Encapsulamento significa proteger, esse conceito explica o que eh e a funcao dos metodos de acesso
    // Interface eh o que permite a uniao entre duas coisas diferentes 
    // Nesse caso, a nossa interface eh o get e set, que tem regras encapsuladas, possibiltando a comunicacao, mesmo que a outra classe nao tenha acesso aos atributos
    // Encapsular eh permitir acesso a coisas internas, de acordo com a suas regras, com uma protecao. Assim, ela nao precisa saber como funciona internamente, precisando saber usar apenas externa. 
    
    public int numero; // Se nao houver modificadores, eh automaticamente publico
    private int numero1; // Modificadores de acesso nao fazem diferenca dentro da classe
    
    public void setNumero1(int n){
        if (n%2==0) {
            this.numero1 = n;
        }
        else{
            System.out.println("Valor invalido!");
        }
        
    }
    
    public int getNumero1 (){
        return this.numero1;
    }
    
}
