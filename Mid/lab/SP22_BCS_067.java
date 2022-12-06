// oop lab mid-exam
interface Edible{
	boolean isEdible();
}

interface Halal{
	boolean isHalal();
}

abstract class Animal implements Edible, Halal{
	
	public abstract int getWeight(); //optional to declare this method here, benifit is that we can call the getWeight() method of the subclasses objects with supercalss reference
}

class Cat extends Animal{
	private int weight;
	private boolean edible;
	private boolean halal;
	
	public Cat(int weight, boolean edible, boolean halal){
		if(weight <= 0){throw new IllegalArgumentException("Weight should be >= 0");}
		this.weight = weight;
		this.edible = edible;
		this.halal = halal;
	}
	
	public boolean getEdible(){return edible;}
	public boolean getHalal(){return halal;}
	
	@Override
	public int getWeight(){return weight;}
	
	@Override
	public boolean isEdible(){return getEdible();}
	
	@Override
	public boolean isHalal(){return getHalal();}
	
	@Override
	public String toString(){
		return String.format("I am a Cat, my weight is %dkg, I am %s, %s%n", getWeight(), (getEdible() == true ? "Edible" : "Not Edible"),
							(getHalal() == true ? "Halal" : "Not Halal"));
	}
}

class Goat extends Animal{
	private int weight;
	private boolean edible;
	private boolean halal;
	
	public Goat(int weight, boolean edible, boolean halal){
		if(weight <= 0){throw new IllegalArgumentException("Weight should be >= 0");}
		this.weight = weight;
		this.edible = edible;
		this.halal = halal;
	}
	
	public boolean getEdible(){return edible;}
	public boolean getHalal(){return halal;}
	
	@Override
	public int getWeight(){return weight;}
	
	@Override
	public boolean isEdible(){return getEdible();}
	
	@Override
	public boolean isHalal(){return getHalal();}
	
	@Override
	public String toString(){
		return String.format("I am a Goat, my weight is %dkg, I am %s, %s%n", getWeight(), (getEdible() == true ? "Edible" : "Not Edible"),
							(getHalal() == true ? "Halal" : "Not Halal"));
	}

}

class StriatedSurgeonFish extends Animal{
	
	private int weight;
	private boolean edible;
	private boolean halal;
	
	public StriatedSurgeonFish(int weight, boolean edible, boolean halal){
		if(weight <= 0){throw new IllegalArgumentException("Weight should be >= 0");}
		this.weight = weight;
		this.edible = edible;
		this.halal = halal;
	}
	
	public boolean getEdible(){return edible;}
	public boolean getHalal(){return halal;}
	
	@Override
	public int getWeight(){return weight;}
	
	@Override
	public boolean isEdible(){return getEdible();}
	
	@Override
	public boolean isHalal(){return getHalal();}
	
	@Override
	public String toString(){
		return String.format("I am a StriatedSurgeonFish, my weight is %dkg, I am %s, %s%n", getWeight(), (getEdible() == true ? "Edible" : "Not Edible"),
							(getHalal() == true ? "Halal" : "Not Halal"));
	}
}

public class SP22_BCS_067{
	
	public static void main(String[] args){
		
		Animal[] array = new Animal[]{
			new Cat(2, true, false), new Goat(50, true, true), new StriatedSurgeonFish(4, false, false)
		};
		
		/* System.out.println(array[1].getWeight());
		Goat a = (Goat)array[1];
		System.out.println(a.getEdible()); */
		
		for(Animal animal : array){
			System.out.print(animal.toString()); //toString() is also available in Supercalss implicitly so calling the objects method with Superclass reference is correct
		}
	}
}