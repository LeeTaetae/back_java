package acess;

public class Netflex {
	String name;
	String zanre;
	
	public Netflex() {;}

	public Netflex(String name, String zanre) {
		super();
		this.name = name;
		this.zanre = zanre;
	}
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getZanre() {
		return zanre;
	}

	public void setZanre(String zanre) {
		this.zanre = zanre;
	}

	public void getFunction() {
		System.out.println("어떤 기능이 있을까요?");
	}
}
