package variables;

public class VariablesEx_06 {

	public static void main(String[] args) {
		String id="jinkyoung";  //이름
		int age=26;				//나이
		char gender='여';		//성별
		double height=162.5;	//키
		
		System.out.println("이름: "+id);
		System.out.println("나이: "+age);
		System.out.println("성별: "+gender);
		System.out.println("키: "+height);	
		System.out.printf("이름: %s%n 나이: %d%n 성별: %c%n 키: %f%n", id, age, gender, height);		
		
	}

}
