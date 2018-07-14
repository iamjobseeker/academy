package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CollectionEx_10_Map {

	public static void main(String[] args) {

		Map map = new HashMap();

		map.put(1, "Apple"); 
		// key, value�� object�� �⺻���̱� ������ � ������ key, value���� �� �� �ִ�
		map.put(2, "Banana");
		map.put(3, "Cherry");
		System.out.println(map);
		// map�� {  } �ȿ� �����Ͱ� �´� 

		System.out.println("-------");
		System.out.println(map.get(3)); // key�� 3�� value�� ����

		System.out.println("-------");
		map.put("D", "Durian");
		System.out.println(map);
		System.out.println(map.get("D")); 
		// ����Ʈ�� �ε������� ���ڸ� ������
		// ���� Ű���� �پ��� ������Ÿ���� �� �� �ִ�.

		System.out.println("-------");
		map.put(2, "Orange");  // Ű �ߺ�X
		map.put(4, "Apple");   // �� �ߺ�O
		System.out.println(map);

		System.out.println("-------");
		System.out.println(map.containsKey(5));
		System.out.println(map.containsValue("Apple"));

		if(! map.containsKey(5)) {  // ���� �˻��ϰ� ����ִ´�
			map.put(5, "Pineapple");
		}

		if( map.containsKey("D")) { 
			System.out.println(map.get("D"));
		}

		//		String str = (String) map.get(555);	
		//		System.out.println(str.length());	
		// null�����ʹ� ������ �� ���µ� null.length()�� ����ؼ� ������ ����
		// �̷��� ������ �����ϱ� ���� ���ܻ��� ó���� �ʿ�

		if(map.containsKey(555)) {
			String str = (String) map.get(555);
		}

		System.out.println("-------");
		System.out.println("size: " + map.size());

		System.out.println("-------");
		System.out.println("����°�? " + map.isEmpty());

		System.out.println("-------");
		map.remove(3);
		System.out.println(map);

		System.out.println("-------");
		map.remove(2, "Apple"); // key, value�� ���� �����ؾ� remove�ȴ�
		System.out.println(map);

		System.out.println("-------");
		map.put(10, null); // ���� null O
		map.put(null, "Bob"); // Ű�� null O
		System.out.println(map);

		map.put(null, null); // key-null, value-null ����
		System.out.println(map);
		
		System.out.println("-------");
		// key���� ������ ������ �ٲ��ش�
		Set KeySet = map.keySet();
		// entry ������ ������ �ٲ��ش�
		Set entrySet = map.entrySet();
		
		System.out.println("key: " + KeySet);
		System.out.println("entry: " + entrySet);
		
		// key=����, value=������ ������ �����ؼ� ��ü�� map���� ǥ���� �� �ִ�
		// {x=10, y=20}
		// ����Ʈ�ȿ� ��� ���� ��ü(��)
		// [{x=10, y=20}, {x=15, y=25}, {x=40, y=13}]
		
	}

}
