package toStringTest;

public class Sprots {
	private String type;
	private int total;
	
	public Sprots() {;}

	public Sprots(String type, int total) {
		super();
		this.type = type;
		this.total = total;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	

	@Override
	public String toString() {
		return "Sprots [type=" + type + ", total=" + total + "]";
	}
	
	public static void main(String[] args) {
		Sprots sp = new Sprots();
		sp.setType("야구");
		sp.setTotal(9);
		System.out.println(sp);
	}
}
