package DownCasting;

class Plane{
	String name;
	public void takeoff() {
		System.out.println(name+" plane is taking off.");
	}
	public void fly() {
		System.out.println(name+" plane is flying.");
	}
}

class FighterPlane extends Plane {
	public FighterPlane(String name) {
		this.name = name;
	}
	@Override
	public void fly() {
		System.out.println(name+" plane is flying very fast.");
	}
	public void carryArms() {
		System.out.println(name+" is carrying Arms and weapons.");
	}
}

public class PlaneApp {
	public static void main(String[] args) {
		Plane p = new FighterPlane("Vikrant"); //Upcasting
		p.takeoff();	//Inherited Method
		p.fly();		//Overridden Method
		
		// p.carryArms();	//Specialized Method ---> shows error as the method is not present in Plane.
		
		((FighterPlane) p).carryArms(); // Downcasting to FighterPlane
	}
}
