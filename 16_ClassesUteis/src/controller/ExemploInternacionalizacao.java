package controller;


	import java.text.NumberFormat;
	import java.util.Locale;

	public class ExemploInternacionalizacao {

	public static void main(String[] args) {

//É só uma instancia de código.
//A variavel "valor' está configurada para aparecer, na execução, como é o valor monetário na França.
//"f' vai sempre aparecr como valor monetário da França.



	Locale.setDefault(Locale.FRANCE);
	   NumberFormat f = NumberFormat.getCurrencyInstance();
	   double valor = 55008.537;
	System.out.println("Sem formatação: "+valor);
	System.out.println("Formatado: "+f.format(valor));

	  //"nf" está fprmatado para aparecer como o valor monetário do Brasil.
	//Essa formatação não está mudando o programama inteiro. É apenas em nf

	Locale local = new Locale("pt","Br");
	   NumberFormat nf = NumberFormat.getCurrencyInstance(local);
	System.out.println("Sem formatação: "+valor);
	System.out.println("Formatado: "+nf.format(valor));




	}

}
