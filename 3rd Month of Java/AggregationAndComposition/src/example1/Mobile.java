package example1;

public class Mobile {
	// Handling composition
	OS os = new OS(32,"Android");
	
	// Handling aggregation
	Charger ref;
	public void HasA(Charger ref) {
		this.ref = ref;
		System.out.println(ref.getColor());
		System.out.println(ref.getBrand());
		System.out.println(ref.getType());
	}
}
