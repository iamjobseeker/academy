package innerClass;

public class Outer {
	int num = 10;
	public MemberInner mi = new MemberInner();

	public class MemberInner{
		int num = 20;
		public void print() {
			System.out.println("��� ��ø Ŭ����");
		}
	}

	public static int staticNum = 30;

	public static class StaticInner {
		static int num = 40;
		public static void out() {
			System.out.println("���� ��ø Ŭ����");
		}
	}

	public void out() {
		int localNum = 50;

		class LocalInner{
			int num = 60;

			public void out() {
				System.out.println("���� ��ø Ŭ����");
			}
		}
		LocalInner li = new LocalInner();
		
		System.out.println(li.num);
		li.out();
	}
}

