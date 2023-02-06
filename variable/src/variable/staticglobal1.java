package variable;

public class staticglobal1 
{
     static int age = 20;
     static String  name = "mayuri";
     
	public static void main(String[] args) 
	{
		System.out.println(age);
		System.out.println(name);
		                              //calling by class name (static method)
		staticglobal1 obj = new staticglobal1();
		obj.demo1();
		
		staticglobal1.add(); 
		
		System.out.println();
		
	}
	
	public void demo1()
	{
		System.out.println(age);
		System.out.println(name);

	}
    public static void add()
    {
        int a=20;
    	int b=15;
    	int sum=a+b;
    	System.out.println("addition of number is :" +sum);
//    	System.out.println(sum);
    	
    }
}
