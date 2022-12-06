public class BasePlusCommissionEmployeeTest {
	public static void main(String[] args) {
		// instantiate BasePlusCommissionEmployee object
		BasePlusCommissionEmployee employee =
		new BasePlusCommissionEmployee(
		"Bob", "Lewis", "333-33-3333", 5000, .04, 300);
	
		// get base-salaried commission employee data
		System.out.printf(
		"Employee information obtained by get methods:%n");
		System.out.printf("%s %s%n", "First name is",
		employee.getFirstName());
	
		System.out.printf("%s %s%n", "Last name is",
		employee.getLastName());
		System.out.printf("%s %s%n", "Social security number is",
		employee.getSocialSecurityNumber());
		System.out.printf("%s %.2f%n", "Gross sales is",
		employee.getGrossSales());
		System.out.printf("%s %.2f%n", "Commission rate is",
		employee.getCommissionRate());
		System.out.printf("%s %.2f%n", "Base salary is",
		employee.getBaseSalary());
		employee.getBaseSalary();
	
		try{
			employee.setBaseSalary(-1000);
		}
		catch(IllegalArgumentException e){
			System.out.printf("%n%s%n", e.getMessage());
		}
		
		try{
			employee.setCommissionRate(1.2);
		}
		catch(IllegalArgumentException e){
			System.out.printf("%n%s%n", e.getMessage());
			//System.out.printf("%n%s%n", f.getMessage());
		}

		System.out.printf("%n%s:%n%n%s%n",
		"Updated employee information obtained by toString",
		employee.toString());
		
		System.out.printf("%n%s", employee.getFname());
		System.out.print(employee.getLname());
		
		System.out.print(employee.getSocialSecurityNumber());
	}
} 