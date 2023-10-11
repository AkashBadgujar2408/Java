
public class Trial {
	public static void main(String[] args) {
		Student st = trial(3,"Golu",97);
		System.out.println(st.id+" "+st.name+" "+st.marks);
	}
	public static Student trial(int id, String name, int marks) {
		
		return new Student (id, name, marks);
	}
}
