package activityDone;
import java.io.*;

public class Main {
	
	
	public static void main(String[] args) {
		
		
		UsingThread usingThread = new UsingThread(secondsToMiliseconds(20));
		
		UsingThread usingThread2 = new UsingThread(secondsToMiliseconds(15));
		UsingThread usingThread3= new UsingThread(secondsToMiliseconds(10));
		UsingThread usingThread4 = new UsingThread(secondsToMiliseconds(5));
		UsingThread usingThread5 = new UsingThread(secondsToMiliseconds(1));
		

		
		
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
    
	public static int secondsToMiliseconds(int seconds) {
		int miliseconds=1000;
		miliseconds*=seconds;
		return miliseconds;
		
	}
	
	
	public static long differenceTime(long initial_time,long final_time) {
		
		long time_difference=final_time-initial_time;
		return time_difference;
	}
}


class UsingThread extends Thread{
	int timeSleep;
	
	//Constructor
	public UsingThread(int timeSleep){
		//This pause is needed
		Main.showElapsedTime(getName()+" is created");
		
		this.timeSleep=timeSleep;		
	}
	
	@Override
	public void run() {
		
		try {
			//sleep(10000/2);
			sleep(this.timeSleep);
			
			Main.showElapsedTime(getName()+" finishes");
		}catch(Exception e) {
			e.getMessage();
		}
		

	}
}
