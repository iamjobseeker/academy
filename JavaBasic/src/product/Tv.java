package product;

public class Tv extends Product {
	
	public Tv(String model, int price) {
		super(model, price); 
	} 
	
	@Override
	public void out() {
		System.out.println("Tv");
//		System.out.println("Tv " + model + "을 구입함");
//		System.out.println("가격은" + price + "원");
	} 
} 