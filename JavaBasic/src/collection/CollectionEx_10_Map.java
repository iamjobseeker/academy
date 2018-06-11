package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CollectionEx_10_Map {

	public static void main(String[] args) {

		Map map = new HashMap();

		map.put(1, "Apple"); 
		// key, value는 object가 기본값이기 때문에 어떤 형태의 key, value든지 올 수 있다
		map.put(2, "Banana");
		map.put(3, "Cherry");
		System.out.println(map);
		// map은 {  } 안에 데이터가 온다 

		System.out.println("-------");
		System.out.println(map.get(3)); // key가 3인 value를 얻어옴

		System.out.println("-------");
		map.put("D", "Durian");
		System.out.println(map);
		System.out.println(map.get("D")); 
		// 리스트의 인덱스에는 숫자만 왔지만
		// 맵의 키에는 다양한 데이터타입이 올 수 있다.

		System.out.println("-------");
		map.put(2, "Orange");  // 키 중복X
		map.put(4, "Apple");   // 값 중복O
		System.out.println(map);

		System.out.println("-------");
		System.out.println(map.containsKey(5));
		System.out.println(map.containsValue("Apple"));

		if(! map.containsKey(5)) {  // 먼저 검사하고 집어넣는다
			map.put(5, "Pineapple");
		}

		if( map.containsKey("D")) { 
			System.out.println(map.get("D"));
		}

		//		String str = (String) map.get(555);	
		//		System.out.println(str.length());	
		// null포인터는 참조할 수 없는데 null.length()를 사용해서 에러가 난다
		// 이러한 에러를 방지하기 위해 예외사항 처리가 필요

		if(map.containsKey(555)) {
			String str = (String) map.get(555);
		}

		System.out.println("-------");
		System.out.println("size: " + map.size());

		System.out.println("-------");
		System.out.println("비었는가? " + map.isEmpty());

		System.out.println("-------");
		map.remove(3);
		System.out.println(map);

		System.out.println("-------");
		map.remove(2, "Apple"); // key, value값 동시 만족해야 remove된다
		System.out.println(map);

		System.out.println("-------");
		map.put(10, null); // 값이 null O
		map.put(null, "Bob"); // 키가 null O
		System.out.println(map);

		map.put(null, null); // key-null, value-null 가능
		System.out.println(map);
		
		System.out.println("-------");
		// key들의 집합을 셋으로 바꿔준다
		Set KeySet = map.keySet();
		// entry 집합을 셋으로 바꿔준다
		Set entrySet = map.entrySet();
		
		System.out.println("key: " + KeySet);
		System.out.println("entry: " + entrySet);
		
		// key=변수, value=변수의 값으로 생각해서 객체를 map으로 표현할 수 있다
		// {x=10, y=20}
		// 리스트안에 담긴 여러 객체(맵)
		// [{x=10, y=20}, {x=15, y=25}, {x=40, y=13}]
		
	}

}
