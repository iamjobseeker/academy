package array;

public class ArrayEx_04 {
	
	public static void main(String[] args) {
		
		// ���ڿ� (String)
		// ���ڹ迭
		// char[] = ch_arr;
		
		String str = "Apple";
		// 'A' 'p' 'p' 'l' 'e'
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(4));
		
		// ���ڿ� ����
		System.out.println("���ڿ� ����: " +str.length());
		
		char[] c_arr = str.toCharArray();
		System.out.println(c_arr);
		System.out.println("����: "+c_arr.length);
		
		
		
	}

}
