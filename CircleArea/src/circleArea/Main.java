package circleArea;
import java.util.Scanner;
/*
 * @Author: Alberto Cruz
 * @Description: Primer programa. En una sola clase se debe de a�adir los m�todos de suma, resta multiplicaci�n y divisi�n
 * 				 Los datos de entrada pueden ser harcodeados o hacerlos por entrada est�ndar
 * 				 Los n�meros que se reciban deben de ser Integers		
 *
 * */
public class Main {
	
	public static void main(String[] args) {
		System.err.println("Programa 1");
		//Para leer valores por teclado
		Scanner scanner=new Scanner(System.in);
		
	
		//Recibimos valores
		System.out.println("Escriba el n�mero 1: \n");
		Integer number1=scanner.nextInt();
		
		System.out.println("Escriba el n�mero 2: \n");
		Integer number2=scanner.nextInt();
		
		//Instanciamos objeto de clase Operaciones
		
		Operaciones operacion= new Operaciones();
		
		System.out.println("########RESULTADOS#########");
		//Realiza operaciones y muestra resultados
		
		
		
		
		
		Operaciones.suma(number1,number2);
		Operaciones.rest(number1,number2);
		Operaciones.multi(number1,number2);
		Operaciones.div(number1,number2);
		

				
	}
	
	
	
}
