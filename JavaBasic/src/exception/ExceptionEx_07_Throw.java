package exception;

import java.io.IOException;

class ThrowEx {
	
	// str==null이면 NullPointerException 발생된다
	public void print(String str, int cnt) {
		
		if(str == null) throw new NullPointerException();
		
		for(int i=0; i<cnt; i++) {
			System.out.println(str);
		}
	}
}

public class ExceptionEx_07_Throw {
	public static void main(String[] args) { 
		
		ThrowEx thr = new ThrowEx();
		
		String str = null;
		
		try {
			thr.print(str, 3);
		} catch (NullPointerException e) {
			System.out.println("null이 문자열로 입력되었음");
		}
		
		System.out.println("프로그램 정상 종료");
		

		
	}

}
