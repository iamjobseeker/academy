package collection;

import java.util.HashSet;
import java.util.Set;

public class CollectionEx_06_Set {
	
	public static void main(String[] args) {
		
		Set set1 = new HashSet<>();
		Set set2 = new HashSet<>();
		Set set3 = new HashSet<>();
		
		set1.add(1);	set1.add(2);	set1.add(3);
		
		set2.add(3);	set2.add(4);	set2.add(5);
		
		set3.add(1);	set3.add(2);
		
		// 부분집합 여부 확인
		System.out.println("set1이 set2를 포함하는가? " + set1.containsAll(set2)); 
		
		System.out.println("set1이 set3을 포함하는가? " + set1.containsAll(set3));
		
		System.out.println("-------------");
		
		// 합집합
//		set1.addAll(set2); 
//		System.out.println(set1);
//		System.out.println(set2);
		
		// 교집합
//		System.out.println("-------------");
//		
//		set1.retainAll(set2);
//		
//		System.out.println(set1); // set2와 중복되는 요소만 set1에 남겨둔다
		
		System.out.println("-------------");
		
		// 차집합
		set1.removeAll(set2);
		System.out.println(set1);
		
	}

}
