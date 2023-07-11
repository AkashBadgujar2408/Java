
public class Car {
	String brand;
	String model;
	String license_No;
	String gears_type;
	int price;
	int mileage;
	int insurance;
	int seats;
	int gears_No;
	int brakes_No;
	
	void accelerate() {
		System.out.println(brand+" "+model+" is accelerating");
	}
	void decelerate() {
		System.out.println(brand+" "+model+" is decelerating");
	}
	
	public Car(String brand, String model, String license_No, String gears_type, int price,
			int mileage, int insurance, int seats, int gears_No, int brakes_No) {
		super();
		this.brand = brand;
		this.model = model;
		this.license_No = license_No;
		this.gears_type = gears_type;
		this.price = price;
		this.mileage = mileage;
		this.insurance = insurance;
		this.seats = seats;
		this.gears_No = gears_No;
		this.brakes_No = brakes_No;
	}
}
