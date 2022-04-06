package activityDone;



public class RunnableThread implements Runnable{
	//Attributes
	//---------------------------------------------------
	protected String threadName;
	protected long sleepTime;
	
	
	//Constructor
	//---------------------------------------------------
	public RunnableThread(long sleepTime,String name) {
		this.threadName=name;
		Main.showElapsedTime(threadName+" is created-----------------1");
	}
	
	//Method(s)
	//---------------------------------------------------
	public void run() {
		Main.showElapsedTime(this.threadName+" starts-----------------2");
		try {
			Thread.sleep(this.sleepTime);  
		    
		    Main.showElapsedTime(this.threadName+" finishes-----------------3");
		}catch(Exception e) {
			e.getMessage();
		}
	
		
	}

}
