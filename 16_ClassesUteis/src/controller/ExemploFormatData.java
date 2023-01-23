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

	      //Date tá riscado porque, provavelmente, não estará mais na biblioteca java futuramente.
	 //Esse parametro da biblioteca java.util já está em desuso atualmente.
	 //Para mostrar a data que você quer, você tem que calcular
	 
	 
	 //Date dataInserida = new Date(100,9,14); System.out.println("Data Inserida: "+dataInserida);//
//comentei para sair o warnning//
	
	 Calendar data2 = new GregorianCalendar();
	System.out.println("\nData: "+data2);

	//data2.set(2011,3,19);
	System.out.println("Data 2 inserida: "+data2);
	System.out.println("\nMês: "+data2.get(Calendar.MONTH));
	System.out.println("Dia da Semana: "+data2.get(Calendar.DAY_OF_WEEK));
	System.out.println("Dia do Mês: "+data2.get(Calendar.DAY_OF_MONTH));
	System.out.println("Dia do Ano: "+data2.get(Calendar.DAY_OF_YEAR));

	//Apesar de estarmos no mês de maio, na execução, aparecerá como mês 4.
	// o sistema conta Janeiro como mês 0


	//é possível definir a formatação de local nessa formatação de data
	//locale.setDefault(Locale.US);


	DateFormat dfFull = DateFormat.getDateInstance(DateFormat.FULL);
	System.out.println("\nData Full: "+dfFull.format(data2.getTime()));

	DateFormat dfLong = DateFormat.getDateInstance(DateFormat.LONG);
	System.out.println("Data LONG: "+dfLong.format(data2.getTime()));

	DateFormat dfMedium = DateFormat.getDateInstance(DateFormat.MEDIUM);
	System.out.println("Data MEDIUN: "+dfMedium.format(data2.getTime()));

	DateFormat dfShort = DateFormat.getDateInstance(DateFormat.SHORT);
	System.out.println("Data SHORT: "+dfShort.format(data2.getTime()));

	//usamos o timezone de java.util. Não foi o timezone sql
	TimeZone tz = TimeZone.getTimeZone("GMT-3:00");
	TimeZone.setDefault(tz);
	System.out.println("Brasil: "+DateFormat.getDateTimeInstance().format(new Date()));

	TimeZone tz2 = TimeZone.getTimeZone("GMT-:+9:00");
	TimeZone.setDefault(tz2);
	System.out.println("Japão: "+DateFormat.getDateTimeInstance().format(new Date()));




	
	
	
	
	}




}
