package acess;

public class Drama extends Netflex{
	public Drama() {;}
	
	public Drama(String name, String zanre) {
		super(name, zanre);
	}
	
	@Override
	public void getFunction() {
		System.out.println("굿즈");
	}
}
