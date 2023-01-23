package controller;


	import java.text.DateFormat;
	import java.util.Calendar;
	import java.util.Date;
	import java.util.GregorianCalendar;
import java.util.TimeZone;

	public class ExemploFormatData {

	public static void main(String[] args) {

	 Date data = new Date();
	 System.out.println("Data: "+data);

	      //Date t� riscado porque, provavelmente, n�o estar� mais na biblioteca java futuramente.
	 //Esse parametro da biblioteca java.util j� est� em desuso atualmente.
	 //Para mostrar a data que voc� quer, voc� tem que calcular
	 
	 
	 //Date dataInserida = new Date(100,9,14); System.out.println("Data Inserida: "+dataInserida);//
//comentei para sair o warnning//
	
	 Calendar data2 = new GregorianCalendar();
	System.out.println("\nData: "+data2);

	//data2.set(2011,3,19);
	System.out.println("Data 2 inserida: "+data2);
	System.out.println("\nM�s: "+data2.get(Calendar.MONTH));
	System.out.println("Dia da Semana: "+data2.get(Calendar.DAY_OF_WEEK));
	System.out.println("Dia do M�s: "+data2.get(Calendar.DAY_OF_MONTH));
	System.out.println("Dia do Ano: "+data2.get(Calendar.DAY_OF_YEAR));

	//Apesar de estarmos no m�s de maio, na execu��o, aparecer� como m�s 4.
	// o sistema conta Janeiro como m�s 0


	//� poss�vel definir a formata��o de local nessa formata��o de data
	//locale.setDefault(Locale.US);


	DateFormat dfFull = DateFormat.getDateInstance(DateFormat.FULL);
	System.out.println("\nData Full: "+dfFull.format(data2.getTime()));

	DateFormat dfLong = DateFormat.getDateInstance(DateFormat.LONG);
	System.out.println("Data LONG: "+dfLong.format(data2.getTime()));

	DateFormat dfMedium = DateFormat.getDateInstance(DateFormat.MEDIUM);
	System.out.println("Data MEDIUN: "+dfMedium.format(data2.getTime()));

	DateFormat dfShort = DateFormat.getDateInstance(DateFormat.SHORT);
	System.out.println("Data SHORT: "+dfShort.format(data2.getTime()));

	//usamos o timezone de java.util. N�o foi o timezone sql
	TimeZone tz = TimeZone.getTimeZone("GMT-3:00");
	TimeZone.setDefault(tz);
	System.out.println("Brasil: "+DateFormat.getDateTimeInstance().format(new Date()));

	TimeZone tz2 = TimeZone.getTimeZone("GMT-:+9:00");
	TimeZone.setDefault(tz2);
	System.out.println("Jap�o: "+DateFormat.getDateTimeInstance().format(new Date()));




	
	
	
	
	}




}
