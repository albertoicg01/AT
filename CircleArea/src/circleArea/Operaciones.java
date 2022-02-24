package circleArea;

public class Operaciones {
	
//	private char name='C';
	private float radio;
			
	//----------------Constructor----------------
	//Sin agregar valor
	public Operaciones() {
		this.radio=1;
		getArea(this.radio);
		/*
		System.out.println("\n------------------------------------------------");
		System.out.println("Área de círculo="+(Math.PI)*(this.radio*this.radio));
		System.out.println("\n------------------------------------------------");
		*/

	}
	
	//Agregando valor
	public Operaciones(float r) {
		this.radio=r;
		getArea(this.radio);
		/*
		System.out.println("\n------------------------------------------------");
		System.out.println("Área de círculo="+(Math.PI)*(this.radio*this.radio));
		System.out.println("\n------------------------------------------------");
		 */
	}
	
	//----------------Methods----------------
	public static void suma(Integer a, Integer b){
		System.out.println("\n#####SUMA##### ");
		System.out.println(a+"+"+b+"="+(a+b));
		
	}
	public static void rest(Integer a, Integer b){
		System.out.println("\n#####RESTA##### ");
		System.out.println(a+"-"+b+"="+(a-b));
		
	}
	public static void multi(Integer a, Integer b){
		System.out.println("\n#####MULT##### ");
		System.out.println(a+"*"+b+"="+(a*b));
		System.out.println();
		
	}
	public static void div(Integer a, Integer b){
		System.out.println("\n#####DIV##### ");
		System.out.println(a+"/"+b+"="+(a/b));
		
	}
	
	public static void getArea(float r) {
		System.out.println("\n------------------------------------------------");
		System.out.println(Math.PI*(r*r));
		System.out.println("\n------------------------------------------------");
		
	}
	
		
	

	
}
