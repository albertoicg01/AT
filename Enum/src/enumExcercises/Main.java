package enumExcercises;
public class Main {
	public enum Day {
		SUNDAY("Domingo",1), 
		MONDAY("Lunes",2), 
		TUESDAY("Martes",3), 
		WEDNESDAY("Miercoles",4), 
		THURSDAY("Jueves",5), 
		FRIDAY("Viernes",6), 
		SATURDAY("Sabado",7);
		
		private String spanish;
		private int weekDay;
		
		private Day(String nombre, int dia)
		{
			spanish = nombre;
			weekDay = dia;
		}
		
		private String getSpanish() {
			return spanish;
		}
		
		private int getWeekDay() {
			return weekDay;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(Day.FRIDAY);
		
		Day day;
		day = Day.SUNDAY;
		
		switch (day) {
		case SUNDAY:
			System.out.println("Primer dia de la semana es " + day.SUNDAY.getSpanish() + " es el dia " + day.SUNDAY.getWeekDay() + " de la semana");
			break;
		case SATURDAY:
			System.out.println("Ultimo dia de la semana");
			break;
		default:
			System.out.println("Media semana");
			break;
		}
		
		System.out.println("\n");
		Day arr[] = Day.values();
		
		for (Day diaDay:arr)
		{
			//System.out.println(diaDay);
			if (diaDay.compareTo(Day.FRIDAY) == 0)
			{
				System.out.println("Index.- " + diaDay.ordinal());
				System.out.println(".." + diaDay.compareTo(Day.FRIDAY));
			}
		}
		
	}
	
}
