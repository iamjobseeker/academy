package constructor;

import car.Car;

public class ConstructorEx_03 {
	public static void main(String[] args) {
		
		Car c1 = new Car("K5", "Black");
		c1.display();
		
		c1.setModel("Morning");
		c1.setColor("white");
		
		System.out.println("-------------------");
		
//		System.out.println(c1.getModel());
//		System.out.println(c1.getColor());	
		c1.display();
		
	}

}
