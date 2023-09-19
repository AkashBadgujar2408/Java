
class Trial{
	int id=1;
	String name="Akash";
}
public class ArrayTrial {
	public static void main(String[] args) {
		//	Trial[] arr = {new Trial(),new Trial(),new Trial(),new Trial()};
		Trial[] arr = new Trial[3];
		arr[0] = new Trial();
		arr[1] = new Trial();
		arr[2] = new Trial();
		for (Trial t: arr) {
			System.out.println(t.id+t.name);
		}
	}
}
