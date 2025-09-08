package threadTest;

public class ThreadTest {
	public static void main(String[] args) {
//		단일쓰레드
//		Thread1 thread1 = new Thread1("?");
//		Thread1 thread2 = new Thread1("!");
//		
//		thread1.start();
//		thread2.start();
		
		Thread2 target1 = new Thread2();
		Thread2 target2 = new Thread2();
		
		Thread thread1 = new Thread(target1 , "✨");
		Thread thread2 = new Thread(target1 , "❤️");
		
		thread1.start();
		thread2.start();
//		thread1.setPriority(0);
//		.setPriority() 
//		쓰레드의 우선순위를 바꿈
//		하지만 메인쓰레드보다 우선순위가 낮다.
//		강제로 "무조건" 단일로 처리하듯 할 수 있게 한다.
		
//		join() : 우선순위를 바꿔줌
		try {
			
//			만약 start()보다 먼저 join()을 하면 join()은 무시된다.
//			메인 쓰레드는 코드 한 줄 작성하는 순간 start() 발동
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {;}
		
		System.out.println("메인 쓰레드");
	}
}
