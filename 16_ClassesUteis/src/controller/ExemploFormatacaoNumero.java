package controller;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ExemploFormatacaoNumero {

	public static void main(String[] args) {

	
//Essa biblioteca tem como objetivo mostrar o valor de uma variável com alguma formatação diferente.

		//getCurrencyInstance significa, traduzindo, obter instância de moeda
		NumberFormat f = NumberFormat.getCurrencyInstance();
		double valor = 55008.537;
		System.out.println("\n Sem formatação: "+valor);
		        System.out.println("Formatado: "+f.format(valor));

		        //getPercentInstance significa, traduzindo, obter Porcentagem de Instância
		        NumberFormat p = NumberFormat.getPercentInstance();
		  double porcento = 0.05;
		  System.out.println("\n Sem formatação: "+porcento);
		  System.out.println("Formatado: "+p.format(porcento));

		 //getNumberInstance significa, traduzindo, obter a instância do número
		  NumberFormat n = NumberFormat.getNumberInstance();
		  double numero = 234100.50;
		  System.out.println("\n Sem formatação: "+numero);
		  System.out.println("Formatado: "+n.format(numero));


		double valor2 = 12000.5;
		  DecimalFormat df = new DecimalFormat("R$ ###,###,###.00");
		       System.out.println("\n Sem formatação :" +valor2);
		       System.out.println("Formatado: " + df.format(valor2));
		       









	
	}

}
