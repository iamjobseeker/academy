package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionEx_03_List {
	
	public static void main(String[] args) {
		
		// 반복자, Iterator
		// 컬렉션의 요소들을 읽어오는 방법을 표준화한것
		
		List list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		list.add("Durian");
		
		Iterator iter;
		iter = list.iterator();
		
		System.out.println(iter.next());
		System.out.println(iter.next());
		
		while( iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
		
	}

}
