import java.util.Objects;

public class Person {
	private Long pid;
	private String pName;
	private Boolean paid;
	private Double salary;
	private Float age;
	private Calculator calculator;
	
	public void executeFirst() {
		System.out.println("I will execute before object Person initialization");
	}
	
	public void executeBeforeDestroy() {
		System.out.println("I will execute before object Person destruction");
	}
	
	public Long getPid() {
		return pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public Boolean getPaid() {
		return paid;
	}
	public void setPaid(Boolean paid) {
		this.paid = paid;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Float getAge() {
		return age;
	}
	public void setAge(Float age) {
		this.age = age;
	}
	public Calculator getCalculator() {
		return calculator;
	}
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, calculator, paid, pid, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(age, other.age) && Objects.equals(calculator, other.calculator)
				&& Objects.equals(paid, other.paid) && Objects.equals(pid, other.pid)
				&& Objects.equals(salary, other.salary);
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", paid=" + paid + ", salary=" + salary + ", age=" + age + ", calculator="
				+ calculator + "]";
	}
	public Person(Long pid, String pName, Boolean paid, Double salary, Float age, Calculator calculator) {
		System.out.println("Person parameterized constructor invoked");
		this.pid = pid;
		this.pName = pName;
		this.paid = paid;
		this.salary = salary;
		this.age = age;
		this.calculator = calculator;
	}
	//Default Constructor.
	public Person() {
		System.out.println("Person Default constructor invoked");
		// TODO Auto-generated constructor stub
	}
	
}
