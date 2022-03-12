package clase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class EjerciciosColecciones {
	public static void listaPaises() {
		System.out.println("Ejercicio de listas");
		System.out.println("");
		Scanner scanner =new Scanner(System.in);
		
		int selector=0;
		int reves=0;
		System.out.println("Ingresa la tecla que corresponde al pais");
		System.out.println("------------------------------------------");
		System.out.println("Mexico - 1");
		System.out.println("Estados Unidos - 2");
		System.out.println("Canada - 3");
		System.out.println("");
		selector=scanner.nextInt();
			
			
		
		if(selector==1) {
			System.out.println("Escogiste Mexico");	
			String example = new String();
			List<String> listSource= new ArrayList<>();
			
			listSource.add("Michoacan");//1
			listSource.add("Tamaulipas");//2
			listSource.add("Chiapas");//3
			listSource.add("Nuevo León");//4
			listSource.add("Campeche");//5
			listSource.add("Ciudad de México");//6
			listSource.add("Estado de México");//7 
			listSource.add("Puebla");//8
			listSource.add("Sonora");//9
			listSource.add("Veracruz");//10
			
			
			System.out.println(listSource);
			System.out.println("");
			System.out.println("Quieres imprimir al reves???");
			System.out.println("1 - Si");
			System.out.println("2 - No");
			reves=scanner.nextInt();
			
			if(reves==1) {
				Collections.reverse(listSource);
				System.out.println(listSource);
			}else {
				System.out.println("Fin del programa");
			}
			
		}
		
		if(selector==2) {
			System.out.println("Escogiste Estados Unidos");	
			String example = new String();
			List<String> listSource= new ArrayList<>();
			
			listSource.add("Alabama");//1
			listSource.add("Alaska");//2
			listSource.add("Arizona");//3
			listSource.add("Arkansas");//4
			listSource.add("California");//5
			listSource.add("Carolina del Norte");//6
			listSource.add("Carolina del Sur");//7 
			listSource.add("Delaware");//8
			listSource.add("Illinois");//9
			listSource.add("Kansas");//10
			System.out.println(listSource);
			
			
			System.out.println("");
			System.out.println("Quieres imprimir al reves???");
			System.out.println("1 - Si");
			System.out.println("2 - No");
			reves=scanner.nextInt();
			
			if(reves==1) {
				Collections.reverse(listSource);
				System.out.println(listSource);
			}else {
				System.out.println("Fin del programa");
			}
			
		}
		if(selector==3) {
			System.out.println("Escogiste Canada");	
			String example = new String();
			List<String> listSource= new ArrayList<>();
			
			listSource.add("Alberta");//1
			listSource.add("Columbia Británica");//2
			listSource.add("Isla del príncipe Eduardo");//3
			listSource.add("Nuevo Manitoba");//4
			listSource.add("Nueva Escocia");//5
			listSource.add("Nunavut");//6
			listSource.add("Ontario");//7 
			listSource.add("Quebec");//8
			listSource.add("Terranova y Labrador");//9
			listSource.add("Yukón");//10

			System.out.println(listSource);
			System.out.println("");
			System.out.println("Quieres imprimir al reves???");
			System.out.println("1 - Si");
			System.out.println("2 - No");
			reves=scanner.nextInt();
			
			if(reves==1) {
				Collections.reverse(listSource);
				System.out.println(listSource);
			}else {
				System.out.println("Fin del programa");
			}
			
			
			
		}
		
		
		
		
		


	}
	public static void claseMarioStream() {
		
		List<String> cursos =Arrays.asList("Java","PHP",".NET","Spring");
		System.out.println("\n Lista de cursos");
		
		for(String curso:cursos) {
			System.out.println(curso);
			
			
			if(curso.toLowerCase().replace(" ","").equals("springboot"));
		}
		
		
		System.out.println("\nLista de cursos con stream");
		Stream<String> cursos2 = Stream.of("Java","PHP",".NET");
		cursos2.forEach(System.out::println);
		
		System.out.println("\nBusquedas");
		Stream<String> cursos3=Stream.of("Java","PHP",".NET","SpringBoot");
		cursos3.filter(curso->curso.toLowerCase().replace(" ", "").contains("java").forEach(System.out::println));
		
	}
	
	
}
