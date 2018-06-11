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
		
		System.out.println(tree);  // ���ĵ� ���·� ����ȴ�	
								   // ����Ž��Ʈ�� ������ ���ȴ�
		
		System.out.println("-------");
		// treeset������ ������ ������ �޼ҵ�
		
		Set head = tree.headSet("Cherry");  // cherry���� ������ �տ��ִ� ����
											// = ASCII �ڵ� ���ڰ� ��������
		System.out.println(head);
		
		System.out.println("-------");
		
		Set tail = tree.tailSet("Cherry");  // cherry���� ������ �ڿ��ִ� ����
		System.out.println(tail);
		
		System.out.println("-------");
		Set sub = tree.subSet("Banana", "Cherry");  // banana(����) ~ cherry(������)
		System.out.println(sub);
		
		
	}

}
