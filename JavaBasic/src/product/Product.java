package product;

public abstract class Product {

	protected String model;
	protected int price;

	public Product(String model, int price) {
		this.model = model;
		this.price = price;
	}
	
	// 추상메소드
	// 메소드의 형태는 존재하는데 실제로 구현되는 코드가 없는 형태
	// 따라서 자식 클래스에서 꼭 재정의(override)를 해줘야 함
	// 프로젝트에서 메소드명을 통일시키기 위해 사용한다
	abstract public void out();

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
