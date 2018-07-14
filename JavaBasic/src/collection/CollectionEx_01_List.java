package collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionEx_01_List {

	public static void main(String[] args) {

		// list�� ������ �޼ҵ�
		// Ž��(��ȸ), ����=�߰�, ����, ����
		
		List list;
		list = new ArrayList();  // ó������ ������ ���� �����̴�
		
		System.out.println("---����---");
		list.add("Apple");	// ����
		list.add("Banana");	
		list.add("Cherry");
		System.out.println(list);
		
		System.out.println("---����---");
		list.remove(2); // ����
		System.out.println(list);
		
		System.out.println("---��ȸ---");
		System.out.println(list.get(1));  // getter
		
		System.out.println("---����---");
		list.add(1, "Tomato");
		System.out.println(list);
		
		System.out.println("---contains()---");
		System.out.println(list.contains("Tomato"));
		
		System.out.println("---isEmpty()---");
		System.out.println(list.isEmpty());
		
		System.out.println("---clear()---");
		list.clear();
		System.out.println(list);
		System.out.println(list.isEmpty());
		
		System.out.println("-----------");
		list.add("A");
		list.add("B");
		list.add("C");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("------------");
		for(Object s: list) {
			System.out.println(s);
		}
		
		System.out.println("------------");
		list.add(100);
		list.add(true);
		list.add(123.455);
		System.out.println(list);
		
	}

}
