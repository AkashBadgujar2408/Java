package example1;

public class Charger {
	String color;
	String brand;
	String type;
	public Charger(String color, String brand, String type) {
		this.color = color;
		this.brand = brand;
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public String getBrand() {
		return brand;
	}
	public String getType() {
		return type;
	}
}
