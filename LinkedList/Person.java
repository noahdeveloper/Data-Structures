package LInkedListGitHub;

//User defined type used for node element in generic liked list

public class Person {
	private String name;
	private int age;
	private double yearlyIncome;
	
	public Person(String name, int age, double yearlyIncome) {
		this.name = name;
		this.age = age;
		this.yearlyIncome = yearlyIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getYearlyIncome() {
		return yearlyIncome;
	}

	public void setYearlyIncome(double yearlyIncome) {
		this.yearlyIncome = yearlyIncome;
	}
	
	
	
}
