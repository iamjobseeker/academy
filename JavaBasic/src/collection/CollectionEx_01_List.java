package collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionEx_01_List {

	public static void main(String[] args) {

		// list가 가지는 메소드
		// 탐색(조회), 삽입=추가, 삭제, 수정
		
		List list;
		list = new ArrayList();  // 처음에는 공간이 없는 상태이다
		
		System.out.println("---삽입---");
		list.add("Apple");	// 삽입
		list.add("Banana");	
		list.add("Cherry");
		System.out.println(list);
		
		System.out.println("---삭제---");
		list.remove(2); // 삭제
		System.out.println(list);
		
		System.out.println("---조회---");
		System.out.println(list.get(1));  // getter
		
		System.out.println("---삽입---");
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
