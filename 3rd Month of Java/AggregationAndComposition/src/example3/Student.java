package example3;

public class Student extends Human {
		Book book;
		Car car;
		public void HasABook(Book book) {
			this.book = book;
			System.out.println(book.getAuthor()+" "+book.getName()+" "+book.getPrice());
		}
		public void HasACar(Car car) {
			this.car = car;
			System.out.println(car.getBrand()+" "+car.getColor()+" "+car.getCost());
			System.out.println(car.engine.getBHP()+" "+car.engine.getType());
		}
}
