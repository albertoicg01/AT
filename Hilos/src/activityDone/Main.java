package activityDone;
import java.util.Random;

public class Main {
	
	
	public static void main(String[] args) {
		
		Random rand=new Random();
		
		UsingThread usingThread = new UsingThread(secondsToMiliseconds(rand.nextInt(11)),"Hilo1_ThreadClass");
		UsingThread usingThread2 = new UsingThread(secondsToMiliseconds(rand.nextInt(11)),"Hilo2_ThreadClass");
		UsingThread usingThread3= new UsingThread(secondsToMiliseconds(rand.nextInt(11)),"Hilo3_ThreadClass");
		UsingThread usingThread4 = new UsingThread(secondsToMiliseconds(rand.nextInt(11)),"Hilo4_ThreadClass");
		UsingThread usingThread5 = new UsingThread(secondsToMiliseconds(rand.nextInt(11)),"Hilo5_ThreadClass");
		
		
		Thread thread_interface_1 =new Thread(new RunnableThread(secondsToMiliseconds(rand.nextInt(11)),"thread_interface_1"));
		Thread thread_interface_2 =new Thread(new RunnableThread(secondsToMiliseconds(rand.nextInt(11)),"thread_interface_2"));
		Thread thread_interface_3 =new Thread(new RunnableThread(secondsToMiliseconds(rand.nextInt(11)),"thread_interface_3"));
		Thread thread_interface_4 =new Thread(new RunnableThread(secondsToMiliseconds(rand.nextInt(11)),"thread_interface_4"));
		Thread thread_interface_5 =new Thread(new RunnableThread(secondsToMiliseconds(rand.nextInt(11)),"thread_interface_5"));

		
		thread_interface_1.start();
		thread_interface_2.start();
		thread_interface_3.start();
		thread_interface_4.start();
		thread_interface_5.start();


		
		usingThread.start();
		usingThread2.start();
		usingThread3.start();
		usingThread4.start();
		usingThread5.start();
		
		
		
	}
	//-----------------------------------------------------------------------
	//Here we calculate time
	static long baseTime = System.currentTimeMillis();
    // show the time elapsed since the program started

    static void showElapsedTime(String message) {
	long elapsedTime = System.currentTimeMillis() -baseTime;
	System.out.println(message + " at " + (elapsedTime/1000.0) + " seconds");
    }
	//-----------------------------------------------------------------------
    
	public static long secondsToMiliseconds(int seconds) {
		long miliseconds=1000;
		miliseconds*=(long)seconds;
		return miliseconds;
		
	}
	
	
	public static long differenceTime(long initial_time,long final_time) {
		
		long time_difference=final_time-initial_time;
		return time_difference;
	}
}

