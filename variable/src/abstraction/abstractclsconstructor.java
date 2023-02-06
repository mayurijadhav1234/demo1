package abstraction;

public abstract class abstractclsconstructor
{
 
	public abstractclsconstructor()
	{
		this(10,90);
		
		System.out.println("defualt constructor");
		
	}
	
	private abstractclsconstructor(int a)
	{
		System.out.println("private constructor");
	}
	
	private abstractclsconstructor(int a,int b)
	{
		System.out.println("p22 constructor");
	}
	
}
