
public class SingletonClassDemo {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getSingleInstance();
		Singleton s2 = Singleton.getSingleInstance();
		Singleton s3 = Singleton.getSingleInstance();
		System.out.println("Reference of s1 = "+s1);
		System.out.println("Reference of s2 = "+s2);
		System.out.println("Reference of s3 = "+s3);
	}
}
