package car;

public class Car {
	
	private String model;
	private String color;

	// ������ (Constructor)
	// ��� �ʵ带 �ʱ�ȭ���ִ� ����
	public Car(String str1, String str2) {
		this.model = str1;
		this.color = str2;
	}
	
	// �޼ҵ� (Method)
	public void display() {
		System.out.println("��: "+model+", ����: "+color);
	}
	
	// Setter 
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	// Getter
	public String getModel() {
		return model;
	}
	
	public String getColor() {
		return color;
	}

}


