package collection;

import java.util.Set;
import java.util.TreeSet;

public class CollectionEx_09_Set {
	
	public static void main(String[] args) {
		
//		Set set = new TreeSet();
		TreeSet tree = new TreeSet();
		
		tree.add("Banana");
		tree.add("Cherry");
		tree.add("Durian");
		tree.add("Apple");
		
		System.out.println(tree);  // 정렬된 상태로 저장된다	
								   // 이진탐색트리 모형이 사용된다
		
		System.out.println("-------");
		// treeset에서만 가능한 고유의 메소드
		
		Set head = tree.headSet("Cherry");  // cherry보다 사전상 앞에있는 문자
											// = ASCII 코드 숫자가 작은순서
		System.out.println(head);
		
		System.out.println("-------");
		
		Set tail = tree.tailSet("Cherry");  // cherry보다 사전상 뒤에있는 문자
		System.out.println(tail);
		
		System.out.println("-------");
		Set sub = tree.subSet("Banana", "Cherry");  // banana(포함) ~ cherry(미포함)
		System.out.println(sub);
		
		
	}

}
