package apiTest;

public class StringBufferEx {
	
	public static void main(String[] args) {
		
		String str = new String();
		StringBuffer sb = new StringBuffer();
		// 배열을 만들고 문자를 넣는 방식으로 작동한다
		
		System.out.println(str.length()); // 0
		System.out.println(sb.length());  // 0
		System.out.println(sb.capacity()); // 16
		// Stringbuffer의 공간을 나타냄
		
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
		System.out.println("cap: " + sb3.capacity()); //(지정된) 5
		System.out.println("sb3: " + sb3); 
		
		sb3.append("Apple");
		
		System.out.println("---Apple추가---");
		System.out.println("len: " + sb3.length());   // 5
		System.out.println("cap: " + sb3.capacity()); //(가득참) 5
		System.out.println("sb3: " + sb3); 
		
		sb3.append("Banana");
		
		System.out.println("---Banana추가---");
		System.out.println("len: " + sb3.length());   // 11
		System.out.println("cap: " + sb3.capacity()); // (넘침)   (기존 capaticy + 1) X 2 = 12
													  // (더 넘침) 넘치는만큼 용량을 늘림 
		System.out.println("sb3: " + sb3); 
		
		
		System.out.println("-----insert()-----");
		// 5번째인덱스(5 offset)에 "Orange" 넣고 출력
		System.out.println(sb2.insert(5, "Orange"));
				
		System.out.println("-----deleteCharAt()-----");
		// 3번째 인덱스 삭제하고 출력
		System.out.println(sb2.deleteCharAt(3));
		
		System.out.println("-----delete()-----");
		// delete(0, 3) 호출 후 출력
		System.out.println(sb2.delete(0, 3));
	
		System.out.println("-----substring()-----");
		// substring(1,7) 호출
//		StringBuffer sbsub=(StringBuffer) sb2.substring(1, 7);

		// length, capacity 확인
//		System.out.println("length: " + sbsub.length());
//		System.out.println("capacity: " + sbsub.capacity());
		
		// sb출력
		System.out.println(sb2.substring(1, 7));
		// substring(1,7) 결과 출력
		
		System.out.println("-----trimToSize()-----");
		// trimToSize() 호출
		sb2.trimToSize();

		// length, capacity 확인
		System.out.println("length: " + sb2.length());
		System.out.println("capacity: " + sb2.capacity());

		System.out.println("-----reverse()-----");
		// reverse() 호출 후 결과 확인
		System.out.println(sb2.reverse());
	
	}

}
