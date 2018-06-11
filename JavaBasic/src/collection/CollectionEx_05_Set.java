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

		System.out.println("ũ��: " + set.size());
		System.out.println("����°� " + set.isEmpty());
		System.out.println("22�� �ִ°�? " + set.contains(22));
		System.out.println("33����: " + set.remove(33));  // booleanŸ�� ��ȯ
		System.out.println("55����: " + set.remove(55));
		System.out.println(set);

		System.out.println("-------------");

//		set.clear();  // ���λ���
//		System.out.println("����°�? " + set.isEmpty());
//		System.out.println(set);

		List list = Arrays.asList(11,22,33,44,55);  // list�� �̿��ؼ� Set�� ������
		set.removeAll(list);  // list�� �ߺ��Ǵ� ������ Set���� ����
		System.out.println(set);

	}

}
