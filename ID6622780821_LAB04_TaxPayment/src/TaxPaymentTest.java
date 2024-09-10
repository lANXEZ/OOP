
public class TaxPaymentTest {

	public static void main(String[] args) {
		FullTime employee01_FullTime = new FullTime("Erika Parker", "secretary", "InfoTech", 32500.00);
		PartTime employee02_PartTime = new PartTime("Brian Lee", "driver", "InfoTech", 15, 100);
		Employee employee03 = new FullTime("James Knein", "tecnitian", "InfoTech", 35500.00);
		Employee employee04 = new PartTime("Anne Lin", "accountant", "InfoTech", 30, 150);
		TaxPayer employee05_TaxPayer = new FullTime("Jamie Fox", "Manager", "InfoTech", 57300.00);
		
		employee01_FullTime.printInfo();
		employee02_PartTime.printInfo();
		employee03.printInfo();
		employee04.printInfo();
		((FullTime) employee05_TaxPayer).printInfo();
	}

}
