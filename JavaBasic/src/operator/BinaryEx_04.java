package operator;
//논리 연산자
//논리값(true/false)의 논리식 결과를 반환하는 연산자
//논리값의 관계를 따지는 연산
public class BinaryEx_04 {
	
	public static void main(String[] args) {
		
		boolean a=true;
		boolean b=false;
		System.out.println("AND: "+ (a && b));
		System.out.println("OR: " + (a || b));
		
		//관계연산의 결과를 조합할 때 사용
		int num = 57;
		System.out.println( (num>=1) && (num <= 100));		
		System.out.println(!((num>=1) && (num<=100)));
		
	}

}
