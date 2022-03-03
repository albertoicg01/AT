package arrays;
import java.util.Scanner;

//import java.util.Scanner;

public class Arreglo {
	public static void main(String[] args) {
		arrays();
//		Scanner scanner=new Scanner(System.in);
//		int sizeOfArray=scanner.nextInt();
//		scanner.close();
	}
	
	public static void arrays() {
		//We ask user how many elements the array will have
		System.out.println("Ejercicios y pruebas con arrays en java");
		
		//We define the array's length 
		//1 dimension array
		//========================================================================
		System.out.println("Ingrese la dimensión del arreglo");
		Scanner scanner=new Scanner(System.in);
		int sizeOfArray=scanner.nextInt();
		//scanner.close(); 
		
		ArregloEntradaEstandar arr_2=new ArregloEntradaEstandar(sizeOfArray);
		
	}
	
	public static void matrix2_2() {
		//Matrixs
		//========================================================================
		System.err.println("*");
		System.err.println("*");
		System.err.println("*");
		System.out.println("Matrices");
		
		
		System.out.println("Ingresa cantidad de renglones: ");
		System.out.println("Ingresa cantidad de columnas: ");
		
	}
}
