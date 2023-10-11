package example3;

public class Car {
	// Handling composition
	Engine engine = new Engine("BS6 Petrol Engine",89);
	
	// Constructors and Getters
	String brand;
	String color;
	int cost;
	
	public Car(String brand, String color, int cost) {
		this.brand = brand;
		this.color = color;
		this.cost = cost;
	}

	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return color;
	}

	public int getCost() {
		return cost;
	}
	
	
}
