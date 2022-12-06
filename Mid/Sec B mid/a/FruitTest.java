//driver class
public class FruitTest{
	
	public static void main (String[] args){
		
		Fruit[] array = new Fruit[4];
		
		array[0] = new Kinu(Integer.parseInt(args[0]));
		array[1] = new Malta(Integer.parseInt(args[1]));
		array[2] = new Kharbooza(Integer.parseInt(args[2]));
		array[3] = new Tarbooz(Integer.parseInt(args[3]));
		
		double vitaminC = 0;
		double antiOx = 0;
		
		for(Fruit fruit : array){
			if(fruit instanceof Citrus){
				vitaminC += fruit.calculate();
			}
			else{
				antiOx += fruit.calculate();
			}
		}
		
		System.out.printf("%nYou will get %f gm of Vitamin C and %f gm of Antioxidants%n", vitaminC, antiOx);
	}
}