package innerClass;

import innerClass.Outer.StaticInner;

public class OuterEx {
	public static void main(String[] args) {
		Outer o = new Outer();
		System.out.println(o.num);
		System.out.println("------");
		
		// ��ü�� ���ؼ� �����ڸ� ȣ���ϴ°Ͱ� ���� ����
		Outer.MemberInner memIn = o.new MemberInner();
		System.out.println(memIn.num);
		System.out.println("------");
		
		System.out.println(Outer.staticNum);
		System.out.println(Outer.StaticInner.num);
		Outer.StaticInner.out();
		System.out.println("------");
		
		o.out();
		
	}

}
