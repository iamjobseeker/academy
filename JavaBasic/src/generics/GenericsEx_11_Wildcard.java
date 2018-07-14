package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsEx_11_Wildcard {
	
	// List<Object>는 리스트를 기준으로 List<Integer>와 데이터타입이 다르다고 인식되므로 display() 사용이 불가능하다
	// 클래스, 데이터 타입에는 상속성이 적용되지만 제네릭에는 상속성이 적용되지 않는다(무변성)
	// 제네릭에는 무변성이 적용된다 
	public static void display(List<?> l) { 
		for(Object o : l) {  // foreach문
			System.out.println(o);
		}
	}
	
	public static void main(String[] args) {
		
		List <Integer> list = Arrays.asList(10, 20, 30); 
		display(list); 
		
		List <String> strlist = Arrays.asList("A", "B", "C"); 
		display(strlist); 
		
		Object a = new Object();
		Integer b = new Integer(10);
		a = b;	// 자식클래스타입은 부모클래스타입이다
		
		List<Object> o = new ArrayList<>();
		List<Integer> l = new ArrayList<>();
//		o = l;	// 자식제네릭타입과 부모제네릭타입은 무관하다
		
	}

}
