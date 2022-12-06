//section B lab mid
//abstract class Fruit
public abstract class Fruit{
	
	public abstract double calculate();
}

//abstract class Citrus
abstract class Citrus extends Fruit{
	
}

//abstract class Melon
abstract class Melon extends Fruit{
	
}

//class Kinu
class Kinu extends Citrus{
	private int weight; //weight of Kinu
	final double percentage = 0.03; //3% vitaminC
	
	
	public Kinu(int weight){
		if(weight <= 0){ //validate weight
			throw new IllegalArgumentException("Kinu Weight should be >= 0");
		}
		this.weight = weight;
	}
	
	//get weight of Kinu
	public int getWeight(){return weight;}
	
	@Override
	public double calculate(){
		return percentage * getWeight();
	}
}

//class Malta
class Malta extends Citrus{
	private int weight; //weight of Malta
	final double percentage = 0.02; //2% vitaminC
	
	public Malta(int weight){
		if(weight <= 0){ //validate weight
			throw new IllegalArgumentException("Malta Weight should be >= 0");
		}
		this.weight = weight;
	}
	
	//get weight of Malta
	public int getWeight(){return weight;}
	
	@Override
	public double calculate(){
		return percentage * getWeight();
	}
}

//class Kharbooza
class Kharbooza extends Melon{
	private int weight; //weight of Kharbooza
	final double percentage = 0.00001; //0.001% antioxidants
	
	public Kharbooza(int weight){
		if(weight <= 0){ //validate weight
			throw new IllegalArgumentException("Kharbooza Weight should be >= 0");
		}
		this.weight = weight;
	}
	
	//get weight of Kharbooza
	public int getWeight(){return weight;}
	
	@Override
	public double calculate(){
		return percentage * getWeight();
	}
}

//class Tarbooz
class Tarbooz extends Melon{
	private int weight; //weight of Tarbooz
	final double percentage = 0.00008; //0.008% antioxidants
	
	public Tarbooz(int weight){
		if(weight <= 0){ //validate weight
			throw new IllegalArgumentException("Tarbooz Weight should be >= 0");
		}
		this.weight = weight;
	}
	
	//get weight of Tarbooz
	public int getWeight(){return weight;}
	
	@Override
	public double calculate(){
		return percentage * getWeight();
	}
}