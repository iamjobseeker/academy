package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsEx_01_Basic {
	
	public static void main(String[] args) {
		
		// ���׸��� �÷��ǿ��� ���� ���ȴ�
		
		List list = new ArrayList();
		
		list.add("Apple");
		list.add(123);
		System.out.println(list);
		
		List list1 = new ArrayList(); 
		// boolean add(E e); // E == object�� ��޵�
		
		List<String> list2 = new ArrayList<String>();
		// boolean add(String e);
		
		List<Integer> list3 = new ArrayList<>();
		// boolean add(Integer e);
		
//		list2.add(123);	// String�� �����
//		list3.add(true); // Integer�� �����
//		list3.add("Hello");
		
		list1.add("A");
		list1.add(111);
		System.out.println(list1);
		
		String str1 = (String) list1.get(0); // object�� String���� ����ȯ ���־�� �Ѵ�
		int num1 = (int) list1.get(1); 
		
		list2.add("B");
		System.out.println(list2);
		
		String str2 = list2.get(0); // String���� ��޵ȴ�
		
		
	}

}
