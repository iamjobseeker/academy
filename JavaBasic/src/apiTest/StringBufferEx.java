package apiTest;

public class StringBufferEx {
	
	public static void main(String[] args) {
		
		String str = new String();
		StringBuffer sb = new StringBuffer();
		// �迭�� ����� ���ڸ� �ִ� ������� �۵��Ѵ�
		
		System.out.println(str.length()); // 0
		System.out.println(sb.length());  // 0
		System.out.println(sb.capacity()); // 16
		// Stringbuffer�� ������ ��Ÿ��
		
		str = str + "HI";
		
		sb = sb.append("HI"); 
		
		System.out.println("---sb2---");
		
		StringBuffer sb2 = new StringBuffer("Hello");
		
		System.out.println("len: " + sb2.length());    // 5
		System.out.println("cap: " + sb2.capacity());  // 5 + 16 = 21
		System.out.println("sb2: " +sb2);
		
		System.out.println("---sb3---");
		
		StringBuffer sb3 = new StringBuffer(5);
		
		System.out.println("len: " + sb3.length());   // 0
		System.out.println("cap: " + sb3.capacity()); //(������) 5
		System.out.println("sb3: " + sb3); 
		
		sb3.append("Apple");
		
		System.out.println("---Apple�߰�---");
		System.out.println("len: " + sb3.length());   // 5
		System.out.println("cap: " + sb3.capacity()); //(������) 5
		System.out.println("sb3: " + sb3); 
		
		sb3.append("Banana");
		
		System.out.println("---Banana�߰�---");
		System.out.println("len: " + sb3.length());   // 11
		System.out.println("cap: " + sb3.capacity()); // (��ħ)   (���� capaticy + 1) X 2 = 12
													  // (�� ��ħ) ��ġ�¸�ŭ �뷮�� �ø� 
		System.out.println("sb3: " + sb3); 
		
		
		System.out.println("-----insert()-----");
		// 5��°�ε���(5 offset)�� "Orange" �ְ� ���
		System.out.println(sb2.insert(5, "Orange"));
				
		System.out.println("-----deleteCharAt()-----");
		// 3��° �ε��� �����ϰ� ���
		System.out.println(sb2.deleteCharAt(3));
		
		System.out.println("-----delete()-----");
		// delete(0, 3) ȣ�� �� ���
		System.out.println(sb2.delete(0, 3));
	
		System.out.println("-----substring()-----");
		// substring(1,7) ȣ��
//		StringBuffer sbsub=(StringBuffer) sb2.substring(1, 7);

		// length, capacity Ȯ��
//		System.out.println("length: " + sbsub.length());
//		System.out.println("capacity: " + sbsub.capacity());
		
		// sb���
		System.out.println(sb2.substring(1, 7));
		// substring(1,7) ��� ���
		
		System.out.println("-----trimToSize()-----");
		// trimToSize() ȣ��
		sb2.trimToSize();

		// length, capacity Ȯ��
		System.out.println("length: " + sb2.length());
		System.out.println("capacity: " + sb2.capacity());

		System.out.println("-----reverse()-----");
		// reverse() ȣ�� �� ��� Ȯ��
		System.out.println(sb2.reverse());
	
	}

}
