package polymorphism;

public class BookDriver {
	public static void main(String[] args) {
		Book b1=new Book(1);
		Book b2=new Book();
		Book b3=new Book(2,"java");
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		
	}

}
