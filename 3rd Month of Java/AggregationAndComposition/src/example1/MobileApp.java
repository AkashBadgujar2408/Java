package example1;

public class MobileApp {
	public static void main(String[] args) {
		Mobile mob = new Mobile();
		System.out.println(mob.os.name);
		System.out.println(mob.os.type);
		
		Charger charger = new Charger("Black","Samsung","C-Type");
		mob.HasA(charger);
		
		mob = null;
		System.out.println(mob.os.name);	// Will cause error as the reference is changed to null
		System.out.println(mob.os.type);	// Will cause error as the reference is changed to null
	}
}
