package hilosInterface;

public class Main {
	
	public static void main(String[] args) {
		
		Thread hiloInterface = new Thread(new HiloInterface("Tres"));
		
		hiloInterface.start();
		
		
//		Another simple and easy way but not asked (1)
//		HiloInterface hiloInterface = new HiloInterface();
//		hiloInterface.setTrheadName("Hilo 1 -- Interface");	
//		hiloInterface.run();
		

		
		
	}

}
