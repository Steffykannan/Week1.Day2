package week1.day2;

public class Car {
	
	//Methods
	public String applyBreak() {
		
		String a = "Break is Applied";
		return a;
	}
	
	String applyGear() {
		String b = "Gear is applied";
		return b;
	}
	
	private boolean switchOnAc() {
		boolean c = true;
		return c;
	}
	
	protected boolean applyAcclerate() {
		boolean d = false;
		return d;
	}
	
	//Print
	
	public static void main(String[] args) {
		
		 Car obj = new Car();
		 
		 //print method with object
		 String e = obj.applyBreak();
		 System.out.println(e);
		 
		 //print method without obj 
		 System.out.println(obj.applyGear());
		 
		 //print boolean value
		 System.out.println(obj.switchOnAc());
		 System.out.println(obj.applyAcclerate());
		 
		 
		 
		 
	}

}
