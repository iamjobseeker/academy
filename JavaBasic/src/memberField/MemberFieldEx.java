package memberField;

public class MemberFieldEx {
	public static void main(String[] args) {
		
		MemberField_01 mf1 = new MemberField_01();
		
		MemberField_02 mf2 = new MemberField_02();
	
		mf1.setNum(11);
//		mf2.getNum(22); 
		
		System.out.println(mf1.getNum());
		
		System.out.println("------------");
		
		MemberField_02 mf3 = new MemberField_02();
		MemberField_02 mf4 = new MemberField_02();
		
		MemberField_02.city = "Busan";
		
		// 객체 변수를 통한 접근
		System.out.println(mf3.city);
		System.out.println(mf4.city);
		
		// 클래스명을 통한 접근도 가능
//		System.out.println(MemberField_02.getCity());
		
//		MemberField_02.method2();
		
		
		
	}

}
