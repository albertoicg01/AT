package excepciones;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;//For reading files Exception
import java.io.InputStream; //For reading files 
import java.io.OutputStream; //For reading files
import java.util.Scanner; //Standard input

public class Main {
	public static void main(String args[]) {
//		ejemplo1();
		System.out.println("------------------------------");
		//Path1
		String sIn="C:\\Users\\Alberto_intern32\\eclipse-workspace\\AT\\pruebas\\Estados.txt";
		//Path2
		String sOut="C:\\Users\\Alberto_intern32\\eclipse-workspace\\AT\\pruebas\\EstadosMay.txt";
		callDoIO(sIn, sOut);
	}
	
	public static void excepcionesCadenas() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa tu nombre");
		String message=scanner.next();
		System.out.println("Hola"+" Alberto");
		
	}
	
	public static void ejemplo1() {
		int a=2,b=0;
		
		try {
			System.out.println("Ejemplo 1");
			System.out.println(a/b);
			
		}catch(Exception e) {
			
			System.err.println(e.getMessage());
			
		}
		
		try {
			System.out.println(div(a,b));
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
		
		
	}
	
	public static float div(float a, float b) {
		float result=0;
		result= a/b;
		return result;
	}
	
	public static void callDoIO(String sIn, String sOut) {
		InputStream in; 
		OutputStream out;
		
		try {
			in = new FileInputStream(sIn);
			out = new FileOutputStream(sOut);
			doio(in,out);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
			//			e.printStackTrace();
		}finally {
			System.out.println("Proceso terminado");
		}
		
	}
	
	public static void doio(InputStream in, OutputStream out) {
		int c;
		try {
			while((c=in.read())>=0) {
				c=Character.toLowerCase((char) c);
				out.write(c);
			}
		}catch( IOException e) {
			//For interrupt a program in a fast way
			System.err.println("doio: I/O Problem");
			System.exit(1);
		}finally {
			System.out.println("Copia terminada");
		}
	}

}//End main

