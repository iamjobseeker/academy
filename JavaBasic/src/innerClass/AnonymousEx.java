package innerClass;

interface Anonymous {
	void out();

}

// 클릭 이벤트생성시 많이 사용한다
// 매번 동작이 달라지기 때문
public class AnonymousEx {
	public static void main(String[] args) {

		Anonymous an;
		// 생성자를 만들기 위해 구현한다
		an = new Anonymous() {
			@Override
			public void out() {
				System.out.println("익명객체 1번");
			}
		};
		an.out();

		Anonymous an2 = new Anonymous() {
			@Override
			public void out() {
				System.out.println("익명객체 2번");
			}
		};
		an2.out();
		
		new Anonymous() {
			@Override
			public void out() {
				System.out.println("익명객체 3번");
			}
		}.out();
	
		// 클래스에 비교해보기
		class A {
			public void out() {
				System.out.println("클래스 A");
			}
		}
		new A().out();
		
		
		
		
		
	}
}
