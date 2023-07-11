
public class Android {
	String brand;
	String model;
	String _OS;
	String processor;
	String color;
	int price;
	int _RAM;
	int _ROM;
	int android_version;
	int warranty_years;
	
	void start(){
		System.out.println(brand+" "+model+" is starting");
	}
	void playVideo() {
		System.out.println(brand+" "+model+" is playing video");
	}
	public Android(String brand, String model, String _OS, String processor, String color, int price, int _RAM,
			int _ROM, int android_version, int warranty_years) {
		super();
		this.brand = brand;
		this.model = model;
		this._OS = _OS;
		this.processor = processor;
		this.color = color;
		this.price = price;
		this._RAM = _RAM;
		this._ROM = _ROM;
		this.android_version = android_version;
		this.warranty_years = warranty_years;
	}	
}
