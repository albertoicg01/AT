package arrays;
import java.util.Scanner;

//import java.util.Scanner;

public class Arreglo {
	private static Scanner scanner;
	
	public static void main(String[] args) {
		scanner=new Scanner(System.in);
		
		arrays();
		matrixs();
		
//		Scanner scanner=new Scanner(System.in);
//		int sizeOfArray=scanner.nextInt();
//		scanner.close();
	}
	
	public static void arrays() {
		//We ask user how many elements the array will have
		System.out.println("============================================");
		System.out.println("Ejercicios y pruebas con arrays en java");
		System.out.println("============================================");
		
		//We define the array's length 
		//1 dimension array
		//========================================================================
		System.out.println("Ingrese la dimensión del arreglo");
		
		int sizeOfArray=scanner.nextInt();
		//scanner.close(); 
		
		ArregloEntradaEstandar arr_2=new ArregloEntradaEstandar(sizeOfArray);
		
	}
	
	public static void matrixs() {
		//Matrixs
		//========================================================================
		System.out.println("============================================");
		System.out.println("Ejercicios y pruebas con matrices en java");
		System.out.println("============================================");
		
		
//		System.out.println("Ingresa cantidad de renglones: ");
//		int rows=scanner.nextInt();
//		System.out.println("Ingresa cantidad de columnas: ");
//		int col=scanner.nextInt();
		
		MatrizRandom matrix=new MatrizRandom();


		
		
		
		
	}
}
