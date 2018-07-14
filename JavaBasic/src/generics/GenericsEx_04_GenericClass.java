package generics;

//class04 ����

	// T ���׸� ����
	// ����ʵ� T obj ����
	// getter, setter ����

class Class04 <T> {
	private T obj;
	
	public void setObj(T st) {
		this.obj = st;
	}
	
	public T getObj() {
		return this.obj;
	}
}

public class GenericsEx_04_GenericClass {
	
	public static void main(String[] args) {
		
		Class04 <String> c04 = new Class04<> ();
		c04.setObj("A");
		System.out.println(c04.getObj());
		
		Class04 <Integer> c041 = new Class04<> ();
		c041.setObj(123);
		System.out.println(c041.getObj());
		
	}

}
