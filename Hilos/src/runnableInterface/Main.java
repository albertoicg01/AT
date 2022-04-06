package runnableInterface;

public class Main {
	public static void main(String[] args) {
		Thread thread1 =new Thread(new RunnableThread("HiloRunnable_1"));
		
		thread1.start();
	
	}
	
	
	
	static long baseTime = System.currentTimeMillis();
	
	public static void showElapsedTime(String message) {
		long elapsedTime = System.currentTimeMillis() -baseTime;
		System.out.println(message + " at " + (elapsedTime/1000.0) + " seconds");
	}
	
}



class RunnableThread implements Runnable{
	
	protected String threadName;
	protected int seconds;
	
	
	
	public RunnableThread(String name) {
		this.threadName=name;
		Main.showElapsedTime(threadName+" is created");
	}
	
	public void run() {
		Main.showElapsedTime("RunnablePseudoIO starts");
		try {
			Thread.sleep(10000);  // 10 seconds
		    
		    Main.showElapsedTime("RunnablePseudoIO finishes");
		}catch(Exception e) {
			e.getMessage();
		}
	
		
	}
}
