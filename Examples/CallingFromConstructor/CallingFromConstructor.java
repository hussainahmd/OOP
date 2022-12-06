//Calling method from constructor
//
public class Test {
	public static void main(String[] args) {
		int a;
		SuperClass sc = new SubSubClass (5, 4, 3);
		//SuperClass sc = new SubClass (5, 4);
		//SuperClass sc = new SuperClass(5);
		System.out.printf("%s\n", sc);
	}
}

class SuperClass {
	int a;
	public SuperClass(int u){
		a = u;
		printMessage(); //subsubclass method is called
		System.out.printf("From SuperClass constructor: a = %d and u = %d\n", a, u);
	}
	public void printMessage () {
	System.out.printf("SuperClass printMessage: Value of a = %d\n",a);
	}
	
	@Override
	public String toString() {
		return "Value of a = " + a;
	}
}

class SubClass extends SuperClass {
	int b;
	public SubClass (int x, int y){
		super (x);
		b = y;
		printMessage(); //subsubclass method is called
		System.out.printf("From SubClass constructor: b = %d and y = %d\n", b, y);
	}
	
	@Override
	public void printMessage(){
		a = b;
		System.out.printf("SubClass printMessage Value of b = %d\n",b);
	}
	
	@Override
	public String toString() {
		return "Value of b = " + b;
	}
}

class SubSubClass extends SubClass {
	int c;
	public SubSubClass (int x, int y, int z){
		super (x, y);
		c = z;
		printMessage();
	}
	
	@Override
	public void printMessage(){
		b = c;
		//System.out.println("Value of b : " + b);
		System.out.printf("SubSubClass printMessage Value of c = %d\n",c);
	}
	
	@Override
	public String toString() {
		return "Value of c = " + c;
	}
}