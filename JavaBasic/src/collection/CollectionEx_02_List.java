package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionEx_02_List {

	public static void main(String[] args) {
		
		List list = new ArrayList(); // �⺻ ���������� Object Ÿ�Ը� �´�
		
		List<String> list2 = new ArrayList< > (); // list������ ������Ÿ���� String���� ���ѵȴ�
										// �������� ���� �ִ�	
		List<Integer> list3 = new ArrayList<Integer>();
			// �⺻Ÿ�� int�� �� �� ��� WrapperŬ������ �´�
		
		list2.add("Orange");  // String�� ���� �� ����
		
		list3.add(123);		// int�� ���� �� ����
		
		System.out.println("--------");
		
		// ... : ��������, �����Ķ����, ������ ������������ ����
		List intList = Arrays.asList(1,2,3,4,5); 
		System.out.println(intList);
		
		List stringList = Arrays.asList("Alice", "Bob", "Clare");
		System.out.println(stringList);

	}
}
