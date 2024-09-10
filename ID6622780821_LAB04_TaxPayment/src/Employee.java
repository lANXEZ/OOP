public abstract class Employee {
	String name;
	String position;

	Employee(String name, String position) {
		this.name = name;
		this.position = position;
	}

	abstract double calculateMonthlyIncome();

	abstract void printWorkPlace();

	void printInfo() {
		System.out.printf("%s is a %s",name,position);
		System.out.println();
	}

	double calculateTaxRate(double salary_year) {
		double taxRate;
		if (salary_year <= 200000) {
			taxRate = 0.0;
		}
		else if (salary_year <= 400000) {
			taxRate = 0.05;
		}
		else if (salary_year <= 600000) {
			taxRate = 0.1;
		}
		else if (salary_year <= 800000) {
			taxRate = 0.15;
		}
		else {
			taxRate = 0.2;
		}
		return taxRate;
	}
}
