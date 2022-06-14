package assignment2.twowheeler;

public class Twowheeler {

	public int noOfWheels()
	{
		int noOfWheels = 2; 
		return noOfWheels;
	}
	public short noOfMirrors()
	{
		short noOfMirrors = 2;
		return noOfMirrors;
	}
	public long chassisNumber()
	{
	
		long chassisNumber = 6575156936998L;
		return chassisNumber;
	}		
	public boolean isPunctured()
	{
		return false;
	}
	public String bikeName()
	{
		String bikeName = "Fazer";
		return bikeName;
	}
	public double runningKM()
	{
		double runningKM = 50658.768d;
		return runningKM;
	}

	public static void main(String[] args) {
		
		Twowheeler Yamaha = new Twowheeler();
		System.out.println(Yamaha.noOfWheels());
		System.out.println(Yamaha.noOfMirrors());
		System.out.println(Yamaha.chassisNumber());
		System.out.println(Yamaha.isPunctured());
		System.out.println(Yamaha.bikeName());
		System.out.println(Yamaha.runningKM());
	}
}
