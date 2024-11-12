package interfa;

public class CalculatorDriver {
	public static void main(String[] args) {
		CalculatorImpl c1= new CalculatorImpl();
		c1.add(10,50);
		c1.sub(90,80);
		c1.mul(40, 60);
	}

}
