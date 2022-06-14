package assignment2.car;

public class Car {

	public boolean applyBreak()
	{
		return true;
	}
	public int applyGear()
	{
		int applyGear = 3;
		return applyGear;
	}
	public String switchOnAc()
	{
		String switchOnAc = "On";
		return switchOnAc;
	}
	public float applyAcclerate()
	{
		float applyAcclerate = 153.46f;
		return applyAcclerate;
	}
	
public static void main(String[] args) {
	Car KIA = new Car();
	System.out.println(KIA.applyBreak());
	System.out.println(KIA.applyGear());
	System.out.println(KIA.switchOnAc());
	System.out.println(KIA.applyAcclerate());
	}
  }
