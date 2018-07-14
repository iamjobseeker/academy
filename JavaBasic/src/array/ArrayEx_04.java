package array;

public class ArrayEx_04 {
	
	public static void main(String[] args) {
		
		// 문자열 (String)
		// 문자배열
		// char[] = ch_arr;
		
		String str = "Apple";
		// 'A' 'p' 'p' 'l' 'e'
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(4));
		
		// 문자열 길이
		System.out.println("문자열 길이: " +str.length());
		
		char[] c_arr = str.toCharArray();
		System.out.println(c_arr);
		System.out.println("길이: "+c_arr.length);
		
		
		
	}

}
