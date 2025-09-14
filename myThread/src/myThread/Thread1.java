package myThread;

public class Thread1 implements Runnable{
	String emoji;
	
	public Thread1() {;}

	public Thread1(String emoji) {
		super();
		this.emoji = emoji;
	}

	@Override
	synchronized public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(this.emoji);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("완료!");
	}
	
	
}
