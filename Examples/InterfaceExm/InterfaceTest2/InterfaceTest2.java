
interface One{
	void work();
	default void display(){System.out.println("Default display " + print());}
	private String print(){return "Private print";}
	static void show(){System.out.println("Static show method ");}
}

interface Two{
	static String name = "Ahmad ";
	abstract void move();
	default String getName(){String name = "Ali "; return this.name + name;}
	default void see(){System.out.println("see method ");}
}

abstract class Example implements One, Two{
	
	private String name = "Hussain ";
	
	/* @Override
	public String getName(){return name;} */
	public String getName2(){return name;}
	
	@Override
	public void work(){System.out.println("Superclass Example Work " + getName() + getName2());}
	
	@Override
	public void see(){System.out.println("See method ");}
}


class ExampleOne extends Example{
	
	@Override
	public void move(){System.out.println("Subclass ExampleOne Move");}
	
}

public class InterfaceTest2{
	public static void main(String[] args){
		
		One a = new ExampleOne();
		
		a.display();
		a.work();
		//a.print();
		One.show();
		((Two)a).see();
		
	}
}