package assignment1.factorial;

public class Prime {
	
public static void main(String[] args)
	{
	int primeNum = 13, i;
	
	boolean prime = false;
	
	for(i=2; i<=primeNum; i++)
		{
		if(primeNum%i == 0)
		{
			prime = true;
			break;
		}

	}
		System.out.println(primeNum + " is a prime number");
		}
}