

public class Calculator {
	
	private int num1; //these values will work as independent.

	//generated getters and setters.
	public int getNum1() {
		return num1;
	}

	private int num2;
	
	public void executeFirst() {
		System.out.println("I will execute before object Calculator initialization");
	}
	
	public void executeBeforeDestroy() {
		System.out.println("I will execute before object Calculator destruction");
	}
	
	public Calculator() {
		System.out.println("Calculator Default constructor Calculator invoked");
		// TODO Auto-generated constructor stub
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
	
	
	public Calculator(int num1, int num2) {
		System.out.println("Calculator Parameterized constructor Calculator invoked");
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
