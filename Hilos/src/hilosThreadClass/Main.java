package hilosThreadClass;

public class Main {
	
	 public static void main(String[] args) {
			
		 //Examples. We're using Threads class
		 HiloClass hiloClass=new HiloClass();
		 hiloClass.setName("Awelita Soy tu nieto 1");
		 
		 HiloClass hiloClass2=new HiloClass();
		 hiloClass2.setName("Awelita Soy tu nieto 2");
		 
		 hiloClass.start();
		 hiloClass2.start();
		 
	//		 //Simple thread
	//		for (int i = 0; i < 10; i++) {
	//			 System.out.println("Proceso 1");
	//			
	//		}
	//		 for (int i = 0; i < 10; i++) {
	//			 System.out.println("Proceso 2");
	//			 
	//		 }
	 
	}

}
