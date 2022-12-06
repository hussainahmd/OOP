
interface One extends Two{
	void work();
	default void display(){System.out.println("Default display");}
}

interface Two{
	abstract void move();
}

interface Three extends One{
	abstract void print();
}

abstract class Example implements One, Three{
	
	@Override
	public void work(){System.out.println("Superclass Example Work");}
	
	@Override
	public void display(){System.out.println("Example display");}
	
}


class ExampleOne extends Example/*  implements Three */{
	
	@Override
	public void move(){System.out.println("Subclass ExampleOne Move");}
	
	@Override
	public void print(){System.out.println("Subclass ExampleOne Print");}
	
}

public class InterfaceTest{
	public static void main(String[] args){
		
		One a = new ExampleOne();
		
		a.display();
		a.work();
		a.move();
		((Example)a).print();
		
	}
}