// oop lab mid-exam 24-11-22
interface Edible{
	boolean isEdible();
}

interface Halal{
	boolean isHalal();
}

//Superclass Animal
abstract class Animal implements Edible, Halal{
	private int weight;
	private boolean edible;
	private boolean halal;
	
	public Animal(int weight, boolean edible, boolean halal){
		
		if(weight <= 0){throw new IllegalArgumentException("Weight should be >= 0");}
		this.weight = weight;
		this.edible = edible;
		this.halal = halal;
	}
	
	public boolean getEdible(){return edible;}
	
	public boolean getHalal(){return halal;}
	
	public int getWeight(){return weight;}
	
	public boolean isEdible(){return getEdible();}
	
	public boolean isHalal(){return getHalal();}
	
	@Override
	public String toString(){
		return String.format("I am a %s, my weight is %dkg, I am %s, %s%n", getClass().getName(), getWeight(),
								getEdible() == true ? "Edible" : "Not Edible",
								getHalal() == true ? "Halal" : "Not Halal");
	}

}
	
// Subclass Cat
class Cat extends Animal{
	public Cat(int weight, boolean edible, boolean halal){
		super(weight, edible, halal);
	}
	
}

// Subclass Goat
class Goat extends Animal{
	
	public Goat(int weight, boolean edible, boolean halal){
		super(weight, edible, halal);
	}
	

}

// Subclass StriatedSurgeonFish
class StriatedSurgeonFish extends Animal{
	
	public StriatedSurgeonFish(int weight, boolean edible, boolean halal){
		super(weight, edible, halal);
	}
	
}

//Driver class
public class MidLab_OOP{
	
	public static void main(String[] args){
		
		Animal[] array = new Animal[]{
			new Cat(2, true, false), new Goat(50, true, true), new StriatedSurgeonFish(4, false, false)
		};
		
		for(Animal animal : array){
			System.out.print(animal.toString());
		}
	}
}