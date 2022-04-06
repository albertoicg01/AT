package activityDone;

public class UsingThread extends Thread{
	//Attributes
	//---------------------------------------------------
	long timeSleep;
	
	//Constructor
	//---------------------------------------------------
	public UsingThread(long timeSleep, String threadName){
		//This pause is needed
		super(threadName);
		this.timeSleep=timeSleep;		
		
		Main.showElapsedTime(getName()+" is created-----------------1");
	}
	
	//Method(s)
	//---------------------------------------------------
	@Override
	public void run() {
		Main.showElapsedTime(getName()+" starts-----------------2");
		try {
			//sleep(10000/2);
			sleep(this.timeSleep);
			
			Main.showElapsedTime(getName()+" finishes-----------------3");
		}catch(Exception e) {
			e.getMessage();
		}
		

	}
}

