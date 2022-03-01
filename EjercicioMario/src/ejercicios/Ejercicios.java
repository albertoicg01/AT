package ejercicios;

public class Ejercicios {
	public static void main(String[] args) {
		ejercicio1();
		ejercicio2();
		ejercicio3();
		
	}
	
	
	public static void ejercicio1() {
		int a=10, b=20, c=30;
		System.err.println("=============Operaciones verdadero o falso");
//		Si a = 10, b = 20, c = 30, entonces:
//			(a + b) > c
//			(a – b) < c
//			(a – b) = c
//			(a * b) != c
		
		System.err.println("1.1 (a + b) > c");
		System.err.println("1.2 (a – b) < c");
		System.err.println("1.3 (a – b) = c");
		System.err.println("1.4 (a * b) != c");
		
		int aux=0;
		aux=a+b;
		if(aux > c) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
//		=========================================================
		
		aux=0;
		aux=a-b;
		if(aux<c) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
//		=========================================================
		
		aux=0;
		aux=a-b;		
		if(aux==c) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
//		=========================================================
		
		aux=0;		
		aux=a*b;		
		if(aux!=c) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}

		
	}
	public static void ejercicio2() {
		System.err.println("=============Expresiones aritméticas");
		
		
		System.out.println(21%7);
		System.out.println(9/2 + 15 % 2);
		System.out.println((3+6)/2 + 1.5);
		System.out.println((10+38/(14-(10-12/(2*3)))));
		System.out.println((10+38/(14-(10-12/(2*3)))));
		
	}
	public static void ejercicio3() {
		System.err.println("=============Expresiones lógicas");
		
		
		System.out.println(!(5>6)&&7<=4);
		System.out.println(7>4 && 5<=5 || 4==5);
		System.out.println(! (7==7) && (7>=8 || 8==6));
		System.out.println((5+2)<=5 && 3*2==5 || 7<=2*2 || 2*2<=(2+2));
		System.out.println(((! (14/2>8) || 5>5) && (5<=27/3 || 5+3<=3/2)));
		System.out.println((3+5*2)==12/3 && ((5+3)==18/9 || 10/2<=9) || !(9>=2));
		



		
	}
	
	
	
}


