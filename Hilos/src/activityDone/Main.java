package activityDone;

public class Main {
	public static void main(String[] args) {
		UsingThread usingThread = new UsingThread(10000);
		UsingThread usingThread2 = new UsingThread(10000/2);
		UsingThread usingThread3= new UsingThread(10000/3);
		UsingThread usingThread4 = new UsingThread(10000*2);
		UsingThread usingThread5 = new UsingThread(10000/5);
		
		usingThread.setName("Hilo1");
		usingThread2.setName("Hilo2");
		usingThread3.setName("Hilo3");
		usingThread4.setName("Hilo4");
		usingThread5.setName("Hilo5");
		
		
		usingThread.start();
		usingThread2.start();
		usingThread3.start();
		usingThread4.start();
		usingThread5.start();
		
		
		
	}
}


class UsingThread extends Thread{
	int timeSleep;
	
	//Constructor Method
	public UsingThread(){
			
	}
	
	public UsingThread(int timeSleep){
		this.timeSleep=timeSleep;		
	}
	
	@Override
	public void run() {
		try {
			//sleep(10000/2);
			sleep(this.timeSleep);
		}catch(Exception e) {
			e.getMessage();
		}
		
		System.out.println(getName());
	}
}
