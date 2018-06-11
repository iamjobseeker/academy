package collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionEx_08_Set {
	
	public static void main(String[] args) {
		
		Set set = new LinkedHashSet<>();
		
		set.add("Cherry");
		set.add("Apple");
		set.add("Banana");
		
		System.out.println(set); // 순서가 유지되는 Linkedhashset
								// 앞뒤 데이터에 대한 인덱스(양방향 포인터)가 생성된다
	}

}
