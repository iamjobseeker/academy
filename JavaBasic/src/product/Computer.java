package product;

public class Computer extends Product{
	
	public Computer(String model, int price) {
		super(model, price); 
	}

	@Override
	public void out(){
		System.out.println("��ǻ��");
//		System.out.println("Computer " + model + " ���� ������");
//		System.out.println("������ " + price + "��");
	}

} 