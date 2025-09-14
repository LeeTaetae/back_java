package myThread;

public class ThreadTest1 {
	public static void main(String[] args) {
		
		Thread1 th1 = new Thread1( "✨");
		
		Thread1 th2 = new Thread1("❤️");
		
		Thread th3 = new Thread(th1);
		Thread th4 = new Thread(th2);
		
		th3.start();
		th4.start();
		
		th3.setPriority(1);
		th4.setPriority(2);
		try {
			th3.join();
			th4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}