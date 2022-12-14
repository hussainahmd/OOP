//mid exam
public abstract class TwoDShape{
	
	public abstract double area();
	public abstract double perimeter();	
}

class Circle extends TwoDShape{
	
	int radius;
	
	public Circle(int radius){
		this.radius = radius;
	}
	
	@Override
	public double area(){return Math.PI * radius * radius;}
	
	@Override
	public double perimeter(){return 2 * Math.PI * radius;}
}

class Rectangle extends TwoDShape{
	
	int length;
	int width;
	
	public Rectangle(int length, int width){
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double area(){return length * width;}
	
	@Override
	public double perimeter(){return 2 * (length + width);}
}

