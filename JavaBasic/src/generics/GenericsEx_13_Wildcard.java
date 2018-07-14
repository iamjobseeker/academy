package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsEx_13_Wildcard {
	
	public static void display(List<? super Integer> l) {
		for(Object o : l) {
			System.out.println(o);
		}
	}
	
	public static void main(String[] args) {
		
			List<Number> list = new ArrayList<>();
			
			list.add(10);
			list.add(20);
			list.add(30);
			
			display(list);

		}
		
	
	List<?> list = new ArrayList<>(); 
	
	//String str = list.get(0);
				// 최상위 클래스인 object 타입으로 반환된다
	
	List<? extends String> list1 = new ArrayList<>();
	  // ?은 String의 자식클래스이다
	
	String str = list1.get(0); 
	
	List<Number> list2 = new ArrayList<>();
	  // ? extends Number형태의 와일드카드를 쓰지 않았으므로 Integer로 받을 수 없다
	
//	Integer int = list1.get(0); 
	// error!
	
} 