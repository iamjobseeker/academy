package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionEx_02_List {

	public static void main(String[] args) {
		
		List list = new ArrayList(); // 기본 설정에서는 Object 타입만 온다
		
		List<String> list2 = new ArrayList< > (); // list공간의 데이터타입이 String으로 제한된다
										// 오른쪽은 비울수 있다	
		List<Integer> list3 = new ArrayList<Integer>();
			// 기본타입 int가 올 수 없어서 Wrapper클래스가 온다
		
		list2.add("Orange");  // String만 넣을 수 있음
		
		list3.add(123);		// int만 넣을 수 있음
		
		System.out.println("--------");
		
		// ... : 가변인자, 가변파라미터, 갯수가 정해지지않은 인자
		List intList = Arrays.asList(1,2,3,4,5); 
		System.out.println(intList);
		
		List stringList = Arrays.asList("Alice", "Bob", "Clare");
		System.out.println(stringList);

	}
}
