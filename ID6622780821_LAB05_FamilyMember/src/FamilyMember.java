public class FamilyMember {
	public static String familyName = "Hilton";
	public String firstName;
	public static double commonFund = 100000.00;
	public double privateFund;
	
	FamilyMember(String firstName, double privateFund){
		this.firstName = firstName;
		this.privateFund = privateFund;
	}
	void printPrivateFund() {
		System.out.println(firstName+ " "+ familyName + " has $" + privateFund);
	}
	void contributeToComonFund(double amount) {
		privateFund -= amount;
		commonFund += amount;
		
	}
	static void payFromCommonFund(double amount) {
		commonFund -= amount;
	}
	static void printFamilyFund() {
		System.out.println("The "+familyName+" family has $"+commonFund);
	}
}
