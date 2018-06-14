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
				// �ֻ��� Ŭ������ object Ÿ������ ��ȯ�ȴ�
	
	List<? extends String> list1 = new ArrayList<>();
	  // ?�� String�� �ڽ�Ŭ�����̴�
	
	String str = list1.get(0); 
	
	List<Number> list2 = new ArrayList<>();
	  // ? extends Number������ ���ϵ�ī�带 ���� �ʾ����Ƿ� Integer�� ���� �� ����
	
//	Integer int = list1.get(0); 
	// error!
	
} 