package controller;


	import java.text.NumberFormat;
	import java.util.Locale;

	public class ExemploInternacionalizacao {

	public static void main(String[] args) {

//� s� uma instancia de c�digo.
//A variavel "valor' est� configurada para aparecer, na execu��o, como � o valor monet�rio na Fran�a.
//"f' vai sempre aparecr como valor monet�rio da Fran�a.



	Locale.setDefault(Locale.FRANCE);
	   NumberFormat f = NumberFormat.getCurrencyInstance();
	   double valor = 55008.537;
	System.out.println("Sem formata��o: "+valor);
	System.out.println("Formatado: "+f.format(valor));

	  //"nf" est� fprmatado para aparecer como o valor monet�rio do Brasil.
	//Essa formata��o n�o est� mudando o programama inteiro. � apenas em nf

	Locale local = new Locale("pt","Br");
	   NumberFormat nf = NumberFormat.getCurrencyInstance(local);
	System.out.println("Sem formata��o: "+valor);
	System.out.println("Formatado: "+nf.format(valor));




	}

}
