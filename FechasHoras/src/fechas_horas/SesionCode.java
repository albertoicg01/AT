package fechas_horas;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class SesionCode {
	public static void sesionCode() {
		System.out.println("Codigo de sesion- Flujos de control -Bucles Ciclos- Loops");
		System.out.println("While");
		System.out.println("Do while");
		System.out.println("For");
		
		
		//For
		System.out.println();
		System.out.println("==================");
		for (int i = 0; i < 50; i++) {
			System.out.println("For loop, it "+i);
		}
		
		//For
		System.out.println();
		System.out.println("==================");
		for (int i = 0; i < 50; i++) {
			System.out.println("For loop, it "+i);
			if (i==26) {
				break;
			}
			
			//Permiten modificar el flujo de nuestro código como lo vayamos necesitando
			//break;
			//continue;
		} // For
		
		
		//While
		System.out.println("*******************");
		int j=0;
		while (j<50){
			System.out.println("While loop, j:"+ j);
			//Hay que aumentar de forma manual el contador para que se dentenga
			j++;
			
			if (j==26) {
				break;
				
			}
		}//While
		
		
		//do while - Hace lo mismo que el while pero se ejecutará primero
		//Revisa si hay un código que queramos que siempre se ejecute
		
		System.out.println("...........................");
		int whileCounter=1;
		do {
			System.out.println("While loop, whileCounter: "+whileCounter);	
			whileCounter++;
		} while (whileCounter<=50);
		
		
		System.out.println("----------------------");
		System.out.println("Ejemplo con librería de calendario");
		Calendar cal =Calendar.getInstance();
		cal.setTimeInMillis(System.currentTimeMillis());
		int dia = cal.get(Calendar.DAY_OF_WEEK);
		
		for(int k=1; k<=7;k++) {
			if (dia==k) {
				System.out.println("Hoy es es el dia "+k+" de la semana");
				continue;
			}
			System.out.println("Dia "+k);
		}
		System.out.println("Seguimos");
	}
	
	public static void sesionCode2() {
		System.out.println("Sesión con Mario, complemento de fechas");
		
		//Obtener fecha de hoy
		
		//Librería de las más antiguas que se tienen
		//En algún momento se dejaran de utilizar
		// Es muy comun que al dar mantenimiento a un programa
		//se utilice
		System.out.println();
		Date fecAct= new Date();
		System.out.println(fecAct);
		
		//Formato de fecha, en el constructor se define qué formato se va a utilizar
		System.out.println();
		System.out.println("Dando formatos");
		SimpleDateFormat sdtf = new SimpleDateFormat("YYYY-MM-dd");
		SimpleDateFormat sdtf2 = new SimpleDateFormat("dd/MM/YYYY");
		SimpleDateFormat sdtf3 = new SimpleDateFormat("HH:mm:s.S");
		SimpleDateFormat sdtf4 = new SimpleDateFormat("YYYY-MM-dd KK:mm:s.S a");
		
		System.out.println(sdtf.format(fecAct));
		System.out.println(sdtf2.format(fecAct));
		System.out.println(sdtf3.format(fecAct));
		System.out.println(sdtf4.format(fecAct));
		
		//Parseo - Tomar una cadena, analizarla y convertirla
		String fechaDumm="17:32:0.812";
		System.out.println();
		System.out.println("Parseo");
		try {
			Date dFechaDumm=sdtf3.parse(fechaDumm);
			System.out.println(dFechaDumm);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		//Pendiente OJO!!!! Revisarlo
		
		//Fechas con formato long
		System.out.println();
		System.out.println("Transformacion de fecha actual a date");
		System.out.println(System.currentTimeMillis());
		
		//Transformacion a date
		
		long miliDate=System.currentTimeMillis();
		Date lFecha = new Date();
		
		lFecha.setTime(miliDate);
		System.out.println(lFecha);
		System.out.println(sdtf4.format(lFecha));
		
		//Calendar
		System.out.println();
		System.out.println("Calendar");
		System.out.println("\n *****");
		Calendar calendar =new GregorianCalendar();
		calendar.set(2022,03,03);
		System.out.println(calendar.getTime());
		System.out.println(sdtf4.format(calendar.getTime()));
		
		//Modificacion de fechas
		System.out.println();
		System.out.println("Modificacion de fechas (a calendar), se añade un dia");
		System.out.println("\n *****");
		calendar.add(Calendar.DAY_OF_WEEK,1);
		System.out.println(sdtf.format(calendar.getTime()));
		
		//Local date
		System.out.println();
		System.out.println("LocalDate");
		LocalDate localDate=LocalDate.now();
		System.out.println(localDate);
		
		System.out.println();
		System.out.println("Más recomendado por Spring freamework");
		LocalDate localDate2=LocalDate.of(2020, 02, 02);
		LocalDate localDate3=LocalDate.parse("2020-03-03");
		
		
		System.out.println(localDate2);
		System.out.println(localDate3);
		
		
		System.out.println("Modificar tiempo a localDate");
		System.out.println("\n ****");
		System.out.println(localDate3);
		localDate3=localDate3.minus(1, ChronoUnit.DAYS);
		System.out.println(localDate3);
		
		
		

		
		
	}
}

