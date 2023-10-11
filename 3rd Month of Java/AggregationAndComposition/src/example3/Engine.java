package example3;

public class Engine {
	String type;
	int BHP;
	
	public Engine(String type, int BHP) {
		this.type = type;
		this.BHP = BHP;
	}
	
	public String getType() {
		return type;
	}
	
	public int getBHP() {
		return BHP;
	}
}