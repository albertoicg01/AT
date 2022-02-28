package arrays;

import java.util.Scanner;

public class Arreglo {
	public static void main(String[] args) {
		//We ask user how many elements the array will have
		
		System.out.println("Ingrese la cantidad de elementos que tendrá el array");
		int sizeOfArray=5;
		
//		Scanner scanner=new Scanner(System.in);
//		int sizeOfArray=scanner.nextInt();
//		scanner.close();
		
		System.out.println("El arreglo tendrá la dimensión de "+sizeOfArray+" elementos.");
		ArregloEntradaEstandar arr1 =new ArregloEntradaEstandar(sizeOfArray);
//		ArregloEntradaEstandar arr1 =new ArregloEntradaEstandar(5);
		
		
		
		
		
	}
}
