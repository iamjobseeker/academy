package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionEx_05_Set {

	public static void main(String[] args) {

		Set set = new HashSet();

		set.add(11);
		set.add(22);
		set.add(33);

		System.out.println(set);

		System.out.println("-------------");

		System.out.println("크기: " + set.size());
		System.out.println("비었는가 " + set.isEmpty());
		System.out.println("22가 있는가? " + set.contains(22));
		System.out.println("33제거: " + set.remove(33));  // boolean타입 반환
		System.out.println("55제거: " + set.remove(55));
		System.out.println(set);

		System.out.println("-------------");

//		set.clear();  // 전부삭제
//		System.out.println("비었는가? " + set.isEmpty());
//		System.out.println(set);

		List list = Arrays.asList(11,22,33,44,55);  // list를 이용해서 Set을 삭제함
		set.removeAll(list);  // list와 중복되는 내용을 Set에서 삭제
		System.out.println(set);

	}

}
