package primitivos;

public class RangoPrimitivos {
	
	public static void convierteAscii() {
		
		String cadena1= "intern32 @ agilethought.com";
		
		
		for(int x=0;x<cadena1.length();x++) {
			System.out.println("El caracter: '"+cadena1.charAt(x)+"' vale en ASCII: "+(int)cadena1.charAt(x) );
		}
	}
	
	
	
	public static void rango() {
		System.out.println("\n****Los valores de datos primitivos y su rango****\n");
		
		System.out.println("El byte puede almacenar de: "+Byte.MIN_VALUE+" a "+Byte.MAX_VALUE);
		System.out.println("\nEl short puede almacenar de: "+Short.MIN_VALUE+" a "+Short.MAX_VALUE);
		System.out.println("\nEl Integer puede almacenar de: "+Integer.MIN_VALUE+" a "+Integer.MAX_VALUE);
		System.out.println("\nEl long puede almacenar de: "+Long.MIN_VALUE+" a "+Long.MAX_VALUE);
		System.out.println("\nEl float puede almacenar de: "+Float.MIN_VALUE+" a "+Float.MAX_VALUE);
		System.out.println("\nEl double puede almacenar de: "+Double.MIN_VALUE+" a "+Double.MAX_VALUE);
	}
	
	/*
	for(int x=0;x<cadena1.length();x++) {
		System.out.println(cadena1.charAt(x)+"---"+Character.getNumericValue(cadena1.charAt(x)));
	}
 */		


/*//Cadenas


//Chars !!!!!!
char letra1='t';
char letra2=125;
System.out.println(Character.getNumericValue(letra1));
System.out.println(Character.getNumericValue(letra2));



//Booleanos!!!!!
System.out.println("Booleanos!!!!");
boolean vBoolean = false;
System.out.println(vBoolean);
*/

/*
//!!!!Doubles
double a =100.0;
System.out.println(a);
*/
/*
//Float
float aa= 100f;
float ab=100;
float ac= (float) 100.0;
//A todos los flotantes se les debe agragar una f al final, por buena práctica
System.out.println(aa);
System.out.println(ab);
System.out.println(ac);
*/


/*System.out.println("Hola mundo!!\n");
try {
	while (vByte2<=vByte1)
	{
		
		vByte2=vByte1;
		vByte1++;
		
		System.out.println(vByte2);
		
		}
	}
catch (Exception e) {
	System.err.println(e.getMessage());
}finally {
	System.out.println("\nValores de mis variables");
	System.out.println(vByte2);
	System.out.println(vByte1);
}
*/

}
