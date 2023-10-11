
public class Singleton {
	private Singleton() {
	}
	private static Singleton ref = null;
	public static Singleton getSingleInstance() {
		if (ref == null) {
			ref = new Singleton();
		}
		return ref;
	}
}
