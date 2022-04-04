package activityDone;

public class Main {
	public static void main(String[] args) {
		UsingThread usingThread = new UsingThread();
		UsingThread usingThread2 = new UsingThread();
		UsingThread usingThread3= new UsingThread();
		UsingThread usingThread4 = new UsingThread();
		UsingThread usingThread5 = new UsingThread();
		
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
	@Override
	public void run() {
		System.out.println(getName());
	}
}
