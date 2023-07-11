

public class AndroidApp {

	public static void main(String[] args) {
		Android a = new Android("Samsung", "Galaxy", "Android","Octacore", "Blue", 26000, 4, 64, 11, 1);
		System.out.println("Android Brand: "+a.brand);
		System.out.println("Android Model:"+a.model);
		System.out.println("OS: "+a._OS);
		System.out.println("Processor: "+a.processor);
		System.out.println("Colour: "+a.color);
		System.out.println("Price: Rs."+a.price);
		System.out.println("RAM: "+a._RAM+" GB");
		System.out.println("ROM: "+a._ROM+" GB");
		System.out.println("Android Version: "+a.android_version);
		System.out.println("Warranty: "+a.warranty_years+" years");
		a.start();
		a.playVideo();
	}
}
