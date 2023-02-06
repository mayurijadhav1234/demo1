package string;

public class studdata {

	public static void main(String[] args)
	{
		studdata.studinfo("mayuri",101,'A',80.21f);
		studdata.addition();

	}
	
	
      // static method with parameter
	public static void studinfo(String sname, int srollno, char sgrade , float spercentage)
	{
		System.out.println("Student Name is:"  +sname+ '\n'+  "Student rollno is:" +srollno + '\n'+  "Student Grade is:" +sgrade + '\n'+"Student Percentage is:" +spercentage);
	}
	
	// static method without parameter
	public static void addition()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("addition of two numbers :" +c);
	}
}
