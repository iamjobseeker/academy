package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsEx_01_Basic {
	
	public static void main(String[] args) {
		
		// 제네릭은 컬렉션에서 자주 사용된다
		
		List list = new ArrayList();
		
		list.add("Apple");
		list.add(123);
		System.out.println(list);
		
		List list1 = new ArrayList(); 
		// boolean add(E e); // E == object로 취급됨
		
		List<String> list2 = new ArrayList<String>();
		// boolean add(String e);
		
		List<Integer> list3 = new ArrayList<>();
		// boolean add(Integer e);
		
//		list2.add(123);	// String만 취급함
//		list3.add(true); // Integer만 취급함
//		list3.add("Hello");
		
		list1.add("A");
		list1.add(111);
		System.out.println(list1);
		
		String str1 = (String) list1.get(0); // object를 String으로 형변환 해주어야 한다
		int num1 = (int) list1.get(1); 
		
		list2.add("B");
		System.out.println(list2);
		
		String str2 = list2.get(0); // String으로 취급된다
		
		
	}

}
