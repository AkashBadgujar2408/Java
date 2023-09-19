
public class MutableStringsDemo {
	public static void main(String[] args) {
		StringBuffer strBuff = new StringBuffer("Rama");
		System.out.println(strBuff);
		strBuff.append("Sita");
		System.out.println(strBuff.capacity());
		
		StringBuilder strBld = new StringBuilder("Ravana");
		System.out.println(strBld);
		strBld.append("Asura");
		System.out.println(strBld.capacity());
	}
}
