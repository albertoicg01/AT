package flujos;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class Main {
	public static void main(String[] args) {
		List<String> cursos = Arrays.asList("Java","PHP",".Net","Spring boot","Git","Linux");
		
		int maxLength = 0;
		
		System.out.println("\nLista de cursos");
		for (String curso:cursos) {
			System.out.println(curso);
			
			if (curso.toLowerCase().replace(" ", "").equals("springboot"))
				System.out.println("Found " + curso);
			
			if (curso.length() > maxLength )
				maxLength = curso.length();
		}
		System.out.println("\nLongitud maxima de cadena: " + maxLength);
		
		
		System.out.println("\nLista de cursos con stream");
		Stream<String> cursos2 = Stream.of("Java","PHP",".Net","Spring boot","Git","Linux");
		cursos2.forEach(System.out::println);

		
		System.out.println("\nBusquedas");
		Stream<String> cursos3 = Stream.of("Java","PHP",".Net","Spring boot","Git","Linux");
		cursos3.filter(curso -> curso.toLowerCase().replace(" ", "").contains("java")).forEach(System.out::println);
		
		System.out.println("\nMax length");
		Stream<String> cursos4 = Stream.of("Java","PHP",".Net","Spring boot","Git","Linux");
		Stream<Integer> cursos41 = cursos4.map(curso -> curso.length());
		//Optional<Integer> maxLength41 = cursos41.max((x, y) -> x-y);
		Optional<Integer> maxLength41 = cursos41.max((x, y) -> x.compareTo(y));
		System.out.println(maxLength41);
		
		
		System.out.println("\nStream listener");
		Stream<String> cursos5 = cursos.stream();
		cursos5.forEach(System.out::println);
		
		System.out.println("\nStream listener ordenado");
		Stream<String> cursos6 = cursos.stream();
		cursos6.forEachOrdered(System.out::println);
		
		System.out.println("\nTipos de streams");
		IntStream numeros = IntStream.iterate(0, x -> x + 1);
		numeros.limit(100)
		.filter(x ->  x%3 == 0).forEach(System.out::println);
		
		
	}

}


