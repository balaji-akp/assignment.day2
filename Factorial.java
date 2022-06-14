package assignment1.factorial;

public class Factorial {
	
	public static void main(String args[])
	{
		int factNum = 5, i;
		long factorial = 1 ;
		for(i=1; i<=factNum; ++i)
		{
			factorial *= i;
		}
		
		System.out.println("Factorial of a number is = "+  factorial);
			
	}

}