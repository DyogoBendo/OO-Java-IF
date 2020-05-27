/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifpr;

/**
 *
 * @author Dyogo
 */
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class Pessoa {

    String nome;
    int nascimento, idade;
    static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

    public Pessoa() {

    }

    public int calculaIdade(Pessoa p) {
        Calendar cal = GregorianCalendar.getInstance();
        int idade_final = cal.get(Calendar.YEAR) - p.nascimento;
        return idade_final;
    }

    public void dadosObjeto(int i) {
        this.nome = JOptionPane.showInputDialog("Nome");
        this.nascimento = Integer.parseInt(JOptionPane.showInputDialog("Ano de Nascimento"));
        this.idade = this.calculaIdade(this);
    }

    public static void imprimir() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Nome :" + pessoas.get(i).nome);
            System.out.println("Nascimento :" + pessoas.get(i).nascimento);
            System.out.println("Idade " + pessoas.get(i).idade);
        }
    }

    public void armazenar() {
        pessoas.add(this);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Pessoa p = new Pessoa();
            p.dadosObjeto(i);
            p.armazenar();

        }
        imprimir();
    }
}
