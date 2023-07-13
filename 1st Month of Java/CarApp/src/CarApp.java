
public class CarApp {

	public static void main(String[] args) {

Car c = new Car("TATA", "Altroz", "MH15GE9373", "Manual", 1100000,
		20, 2, 4, 6, 2);

System.out.println("Brand: "+c.brand);
System.out.println("Model: "+c.model);
System.out.println("License No. "+c.license_No);
System.out.println("Gears type: "+c.gears_type);
System.out.println("Price: Rs."+c.price);
System.out.println("Mileage: "+c.mileage+" kmpl");
System.out.println("Insurance: "+c.insurance+" years");
System.out.println("Number of Seats: "+c.seats);
System.out.println("Number of Gears: "+c.gears_No);
System.out.println("Number of Brakes: "+c.brakes_No);
c.accelerate();
c.decelerate();
	}
}
