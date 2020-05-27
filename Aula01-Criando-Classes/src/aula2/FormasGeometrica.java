package aula2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class FormasGeometrica {
	/*
	 1 - triangulo
	 2 - quadrado
	 3 - circulo
	*/
	int tipo;
	double area,base,altura;
	static ArrayList<FormasGeometrica> triangulos = new ArrayList<FormasGeometrica>();
	public static void armazenar(FormasGeometrica fg) {
		triangulos.add(fg);
	}
    public static void calculaAreaTriangulo(double base,double altura,FormasGeometrica fg) {
    	fg.area= base*altura/2;
    	armazenar(fg);
    }
    public static void verificaTipo(int tipo) {
    	FormasGeometrica fg = new FormasGeometrica();
    	switch (tipo) {
		case 1:
		  fg.base=Double.parseDouble(
				                  JOptionPane.showInputDialog("Valor da Base")
				                  );
		  fg.altura=Double.parseDouble(
				                 JOptionPane.showInputDialog("Valor da altura")
				                 );	
		 calculaAreaTriangulo(fg.base, fg.altura,fg);
			break;

		
		case 4:
			 imprimir();
			 
			break;
		default:
			System.out.println("Op��o inv�lida!!");
			break;
		}
    }
    public static void imprimir() {
    	System.out.println(triangulos);
    }
    public static void informaTipo() {
    	int op;
    	do {
    	   op=Integer.parseInt(
                JOptionPane.showInputDialog("0 - Sair\n"
                		+ "1- Triangulo\n"
                		+ "2 - Retangulo\n"
                		+ "3- C�rculo"
                		+ "4-Imprimir")
                );
    	    verificaTipo(op);
    	}while(op!=0);
    }
    public void imprimeArea() {
    	JOptionPane.showMessageDialog(null,"O valor da �rea � :"+area);
    }
    public static void main(String[] args) {
    	informaTipo();
		
	}
}
