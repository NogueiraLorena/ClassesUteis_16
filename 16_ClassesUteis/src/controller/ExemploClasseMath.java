package controller;

public class ExemploClasseMath {

	public static void main(String[] args) {

		double valSorteado = Math.random();
	    System.out.println("Valor: "+valSorteado);

	  //TypeCast expl�cita:
	    int val = (int)(valSorteado*10);
	    System.out.println("Val: "+val);

//Isso est� pegando a porcentagem e multiplicando ela por 30.
//100% � o mesmo que 100 sobre 100 e isso d� 1. Ent�o, ele pega esses valores aleat�rios,
	    //que est�o entre, valor pr�ximo de um a 50 e multiplica por 30.
	    
	     //Sorteio entre 50 e 80
	     int resultado = 50 + (int)(valSorteado*30);
	     System.out.println("\nSorteio entre 50 e 80: "+resultado);
         System.out.println();
        
	     
	     //Sorteio mega-Sena
	     for(int i=0;i<6;i++) {
	       double numeroSena = Math.random();
	         int numeroSorteado = (int)(numeroSena*61);
	          System.out.println("N�mero sorteado: "+numeroSorteado);
	     }

	   //Maior entre 2 n�meros:
	     long maior;
	     maior = Math.max(resultado, 65);
	     System.out.println("\n Entre 65 e "+resultado+"o maior valor � "+maior+"0");


	   //Menor entre 2 n�meros:
	     long menor;
	     menor = Math.min(resultado, 65);
	     System.out.println("Entre 65 e "+resultado+"o menor valor � "+menor);
//https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Global_Objects/Math/min


	     //�rea do c�rculo de raio 5:
	     double area = Math.PI * Math.pow(5, 2);
	     System.out.println("\n �rea de um c�rculo de raio 5: "+area);
	     System.out.println("Valor de PI: "+Math.PI);
	     System.out.println();
	     
	     //Raiz quadrada:
	     double raiz = Math.sqrt(81);
	     System.out.println("Raiz quadrada de 81: "+raiz);
         System.out.println();

	 //ciclo trigonom�trico
//Voc� pode fazer um programa que possa fazer isso, que possa calcular seno, cosseno e tangente.
//Um programa que fa�a modela��o gr�fica, por exemplo, precisaria ter a capacidade de calcular isso.
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
