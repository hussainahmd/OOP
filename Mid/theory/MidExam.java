//driver class
public class MidExam{
	
	public static void main(String[] args){
		
		int radius = Integer.parseInt(args[0]);
		int length = Integer.parseInt(args[1]);
		int width = Integer.parseInt(args[2]);
		
		TwoDShape[] array = new TwoDShape[2];
		array[0] = new Circle(radius);
		array[1] = new Rectangle(length, width);
		
		for(TwoDShape x : array){
			System.out.printf("area = %.6f, perimeter = %.6f%n", x.area(), x.perimeter());
		}
	}
}