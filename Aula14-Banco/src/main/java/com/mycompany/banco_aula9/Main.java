/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.banco_aula9;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Dyogo
 */
public class Main {
    static Banco b;
    static Cofre c;
    static Moeda m;
    static ArrayList <Banco> Bancos = new ArrayList <>();
    
    
    public static void mostraMenu(){
        int optMenu;
        String [] escolha_opt = {"Adicionar novo banco", "Ver bancos existentes", "Extrato do banco", "Sair"};
        do {
            optMenu = JOptionPane.showOptionDialog(null, "O que deseja fazer?", "Menu", 0, JOptionPane.QUESTION_MESSAGE, null, escolha_opt, escolha_opt[0]);
            switch(optMenu){
                case 0: 
                    adicionarBanco();
                    break;
                case 1:
                    mostraBancos();
                    break;
                case 2:
                    mostraExtrato();
                    break;
                case 3: 
                    break;
                default:
                    break;
                       
        }
        }while (optMenu != 3);
    }
    
    public static void adicionarBanco(){
        int optBanco;
        do {
           Banco b = new Banco();
           b.nome = JOptionPane.showInputDialog(null, "Nome do banco");
           Bancos.add(b);
           optBanco = Integer.parseInt(JOptionPane.showInputDialog(null, "Sair Banco? (0)"));
        }while(optBanco!=0);
    }
    
    public static void mostraBancos(){
        String [] escolha_banco = new String[Bancos.size() + 1];
        int opt;
        for (int i = 0; i < escolha_banco.length - 1; i++) {
            escolha_banco[i] = Bancos.get(i).nome;
        }
        escolha_banco[escolha_banco.length - 1] = "Voltar ao menu"; 
        opt = JOptionPane.showOptionDialog(null, "Qual banco deseja entrar?", "Bancos", 0, JOptionPane.QUESTION_MESSAGE, null, escolha_banco, escolha_banco[0]);
        if (opt == escolha_banco.length - 1) {
            mostraMenu();
        }
        else{
            menuContas(opt);
        }
    }
    public static void menuContas(int banco){
        String [] opt_conta = {"Adicionar conta", "Ver contas", "Voltar aos bancos"};
        int conta;
        conta = JOptionPane.showOptionDialog(null, "O que deseja fazer? ", "Menu de Contas", 0, JOptionPane.QUESTION_MESSAGE, null, opt_conta, opt_conta[0]);
        switch(conta){
            case 0: 
               adicionaConta(banco);
               break;
            case 1:
                mostraConta(banco);
                break;
            case 2: 
                mostraBancos();
                break;
            default:
                break;
        }
    }
    public static void adicionaConta(int banco){
        Cofre conta = new Cofre();
        conta.nome = JOptionPane.showInputDialog(null, "Digite o nome da conta");
        conta.setSenha();
        Bancos.get(banco).cofrinho.add(conta);
        menuContas(banco);
    }
    
    public static void mostraConta(int banco){
        
        int opt;
        String[] contas_nome = new String [Bancos.get(banco).cofrinho.size() + 1];
        for (int i = 0; i < Bancos.get(banco).cofrinho.size(); i++) {
            contas_nome[i] = Bancos.get(banco).cofrinho.get(i).nome;
        }
        
        contas_nome[contas_nome.length - 1] = "Voltar ao menu de contas";
        opt = JOptionPane.showOptionDialog(null, "Escolha a conta", "Contas", 0, JOptionPane.QUESTION_MESSAGE, null, contas_nome, contas_nome[0]);

        
        if (opt == Bancos.get(banco).cofrinho.size()) {
            menuContas(banco);
        }
        else{
            
            abrirConta(banco, opt);
        }
    }
    
    public static void abrirConta(int banco, int conta){
        
        Cofre cofre = new Cofre();
        cofre = Bancos.get(banco).cofrinho.get(conta);
        int i = 0, senha;
        do {
            senha = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a senha da conta"));
            i ++;
        } while (cofre.getSenha() != senha && i < 3);
        if (i == 3) {
            JOptionPane.showMessageDialog(null, "Atingiu maximo de tentativas");
            menuContas(banco);
        }
        
        else{
            menuMoeda(cofre);
        }
    }
    public static void menuMoeda(Cofre cofre){
        String[] opt = {"Adicionar valor", "Ver valores", "Voltar menu"};
        int escolha = 0;
        escolha = JOptionPane.showOptionDialog(null, "Valores", "O que fazer na conta?", 0, JOptionPane.QUESTION_MESSAGE, null, opt, opt[0]);
        switch(escolha){
            case 0:
                adicionarValor(cofre);
                break;
            case 1: 
                mostrarValor(cofre);
                break;
            case 2:
                mostraBancos();
                break;
            default:
                break;
        }
    }
    
    public static void adicionarValor(Cofre cofre){
        int valor;
        String[] moeda = {"Reais", "Euros", "Dolares", "Guarani", "Peso", "Libras"};
        int pos;
        do {
            Moeda m = new Moeda();
            valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor - 0 para sair"));
            if (valor == 0) {
                break;
            }
            pos = JOptionPane.showOptionDialog(null, "Valores", "Digite a moeda", 0, JOptionPane.QUESTION_MESSAGE, null, moeda, moeda[0]);
            m.valores += valor;
            m.tipo = moeda[pos];
            cofre.dindin.add(m);
            
        } while (valor != 0);
        menuMoeda(cofre);
    }
    
    public static void mostrarValor(Cofre cofre){
        String texto = "";
        String[] moedas = {"Reais", "Euros", "Dolares", "Guarani", "Peso", "Libras"};
        int[] valores = {0, 0, 0, 0, 0, 0};
        int valor;
        String moeda;
        Arrays.sort(moedas);
        
        texto += "<html> Conta: " + cofre.nome + "<br> <br>";
        for (int i = 0; i < cofre.dindin.size(); i++) {
            texto +=  "Deposito: " + cofre.dindin.get(i).valores + " " + cofre.dindin.get(i).tipo + "<br> <br>";
        }
        texto += "Valor total: <br>";
        for (int i = 0; i < cofre.dindin.size(); i++) {
            valor = cofre.dindin.get(i).valores;
            moeda = cofre.dindin.get(i).tipo;
            if (Arrays.binarySearch(moedas, moeda) >= 0) {
                valores[Arrays.binarySearch(moedas, moeda)] += valor;
            }
        }
        for (int i = 0; i < moedas.length; i++) {
            texto+= valores[i] + " " + moedas[i] +"<br>";
        }
        texto += "</html>";
        JOptionPane.showMessageDialog(null, texto);
        menuMoeda(cofre);
    }
    
    public static void mostraExtrato(){
        String banco = ""; 
        String moeda = "";
        String[] moedas = {"Reais", "Euros", "Dolares", "Guarani", "Peso", "Libras"};
        Arrays.sort(moedas);
        int valor = 0;
        String textos = "<html> Numero total de bancos: " + Bancos.size() + " <br> <br> ";
        
        for (int i = 0; i < Bancos.size(); i++) {
            banco = Bancos.get(i).nome;
            textos += "<span style= 'color: navy; font-family: Times New Roman; font-size: 15pt;'> Banco: " + banco + "</span> <br>";
            int[] valores = {0, 0, 0, 0 , 0, 0};
            textos += "Numero de contas: " +  Bancos.get(i).cofrinho.size() + "<br>";
            for (int j = 0; j < Bancos.get(i).cofrinho.size(); j++) {
                for (int k = 0; k < Bancos.get(i).cofrinho.get(j).dindin.size(); k++) {
                    valor = Bancos.get(i).cofrinho.get(j).dindin.get(k).valores; 
                    moeda = Bancos.get(i).cofrinho.get(j).dindin.get(k).tipo;
                    if (Arrays.binarySearch(moedas, moeda) >= 0) {
                        valores[Arrays.binarySearch(moedas, moeda)] += valor;
                    }
                }
            }
            for (int j = 0; j < moedas.length; j++) {
                textos += "<br> " + valores[j] + " " + moedas[j];
            }
            
            textos += "<br> <br> <br> ";
        }
        textos += "</html>";
        JOptionPane.showMessageDialog(null, textos);
    }
    public static void main(String[] args) {
        // Guardar outros bancos, imprimir um relatorio em cada banco e somar tudo
            mostraMenu();
        
    }
}
