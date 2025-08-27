package anonymousTask;

public class CalcResult {
	private int num1;
	private int num2;
	private int add;
	private int minus;
	private int multi;
	private int divide;
	
	public CalcResult() {;}

	public CalcResult(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.add = num1 + num2;
		this.minus =(num1 > num2) ? (num1 - num2) : (num2 - num1);
		this.multi = num1 * num2;
		this.divide = (num1 > num2) ? (num1 / num2) : (num2 / num1);
		
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getAdd() {
		return add;
		
	}

	public void setAdd(int add) {
		this.add = add;
	}

	public int getMinus() {
		return minus;
	}

	public void setMinus(int minus) {
		this.minus = minus;
	}

	public int getMulti() {
		return multi;
	}

	public void setMulti(int multi) {
		this.multi = multi;
	}

	public int getDivide() {
		return divide;
	}

	public void setDivide(int divide) {
		this.divide = divide;
	}
	
	
}
