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
		
		System.out.println("########RESULTADOS#########");
		//Realiza operaciones y muestra resultados
		Integer resultado=0;
		
		resultado=suma(number1,number2);
		System.out.println("Suma="+resultado);
		
		resultado=rest(number1,number2);
		System.out.println("Resta="+resultado);

		resultado=multi(number1,number2);
		System.out.println("Resta="+resultado);

		resultado=div(number1,number2);
		System.out.println("div="+resultado);
		
		
		
		
	}
	
		
	//Methods
	public static int suma(int a, int b){
		System.out.println("\n#####SUMA##### ");
		System.out.println(a+'+'+b);
		
		Integer resultado = (a+b);
		
		return (a+b);
	}
	public static int rest(int a, int b){
		System.out.println("\n#####RESTA##### ");
		System.out.println(a+'-'+b);
		return (a-b);
	}
	public static int multi(int a, int b){
		System.out.println("\n#####MULT##### ");
		System.out.println(a+'*'+b);
		return (a-b);
	}
	public static int div(int a, int b){
		System.out.println("\n#####DIV##### ");
		System.out.println(a+'/'+b);
		return (a/b);
	}
	
	
	
	
	
}
