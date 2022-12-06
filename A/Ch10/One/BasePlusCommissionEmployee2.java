// BasePlusCommissionEmployee class extends CommissionEmployee.
public class BasePlusCommissionEmployee2 extends CommissionEmployee{
	
	private double baseSalary; // base salary per week
	
	// constructor
	public BasePlusCommissionEmployee2(String firstName, String lastName,
	String socialSecurityNumber, double grossSales,
	double commissionRate, double baseSalary) {
	super(firstName, lastName, socialSecurityNumber,
	grossSales, commissionRate);
	
	if (baseSalary < 0.0) { // validate baseSalary
	throw new IllegalArgumentException("Base salary must be >= 0.0");
	}
	
	this.baseSalary = baseSalary;
	}
	
	// set base salary
	public void setBaseSalary(double baseSalary) {
	if (baseSalary < 0.0) { // validate baseSalary
	throw new IllegalArgumentException("Base salary must be >= 0.0");
	}
	
	this.baseSalary = baseSalary;
	}
	
	// return base salary
	public double getBaseSalary() {return baseSalary;}
	
	//new base salary with 10% increase
	public double getNewBaseSalary(){return 1.10 * getBaseSalary();}
	
	// calculate earnings; override method earnings in CommissionEmployee
	@Override
	public double earnings() {return getNewBaseSalary() + super.earnings();}
	
	// return String representation of BasePlusCommissionEmployee object
	@Override
	public String toString() {
	 return String.format("%s %s; %s: $%,.2f %nnew base salary with 10%% increase is: $%,.2f",
	 "base-salaried", super.toString(),
	 "base salary", getBaseSalary(), getNewBaseSalary());
	} 
}