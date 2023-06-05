public class InitializerBlock{
	
	public static Test t1 = new Test("static member variable");
	
	private Test t2 = new Test("member variable");
	public int x;
	
	{
		Test t3 = new Test("initializer block");
		x = 100;
	}
	
	static{
		Test t4 = new Test("static initializer block");
	}
	
	public InitializerBlock(){
		Test t5 = new Test("from constructor");
	}
	
	//m
	public static void main(String[] args){
		InitializerBlock obj = new InitializerBlock();
		System.out.println("Value of x assigned by initializer block : " + obj.x);
	}
}

class Test{
	public Test(String str){
		System.out.println(str + " : Test constructor is called");
	}
}
