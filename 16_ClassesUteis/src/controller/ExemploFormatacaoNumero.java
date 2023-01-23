package controller;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ExemploFormatacaoNumero {

	public static void main(String[] args) {

	
//Essa biblioteca tem como objetivo mostrar o valor de uma vari�vel com alguma formata��o diferente.

		//getCurrencyInstance significa, traduzindo, obter inst�ncia de moeda
		NumberFormat f = NumberFormat.getCurrencyInstance();
		double valor = 55008.537;
		System.out.println("\n Sem formata��o: "+valor);
		        System.out.println("Formatado: "+f.format(valor));

		        //getPercentInstance significa, traduzindo, obter Porcentagem de Inst�ncia
		        NumberFormat p = NumberFormat.getPercentInstance();
		  double porcento = 0.05;
		  System.out.println("\n Sem formata��o: "+porcento);
		  System.out.println("Formatado: "+p.format(porcento));

		 //getNumberInstance significa, traduzindo, obter a inst�ncia do n�mero
		  NumberFormat n = NumberFormat.getNumberInstance();
		  double numero = 234100.50;
		  System.out.println("\n Sem formata��o: "+numero);
		  System.out.println("Formatado: "+n.format(numero));


		double valor2 = 12000.5;
		  DecimalFormat df = new DecimalFormat("R$ ###,###,###.00");
		       System.out.println("\n Sem formata��o :" +valor2);
		       System.out.println("Formatado: " + df.format(valor2));
		       









	
	}

}
