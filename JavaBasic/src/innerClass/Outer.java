package innerClass;

public class Outer {
	int num = 10;
	public MemberInner mi = new MemberInner();

	public class MemberInner{
		int num = 20;
		public void print() {
			System.out.println("멤버 중첩 클래스");
		}
	}

	public static int staticNum = 30;

	public static class StaticInner {
		static int num = 40;
		public static void out() {
			System.out.println("정적 중첩 클래스");
		}
	}

	public void out() {
		int localNum = 50;

		class LocalInner{
			int num = 60;

			public void out() {
				System.out.println("지역 중첩 클래스");
			}
		}
		LocalInner li = new LocalInner();
		
		System.out.println(li.num);
		li.out();
	}
}

