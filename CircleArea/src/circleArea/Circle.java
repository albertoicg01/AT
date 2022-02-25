package circleArea;

public class Circle {
	
//	private char name='C';
	private float radio;
			
	//----------------Constructor----------------
	//Sin agregar valor
	public Circle() {
		this.radio=1;
		getArea(this.radio);
		/*
		System.out.println("\n------------------------------------------------");
		System.out.println("Área de círculo="+(Math.PI)*(this.radio*this.radio));
		System.out.println("\n------------------------------------------------");
		*/

	}
	
	//Agregando valor
	public Circle(float r) {
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
	
	
	public static void complexArea(double radio, String isCircle) {
		
		String vKey=isCircle;
		boolean checker=vKey.equals("Es circulo");
		
		
		
		if(checker) {
			System.out.println("Sí es círculo: "+(Math.PI)*(radio*radio));
			
		}else {
				checker=vKey.equals("No es circulo");
				if(checker) {
					System.out.println("No es círculo, es cuadrado: "+(radio*radio));
				}else {
					System.out.println("No es círculo ni cuadrado");
				}
				
				
			}
	}
	
	//This method works with a Boolean comparison
	public static void complexArea(double radio, boolean isCircle) {
		if (isCircle) {
			System.out.println("Sí es círculo: "+(Math.PI)*(radio*radio));
		}else {
			if(isCircle == false) {
				System.out.println("No es círculo, es cuadrado: "+(radio*radio));
			}else {
				System.out.println("No es círculo ni cuadrado");
			}
		}
		
	}
	
	
}
