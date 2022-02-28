package arrays;
import java.util.Scanner;
public class ArregloEntradaEstandar{
	
	private int sizeOfArray;
	
	
	//-----------------------------------We have two Constructor Methods
	//The default length of the array is 5
	public ArregloEntradaEstandar() {
		this.sizeOfArray=5;
		getArrayInfo(this.sizeOfArray);
	}
	
	//A custom length value given by an user
	 public ArregloEntradaEstandar(int sizeOfArray) {
		this.sizeOfArray=sizeOfArray;
		getArrayInfo(this.sizeOfArray);
		
	}
	
	//-----------------------------------Two Public Methods
	public static void getArrayInfo(int sizeOfArray) {
		//We declare the array
		int arr[]=new int[sizeOfArray];
		int i=0; 
		Scanner scanner=new Scanner(System.in);
		System.out.println("Ingresa un valor");
		int v = scanner.nextInt();

		
		do {
			System.out.println("Ingrese el valor del arr["+i+"]");
			v=scanner.nextInt();
			i++;
			
			System.err.println("=====================================");
			System.err.println("El valor leído es: "+v);
			System.err.println("El índice vale: "+i);
			System.err.println("Queremos llegar a: "+sizeOfArray);
			System.err.println("=====================================");
		}while(i<sizeOfArray);
		scanner.close();

			
		
		/*for(int j=0; j<i;j++) {
			System.out.println("El arr quedó como: ");
			System.out.println(arr[j]);
		}*/
		
		
		
	}
	
	

}
