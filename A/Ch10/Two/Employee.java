//class Employee
public abstract class Employee implements Payable{
	
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	
	//constructor
	public Employee(String firstName, String lastName, String socialSecurityNumber){
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	//get first name
	public String getFirstName(){return firstName;}
	
	//get last name
	public String getLastName(){return lastName;}
	
	//get social security number
	public String getSocialSecurityNumber(){return socialSecurityNumber;}
	
	//String representation of Employee object
	@Override
	public String toString(){
		return String.format("%s %s%nsocial security number: %s", getFirstName(), getLastName(), getSocialSecurityNumber());
	}
	
	//abstract method earnings
	public abstract double earnings();//no impementation
	
	//interface method get payment amount can be used by all the hierarchy of this class
	@Override
	public double getPaymentAmount(){return earnings();}
}