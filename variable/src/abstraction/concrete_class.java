package abstraction;

public class concrete_class extends incomplete_method{

	public static void main(String[] args)
	{
		concrete_class obj = new concrete_class();
		incomplete_method.demo1();
		obj.demo2();
		obj.demo3();
    
		
	}
	
	@Override
    public void demo2()
    {
    	System.out.println("complete method demo2");
    }

	@Override
    public void demo3()
    {
    	System.out.println("complete method demo3");
    }


}
