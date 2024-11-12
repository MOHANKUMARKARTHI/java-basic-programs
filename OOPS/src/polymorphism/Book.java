
                           //CONSTRUCTOR OVERLOADING


package polymorphism;

public class Book {
	
	int id;
	String title;
	
	public Book(){
		
	}
	public Book(int id) {
		this.id=id;
	}
	public Book(int id, String title) {
		this.id=id;
		this.title=title;
	}

}
