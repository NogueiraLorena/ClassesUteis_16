package controller;

public class ExemploClasseMath {

	public static void main(String[] args) {

		double valSorteado = Math.random();
	    System.out.println("Valor: "+valSorteado);

	  //TypeCast explícita:
	    int val = (int)(valSorteado*10);
	    System.out.println("Val: "+val);

//Isso está pegando a porcentagem e multiplicando ela por 30.
//100% é o mesmo que 100 sobre 100 e isso dá 1. Então, ele pega esses valores aleatórios,
	    //que estão entre, valor próximo de um a 50 e multiplica por 30.
	    
	     //Sorteio entre 50 e 80
	     int resultado = 50 + (int)(valSorteado*30);
	     System.out.println("\nSorteio entre 50 e 80: "+resultado);
         System.out.println();
        
	     
	     //Sorteio mega-Sena
	     for(int i=0;i<6;i++) {
	       double numeroSena = Math.random();
	         int numeroSorteado = (int)(numeroSena*61);
	          System.out.println("Número sorteado: "+numeroSorteado);
	     }

	   //Maior entre 2 números:
	     long maior;
	     maior = Math.max(resultado, 65);
	     System.out.println("\n Entre 65 e "+resultado+"o maior valor é "+maior+"0");


	   //Menor entre 2 números:
	     long menor;
	     menor = Math.min(resultado, 65);
	     System.out.println("Entre 65 e "+resultado+"o menor valor é "+menor);
//https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Global_Objects/Math/min


	     //Área do círculo de raio 5:
	     double area = Math.PI * Math.pow(5, 2);
	     System.out.println("\n Área de um círculo de raio 5: "+area);
	     System.out.println("Valor de PI: "+Math.PI);
	     System.out.println();
	     
	     //Raiz quadrada:
	     double raiz = Math.sqrt(81);
	     System.out.println("Raiz quadrada de 81: "+raiz);
         System.out.println();

	 //ciclo trigonomêtrico
//Você pode fazer um programa que possa fazer isso, que possa calcular seno, cosseno e tangente.
//Um programa que faça modelação gráfica, por exemplo, precisaria ter a capacidade de calcular isso.
	     double sen;
	     double cos;
	     double tan;
	     double a = 60;
	     sen = Math.sin(Math.toRadians(a));
	     tan =  Math.tan(Math.toRadians(a));
         cos = Math.cos(Math.toRadians(a));
	     
	     System.out.println("Seno: "+sen);
	     System.out.println("Cosseno: "+cos);
	     System.out.println("Tangente:"+tan);
         System.out.println();
	     
	     double acos = Math.acos(Math.toRadians(a));
      System.out.println("Arco cosseno de 60: "+acos);
		
	     double acos2 = 0.14;
	  Math.acos(Math.toRadians(acos2));
	  System.out.println("Arco cosseno de 0,14: "+acos2);

		
		
		
		
		
		
		
		
	}

}
