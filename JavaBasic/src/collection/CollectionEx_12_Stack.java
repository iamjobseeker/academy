package collection;

import java.util.Stack;

public class CollectionEx_12_Stack {
	
	public static void main(String[] args) {
		
		Stack st = new Stack();
		
		st.push("Apple");
		st.push("Banana");
		st.push("cherry");
		System.out.println(st);
		System.out.println("크기: " + st.size());
		
		System.out.println("-------");
		System.out.println("pop: " + st.pop());
		System.out.println(st);
		System.out.println("크기: " + st.size());
		
		System.out.println("-------");
		System.out.println(st.peek());
		System.out.println(st);
		System.out.println("크기: " + st.size());
	}

}
