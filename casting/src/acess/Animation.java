package acess;

public class Animation extends Netflex {
	
	public Animation() {;}
	
	public Animation(String name, String zanre) {
		super(name, zanre);
	}
	
	@Override
	public void getFunction() {
		System.out.println("자막 지원");
	}
}
