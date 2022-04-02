package hilosThreadClass;

public class HiloClass extends Thread {
	
	//This only can be changed in this class through its methods
	String name;
	
	//This is due to syntax rules
	//In run method, we have to code what our
	//sub-process will perform
	@Override
	public void run() {
		for (int i = 0; i < 1000000000; i++) {
			 System.out.println(getName());
			 
		 }
	}
	
	//This method helps us to set a name from outside
	//It is unnecessary because we're using getters and setters
	//defined by Thread class
	//		public void setTrheadName(String name) {
	//			this.name=name;
	//		}
	
}
