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
	int weight;
	
	public Kinu(int weight){
		this.weight = weight;
	}
	
	@Override
	public double calculate(){
		return 0.03 * weight;
	}
}

//class Malta
class Malta extends Citrus{
	int weight;
	
	public Malta(int weight){
		this.weight = weight;
	}
	
	@Override
	public double calculate(){
		return 0.02 * weight;
	}
}

//class Kharbooza
class Kharbooza extends Melon{
	int weight;
	
	public Kharbooza(int weight){
		this.weight = weight;
	}
	
	@Override
	public double calculate(){
		return 0.00001 * weight;
	}
}

//class Tarbooz
class Tarbooz extends Melon{
	int weight;
	
	public Tarbooz(int weight){
		this.weight = weight;
	}
	
	@Override
	public double calculate(){
		return 0.00008 * weight;
	}
}