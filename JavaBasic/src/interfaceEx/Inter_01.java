package interfaceEx;

// class 대신 interface가 생성된다
public interface Inter_01 {
	
	public static final int NUM = 123;
	// 상수 NUM을 만듬
	int NUM1 = 123;
	// 무조건 public static final이 앞에 붙는다고 가정
	// int만 적어도 상수가 된다

	int MAX = 999;
	// 멤버필드가 아닌 상수가 된다
	
	// 메소드는 무조건 추상 메소드
	// abstract를 안 적어도 자동으로 추상 메소드가 된다
	public void out();
	public abstract void display();

}
