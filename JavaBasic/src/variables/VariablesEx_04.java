package variables;

public class VariablesEx_04 {
	
	public static void main(String[] args) {
		
		//실수형 데이터
		System.out.println(123);   // int형
		System.out.println(3.14);  // double형
		System.out.println(3.14f); // float형
		
		float f = 3.14f;   //double데이터를 float변수에 저장 불가
		double d = 3.14f;  //float데이터를 double변수에 저장 (자동형변환, type casting)
		System.out.println(f);
		System.out.println(d);
		
	}

}
