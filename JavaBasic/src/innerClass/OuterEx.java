package innerClass;

import innerClass.Outer.StaticInner;

public class OuterEx {
	public static void main(String[] args) {
		Outer o = new Outer();
		System.out.println(o.num);
		System.out.println("------");
		
		// 객체를 통해서 생성자를 호출하는것과 같은 원리
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
