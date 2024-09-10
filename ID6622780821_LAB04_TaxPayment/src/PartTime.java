
public class PartTime extends Employee implements TaxPayer{
	String workplace;
	double numHrPerWeek;
	double hourlyRate;
	
	PartTime(String name, String position, String workplace, double numHrPerWeek, double hourlyRate){
		super(name,position);
		this.workplace = workplace;
		this.numHrPerWeek = numHrPerWeek;
		this.hourlyRate = hourlyRate;
	}

	@Override
	public double calculateYearlyIncome() {
		// TODO Auto-generated method stub
		return 12*calculateMonthlyIncome();
	}

	@Override
	public double calculateTax() {
		// TODO Auto-generated method stub
		return calculateTaxRate(calculateYearlyIncome())*calculateYearlyIncome();
	}

	@Override
	public void payTax() {
		// TODO Auto-generated method stub
		System.out.println("Pay tax $"+calculateTax());
		
	}

	@Override
	double calculateMonthlyIncome() {
		// TODO Auto-generated method stub
		return numHrPerWeek*hourlyRate*4;
	}

	@Override
	void printWorkPlace() {
		// TODO Auto-generated method stub
		System.out.println("Work at "+workplace);
		
	}
	void printInfo() {
		super.printInfo();
		System.out.println("Yearly income is "+calculateYearlyIncome());
		payTax();
	}

}
