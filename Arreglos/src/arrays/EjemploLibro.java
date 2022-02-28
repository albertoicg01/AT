package arrays;
import java.util.Scanner;

public class EjemploLibro {
	
	
	public static void getBookExample() {
		//We define an array of 10 elements
		int arr[]=new int[10];
		int i =0;
		
		//Keyboard input
		Scanner scanner=new Scanner(System.in);
		
		//We read the 1st value
		System.out.println("Ingrese un valor (0=>fin): ");
		int v=scanner.nextInt();
		
		//We get into a bucle: As long as v<>0 AND i<10
		
		while(v!=0 && i<10) {
			//We set v in arr[i] and we add 1 unit to i index
			arr[i++]=v;
			
			//We read the next value
			System.out.println("Ingrese el siguiente valor (0=>fin): ");
			v= scanner.nextInt();
			System.err.println("============================");
			System.err.println("Prueba Escritorio: v="+v+"; i="+i+"; i++="+(i++));
			System.err.println("============================");
		}
		
		System.out.println("El arreglo ingresado es: ");
		for (int j = 0; j < i; j++) {
			System.err.println(arr[j]);
			
		}
		
	}	
	

}
