
public class FullTime extends Employee implements TaxPayer {
	String workplace;
	double salary;

	FullTime(String name, String position, String workplace, double salary){
		super(name,position);
		this.workplace = workplace;
		this.salary = salary;
	}

	@Override
	public double calculateYearlyIncome() {
		// TODO Auto-generated method stub
		return 12*salary;
	}

	@Override
	public double calculateTax() {
		// TODO Auto-generated method stub
		return super.calculateTaxRate(calculateYearlyIncome())*calculateYearlyIncome();
	}

	@Override
	public void payTax() {
		// TODO Auto-generated method stub
		System.out.println("Pay tax $"+calculateTax());
	}

	@Override
	double calculateMonthlyIncome() {
		// TODO Auto-generated method stub
		return salary;
	}

	@Override
	void printWorkPlace() {
		System.out.println("Work at "+workplace);

	}
	void printInfo() {
		super.printInfo();
		System.out.println("Yearly income is "+ calculateYearlyIncome());
		payTax();
	}

}
