package abstractTest;

//interface = > 타입
public class Dog implements Pet, Animal{

	@Override
	public void sitDown() {
		// TODO Auto-generated method stub
		System.out.println("앉아!");
		
	}

	@Override
	public void waitNow() {
		// TODO Auto-generated method stub
		System.out.println("기다려!");
		
	}

	@Override
	public void poop() {
		// TODO Auto-generated method stub
		System.out.println("패드 위에!");
		
	}
	
}
