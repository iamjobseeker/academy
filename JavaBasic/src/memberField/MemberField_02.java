package memberField;

public class MemberField_02 {
	
	// 클래스변수, 정적변수, static변수
	// 클래스에 하나만 만들수있는 변수 
	public static String city = "Seoul";
	
	// 클래스 변수의 Getter
	public String getCity() {
		return city;
	}
	
	// 클래스 변수의 Setter
	// static을 붙여주면 class 메소드가 된다
	// this: 자기객체 참조
	public static void setCity(String c) {
		MemberField_02.city = c;
	}
	
}
