//class Invoice
public class Invoice implements Payable{
	
	private final String partNumber;
	private final String partDescription;
	private final int quantity;
	private final double pricePerItem;
	
	//constructor
	public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem){
		if(quantity < 0){
			throw new IllegalArgumentException("Quantity must be >= 0");
		}
		if(pricePerItem < 0){
			throw new IllegalArgumentException("Price per Item must be >= 0");
		}
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}
	
	//get part number
	public String getPartNumber(){return partNumber;}
	
	//get part description
	public String getPartDescription(){return partDescription;}
	
	//get part quantity
	public int getQuantity(){return quantity;}
	
	//get price per item
	public double getPricePerItem(){return pricePerItem;}
	
	//override interface method to complete the contract
	@Override
	public double getPaymentAmount(){return getQuantity() * getPricePerItem();}
	
	//return String representation of Invoice object
	public String toString(){
		return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f", "Invoice", "Part Number", getPartNumber(), getPartDescription(),
								"Quantity", getQuantity(), "Price per Item", getPricePerItem());
	}
	
}