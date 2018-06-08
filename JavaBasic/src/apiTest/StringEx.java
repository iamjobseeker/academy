package apiTest;

public class StringEx {
	
	public static void main(String[] args) {
		
		String str = "Hello Java";
		//	String str = new String("Hello Java");
		// ���� �ǹ��̴�	
		
		System.out.println("---length()---");
		System.out.println("str�� ����: " + str.length());
		
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
		// ���ڿ��� ������ �������� �ڸ��� �޼ҵ�
		String splitdata = "1,2,3,4,5";
		
		String [] splitted = splitdata.split(",");
		
		for(String s: splitted) {
			System.out.print(s+"  ");
		}
		
		System.out.println("\n---getBytes()---");
		
		// String�� CharSequence�� �ڽĹ迭
		
		// char[] 
		
		byte[] bytes = str.getBytes();
		System.out.println(bytes[0]);
		System.out.println(bytes[1]);
		System.out.println(bytes[2]);
		System.out.println(bytes[3]);
		
		// ��Ʈ��
		// I/O
		
	} 

}
