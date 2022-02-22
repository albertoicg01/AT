package circleArea;
import java.util.Scanner;
/*
 * @Author: Alberto Cruz
 * @Description: Primer programa. En una sola clase se debe de añadir los métodos de suma, resta multiplicación y división
 * 				 Los datos de entrada pueden ser harcodeados o hacerlos por entrada estándar
 * 				 Los números que se reciban deben de ser Integers		
 *
 * */
public class Main {
	
	public static void main(String[] args) {
		System.err.println("Programa 1");
		//Para leer valores por teclado
		Scanner scanner=new Scanner(System.in);
		
	
		//Recibimos valores
		System.out.println("Escriba el número 1: \n");
		Integer number1=scanner.nextInt();
		
		System.out.println("Escriba el número 2: \n");
		Integer number2=scanner.nextInt();
		
		System.out.println("########RESULTADOS#########");
		//Realiza operaciones y muestra resultados
		
		
		suma(number1,number2);
		rest(number1,number2);
		multi(number1,number2);
		div(number1,number2);

		
		
		
		
	}
	
		
	//Methods
	public static void suma(int a, int b){
		System.out.println("\n#####SUMA##### ");
		System.out.println(a+"+"+b+"="+(a+b));
		
	}
	public static void rest(int a, int b){
		System.out.println("\n#####RESTA##### ");
		System.out.println(a+"-"+b+"="+(a-b));
		
	}
	public static void multi(int a, int b){
		System.out.println("\n#####MULT##### ");
		System.out.println(a+"*"+b+"="+(a*b));
		
	}
	public static void div(int a, int b){
		System.out.println("\n#####DIV##### ");
		System.out.println(a+"/"+b+"="+(a/b));
		
	}
	
	
	
	
	
}
