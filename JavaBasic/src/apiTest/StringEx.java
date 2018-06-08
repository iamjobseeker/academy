package apiTest;

public class StringEx {
	
	public static void main(String[] args) {
		
		String str = "Hello Java";
		//	String str = new String("Hello Java");
		// 같은 의미이다	
		
		System.out.println("---length()---");
		System.out.println("str의 길이: " + str.length());
		
		System.out.println("\n---toUpperCase()");
		String strup = str.toUpperCase();
		System.out.println("toUpperCase(): " + strup);
		
		System.out.println("\n---quiz---");
		//1
		String strlow = strup.toLowerCase();
		System.out.println("1. toLowerCase(): " + strlow);
		//2
		char ch = str.charAt(6);
		System.out.println("2. charAt(): "+ ch);
		//3
		String strhi = str.concat(", HIHIHI");
		System.out.println("3. contcat(): " + strhi);
		//4
		String strx = str.replace('l', 'X');
		System.out.println("4. replace(): " + strx);
		
		String strava = str.replace("ava", "AVA");
		System.out.println("4-1. replace(): " + strava);
		//5
		String strsub = str.substring(6, 8);
		System.out.println("5. substring(): "+ strsub);
		//6
		boolean strcon = str.contains("Java");
		System.out.println("6. contains(): "+ strcon);
		
		System.out.println("---trim()---");
		String trim = "  AABASDF   12312 324   ";
		System.out.println(trim.trim());
		
		System.out.println("---split()---");
		// 문자열을 구분자 기준으로 자르는 메소드
		String splitdata = "1,2,3,4,5";
		
		String [] splitted = splitdata.split(",");
		
		for(String s: splitted) {
			System.out.print(s+"  ");
		}
		
		System.out.println("\n---getBytes()---");
		
		// String은 CharSequence의 자식배열
		
		// char[] 
		
		byte[] bytes = str.getBytes();
		System.out.println(bytes[0]);
		System.out.println(bytes[1]);
		System.out.println(bytes[2]);
		System.out.println(bytes[3]);
		
		// 스트림
		// I/O
		
	} 

}
