package arrays;
import java.util.Scanner;
public class ArregloEntradaEstandar{
	
	private int sizeOfArray;
	
	
	//-----------------------------------We have two Constructor Methods
	//The default length of the array is 5
	public ArregloEntradaEstandar() {
		this.sizeOfArray=5;
		createArray(this.sizeOfArray);
	}
	
	//A custom length value given by an user
	 public ArregloEntradaEstandar(int sizeOfArray) {
		this.sizeOfArray=sizeOfArray;
		createArray(this.sizeOfArray);
		
	}
	
	//-----------------------------------Two Public Methods
	public static void createArray(int sizeOfArray) {
		//We declare the array
		int arr[]=new int[sizeOfArray];
		int i=0; 
		
		Scanner scanner=new Scanner(System.in);
	

		while (i<sizeOfArray) {
			System.out.println("Ingresa elemento de array ["+i+"]: ");
			arr[i]=scanner.nextInt();;			
//			System.out.println("A["+i+"]="+arr[i]);
			i++;
			
		}

		//We show array in console
		getArrayInfo(arr);
		
	 }
	
	
	public static void getArrayInfo(int[] arr) {
		System.out.println("================================================");
		System.out.println("El array que ingresaste es: ");
		System.out.println("================================================");
		
		for(int j=0;j<arr.length;j++) {
			System.out.println("arr["+j+"]="+arr[j]);
		}
	}
	

	
		
	

}
