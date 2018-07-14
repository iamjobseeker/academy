package car;

public class Car {
	
	private String model;
	private String color;

	// 생성자 (Constructor)
	// 멤버 필드를 초기화해주는 역할
	public Car(String str1, String str2) {
		this.model = str1;
		this.color = str2;
	}
	
	// 메소드 (Method)
	public void display() {
		System.out.println("모델: "+model+", 색상: "+color);
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


