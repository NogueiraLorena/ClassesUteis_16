package controller;

public class ExemploMetodoString {

	public static void main(String[] args) {
		
		String url = "http://www.senai.rj.br/ctti/turma2022039";

		String email = "aluno2022@senai.com";

		String dominio = url.substring(7,22);
		System.out.println("Domínio: "+dominio);

		String complemento = url.substring(23);
		System.out.println("Complemento "+complemento );
		
	//Variável nomeUsuario recebe os caracteres da posição 0 até a posição...
		//anterior ao @ da variável email.
		String nomeUsuario;
		nomeUsuario = email.substring(0, email.indexOf('@'));
		System.out.println("\nUsuário e-mail: " + nomeUsuario);
		
		//Outros exemplos.
		String dominioEmail = email.substring(email.indexOf('@')+1);
		System.out.println("Domínio e-mail: "+dominioEmail);

		String dominioDoEmail = email.substring(email.indexOf('@')-1);
		System.out.println("Domínio E-mail: "+dominioDoEmail);

		String dominioDeEmail = email.substring(email.indexOf('@'));
		System.out.println("Domínio e-mail: "+dominioDeEmail);


		String maiuscula;
		String minuscula;
		String palavra1 = "carro";
		String palavra2 = "CASA";

	//O conteúdo da variável palavra1 será convertido em letras maiúsculas.
		maiuscula = palavra1.toUpperCase();
		System.out.println("\nMaiuscula: "+maiuscula);

	//O conteúdo da variável palavra2 será convertido em letras minúsculas.
		minuscula = palavra2.toLowerCase();
		System.out.println("Minuscula: "+minuscula);


		
	
		
		
		
		
		
		
		
		

	}

}
