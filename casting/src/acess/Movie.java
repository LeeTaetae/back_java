package acess;

public class Movie extends Netflex{
	public Movie() {;}
	
	public Movie(String name, String zanre) {
		super(name, zanre);
	}
	
	@Override
	public void getFunction() {
		System.out.println("4D");
	}
}
