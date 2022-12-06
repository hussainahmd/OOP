public class TestInterface
{
	public static void main (String[] arg)
	{
		ClassOne c1 = new ClassOne();
		System.out.printf("value returned by methodOne is %d\n", 
			c1.methodOne());
		System.out.printf("value returned by methodTwo is %s\n", 
			c1.m2());
	}
}

class ClassOne implements MyInterface1, MyInterface2
{
	@Override
	public int methodOne() {return 5;}
	@Override
	public String m2(){ return MyInterface1.super.m2() + "   " + MyInterface2.super.m2(); }
}

interface MyInterface1  {
	int methodOne();               // no definition
	default String m2() { return "m2OfI1";}
}

interface MyInterface2  {
	int methodOne();               // no definition
	default String m2() { return "m2OfI2s";}
}



