//driver class of this hierarchy
public class PayableInterfaceTest{
	
	public static void main(String[] args){
		
		//array of type Payable and size 4
		Payable[] payableObjects = new Payable[]{
			new Invoice("01234", "seat", 2, 375.00),
			new Invoice("56789", "tire", 4, 79.95),
			new SalariedEmployee("John", "Smith", "111-11-1111", 800.00),
			new SalariedEmployee("Lisa", "Barnes", "888-88-8888", 1200.00)
		};
		
		//process each element in the array
		for(Payable currentPayable : payableObjects){
			System.out.printf("%n%s %npayment due: $%,.2f%n", currentPayable, currentPayable.getPaymentAmount());
		}
		System.out.println();
		//indentify the name of the objects in the array
		for(int x = 0; x < payableObjects.length; x++){
			System.out.printf("Payable %d is a %s%n", x, payableObjects[x].getClass().getName());
		}		
	}
}