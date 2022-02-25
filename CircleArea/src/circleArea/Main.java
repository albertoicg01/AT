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
		scanner.close();
		
		
		//Instanciamos objeto de clase Circle
		
		Circle operacion= new Circle(11);
		
		System.out.println("########Operaciones básicas#########");
		//Realiza operaciones y muestra resultados
		
		Circle.suma(number1,number2);
		Circle.rest(number1,number2);
		Circle.multi(number1,number2);
		Circle.div(number1,number2);
		
		System.out.println("****************************************ComplexArea****************************************");
		
		Circle.complexArea(5, "No es circulo");
		Circle.complexArea(5, "Es circulo");
		Circle.complexArea(5, "Es otra cosa");

		Circle.complexArea(5,true);
		Circle.complexArea(5, false);
		Circle.complexArea(5, "Es otra cosa");
		
		System.out.println("****************************************Inheritance and OPP concepts****************************************");
		

		System.err.println("**********************************Circle object");
		Circle c1 = new Circle();
		c1.getDefaultMessage();
		c1.getParent();

		
		System.err.println("**********************************Cube object");
		Cube c2 = new Cube();
		c2.getDefaultMessage();
		c2.getParent();
		
		



				
	}
	
	
	
}
