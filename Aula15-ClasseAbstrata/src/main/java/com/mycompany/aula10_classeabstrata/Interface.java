/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula10_classeabstrata;

/**
 *
 * @author Dyogo
 */
// interface eh uma estrutura
public interface Interface { // Objetivo ser implementada, nao possui atributos
    // Interface eh tudo aquilo que permita que interaja com outro meio
    // Usar mouse, usa interface usb no computador
    // Interface eh o meio pelo qual dois objetos possa haver comunicacao
    // Serve para estabelecer  algumas regras de como sera essa interacao 
    // Tem apenas metodos
    // Serve para fazer uso de alguma coisa, que precisa de regras 
    // eh possivel usar essa interface se implementar tal metodo, tal metodo
    
    public void dirigir();
    public void envelhecer();
    public void manutenir();
}

// Criamos interfaces quando temos varias classes que fazem a mesma coisa
// Muito util para nao esquecer 
