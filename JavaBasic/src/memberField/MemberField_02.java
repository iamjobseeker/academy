package memberField;

public class MemberField_02 {
	
	// Ŭ��������, ��������, static����
	// Ŭ������ �ϳ��� ������ִ� ���� 
	public static String city = "Seoul";
	
	// Ŭ���� ������ Getter
	public String getCity() {
		return city;
	}
	
	// Ŭ���� ������ Setter
	// static�� �ٿ��ָ� class �޼ҵ尡 �ȴ�
	// this: �ڱⰴü ����
	public static void setCity(String c) {
		MemberField_02.city = c;
	}
	
}
