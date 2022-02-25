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
		scanner.close();
		
		
		//Instanciamos objeto de clase Circle
		
		Circle operacion= new Circle(11);
		
		System.out.println("########Operaciones b�sicas#########");
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
