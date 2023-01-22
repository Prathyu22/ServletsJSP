

public class Calculator {
	public Calculator() {
		super();
		// TODO Auto-generated constructor stub
	}

	private int num1; //these values will work as independent.

	//generated getters and setters.
	public int getNum1() {
		return num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}
	private int num2;
	
	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int addition(int a, int b) {
		return a+b;
	}
	
	public int addition() {
		return this.num1 + this.num2;
	}
	
	public int subtraction() {
		return this.num1 - this.num2;
	}
	
	public int multiplication() {
		return this.num1 * this.num2;
	}
	
	public int division() {
		return this.num1 / this.num2;
	}
	
	public int modulo() {
		return this.num1 % this.num2;
	}
}
