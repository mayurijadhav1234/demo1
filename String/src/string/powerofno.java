package string;

public class powerofno {

	public static void main(String[] args)
	{
		
		int base = 5, p = 2;
        long result = 1;
        
        int i=p;
        while (i != 0)
        {
            result *= base;
            i--;
        }
        System.out.println(base+"^"+p+" = "+result);

		
//		double result = Math.pow(number, p);
//        System.out.println(number+"^"+p+" = "+result);
		 
		//Here number is the base and p is the exponent
//        int b = 2, p = 5;
//        long result = 1;
//        
//        //Copying the exponent value to the loop counter
//        int i = p;
//        for (;i != 0; --i)
//        {
//            result *= b;
//        }
//        
//        //Displaying the output
//        System.out.println(b+"^"+p+" = "+result);
	}

}
