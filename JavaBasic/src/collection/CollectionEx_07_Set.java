package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionEx_07_Set {

	public static void main(String[] args) {

		Set set = new HashSet();
		set.add(11);
		set.add(22);
		set.add(33);
		set.add(44);
		set.add(55);
		System.out.println(set);

		System.out.println("--------");

		Iterator iter = set.iterator();
		while(iter.hasNext()) { // iter에 다음값이 있는지 확인
			System.out.println(iter.next());  // 다음값이 있으면 확인
		}

		System.out.println("--------");

		Object[] arr =set.toArray();  // Set을 Object타입의 list로 변환

		Arrays.sort(arr);  // 순서 정렬

		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}


	}

}
