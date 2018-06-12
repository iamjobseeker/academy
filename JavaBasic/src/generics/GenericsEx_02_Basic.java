package generics;

class Class02 <T>{ // T타입을 가지는 제네릭 클래스
	// 멤버필드
	T st1;
	T st2;	
	int num1;	
	String str;
	
	public void setVar1(T st1){
		this.st1 = st1;
	}
}

interface Interface02 <T2>{ // T2타입을 가지는 인터페이스
	
}


public class GenericsEx_02_Basic {
	public static void main(String[] args) {
		
//		Class02<Boolean> c02 = new Class02<>(); // T==boolean으로 지정해줌
//		c02.setVar1(true);
//		System.out.println(c02.st1);
//		System.out.println(c02.st2);  // ==null
		
		Class02<String> c = new Class02<String>();
		c.setVar1("Apple");
		System.out.println(c.st1);
		
		
		
		
	}
}
