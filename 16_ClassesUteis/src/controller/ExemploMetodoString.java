package controller;

public class ExemploMetodoString {

	public static void main(String[] args) {
		
		String url = "http://www.senai.rj.br/ctti/turma2022039";

		String email = "aluno2022@senai.com";

		String dominio = url.substring(7,22);
		System.out.println("Dom�nio: "+dominio);

		String complemento = url.substring(23);
		System.out.println("Complemento "+complemento );
		
	//Vari�vel nomeUsuario recebe os caracteres da posi��o 0 at� a posi��o...
		//anterior ao @ da vari�vel email.
		String nomeUsuario;
		nomeUsuario = email.substring(0, email.indexOf('@'));
		System.out.println("\nUsu�rio e-mail: " + nomeUsuario);
		
		//Outros exemplos.
		String dominioEmail = email.substring(email.indexOf('@')+1);
		System.out.println("Dom�nio e-mail: "+dominioEmail);

		String dominioDoEmail = email.substring(email.indexOf('@')-1);
		System.out.println("Dom�nio E-mail: "+dominioDoEmail);

		String dominioDeEmail = email.substring(email.indexOf('@'));
		System.out.println("Dom�nio e-mail: "+dominioDeEmail);


		String maiuscula;
		String minuscula;
		String palavra1 = "carro";
		String palavra2 = "CASA";

	//O conte�do da vari�vel palavra1 ser� convertido em letras mai�sculas.
		maiuscula = palavra1.toUpperCase();
		System.out.println("\nMaiuscula: "+maiuscula);

	//O conte�do da vari�vel palavra2 ser� convertido em letras min�sculas.
		minuscula = palavra2.toLowerCase();
		System.out.println("Minuscula: "+minuscula);


		
	
		
		
		
		
		
		
		
		

	}

}
