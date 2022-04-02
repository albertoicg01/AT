package hilosInterface;

public class HiloInterface implements Runnable {
	
	protected String nombre;
	
	//We are going to use constructor method here
	public HiloInterface(String nombre) {
		super();
		this.nombre=nombre;
	}
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(nombre);
		}
	}
	
	
	/*
	 * Another simple and easy way but not asked (1)
	 * */
//	//This only can be changed in this class through its methods
//	String name;
//	
//	//This is due to syntax rules
//	//In run method, we have to code what our
//	//sub-process will perform
//	@Override
//	public void run() {
//		for (int i = 0; i < 1000000000; i++) {
//			 System.out.println(name);
//			 
//		 }
//	}
//	
////	This method helps us to set a name from outside
////	It is unnecessary because we're using getters and setters
////	defined by Thread class
//	public void setTrheadName(String name) {
//		this.name=name;
//	}

}
