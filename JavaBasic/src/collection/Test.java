package collection;

class AAA{
	// 
	public String foo(){
		return "AAA";
	}
}

class BBB{
	public String foo() {
		return "BBB";
	}
}

class CCC{
	public String foo() {
		return "CCC";
	}
}

class DDD{
	public String foo() {
		return "DDD";
	}
}

public class Test {
	public static void main(String[] args) {
		// 
		AAA A = new AAA();
		System.out.println(A.foo());
		BBB B = new BBB();
		System.out.println(B.foo());
		CCC C = new CCC();
		System.out.println(C.foo());
		DDD D = new DDD();
		System.out.println(D.foo());
	}

}
