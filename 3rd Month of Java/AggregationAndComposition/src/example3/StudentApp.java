package example3;

public class StudentApp {
	public static void main(String[] args) {
		Student student = new Student();
		System.out.println(student.heart.getColor()+" "+student.heart.getWeight());
		System.out.println(student.brain.getColor()+" "+student.brain.getColor());
		
		Book book = new Book("Vaishnavi Badgujar","Let Us Learn Living",249);
		student.HasABook(book);
		Car car = new Car("Maruti Suzuki","Red",350000);
		student.HasACar(car);
		
		// Lost Student Object
		student = null;
		// System.out.println(student.heart.getColor()+" "+student.heart.getWeight());
		// System.out.println(student.brain.getColor()+" "+student.brain.getColor());
		System.out.println(book.getAuthor()+" "+book.getName()+" "+book.getPrice());
		System.out.println(car.getBrand()+" "+car.getColor()+" "+car.getCost());
		System.out.println(car.engine.getBHP()+" "+car.engine.getType());
	}
}