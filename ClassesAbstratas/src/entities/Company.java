package entities;

public class Company extends Tax {

	private int numberOfEmployees;

	public Company(String name, double income, int numberOfEmployees2) {
		super();
	}

	public Company(int numberOfEmployees) {
		super();
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		
		if (numberOfEmployees > 10) {
			return getAnualIncome() * 0.14;
		} else {
			return getAnualIncome() * 0.16;
		}
	}

}
