package encapsulation;

public class CarDetails {
	public static void main(String[] args) {
		Car c = new Car();
		
		c.setNo(1);
		c.setName("Audi");
		c.setColor("Black");
		
		

		System.out.println(c.getNo());
		System.out.println(c.getName());
		System.out.println(c.getColor());
		
		
	}

	

}
