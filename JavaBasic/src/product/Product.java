package product;

public abstract class Product {

	protected String model;
	protected int price;

	public Product(String model, int price) {
		this.model = model;
		this.price = price;
	}
	
	// �߻�޼ҵ�
	// �޼ҵ��� ���´� �����ϴµ� ������ �����Ǵ� �ڵ尡 ���� ����
	// ���� �ڽ� Ŭ�������� �� ������(override)�� ����� ��
	// ������Ʈ���� �޼ҵ���� ���Ͻ�Ű�� ���� ����Ѵ�
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
