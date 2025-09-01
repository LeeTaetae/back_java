package lambdaTest;

public class CalcResult{
	int sub;
	int minus;
	double divide;
	int multi;
	
	public CalcResult() {;}

	public CalcResult(int sub, int minus, double divide, int multi) {
		super();
		this.sub = sub;
		this.minus = minus;
		this.divide = divide;
		this.multi = multi;
	}

	public int getSub() {
		return sub;
	}

	public void setSub(int sub) {
		this.sub = sub;
	}

	public int getMinus() {
		return minus;
	}

	public void setMinus(int minus) {
		this.minus = minus;
	}

	public double getDivide() {
		return divide;
	}

	public void setDivide(double divide) {
		this.divide = divide;
	}

	public int getMulti() {
		return multi;
	}

	public void setMulti(int multi) {
		this.multi = multi;
	}
	
	
	
}
