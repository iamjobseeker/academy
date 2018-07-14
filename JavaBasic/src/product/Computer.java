package product;

public class Computer extends Product{
	
	public Computer(String model, int price) {
		super(model, price); 
	}

	@Override
	public void out(){
		System.out.println("컴퓨터");
//		System.out.println("Computer " + model + " 모델을 구입함");
//		System.out.println("가격은 " + price + "원");
	}

} 