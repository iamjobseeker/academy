package singleton;

public class SingletonEx {
	public static void main(String[] args) {

		Singleton_01 s;

		//	���� ����ϴ� ���
		//	s1=new Singleton_01(); 

		//	�̱��� ���
		// getInstance()�� ��ü�� �޾Ƽ� ��밡�� 
		s=Singleton_01.getInstance(); 
		System.out.println(s.data); // singleton01�� �����͸� �޾ƿ� 
		
		Singleton_01 ss = Singleton_01.getInstance();
		System.out.println(ss.data); // singleton01�� �����͸� �޾ƿ� 
									 // ���� ���� ������ �����ϰ� ���� 
		
//		Singleton_01 sss = new Singleton_01(); // private �ܺ� ��ü������ ������ ������ ���� �Ұ�������		
		Singleton_01 ssss = Singleton_01.getInstance(); // �̰��� ����ؼ� ��� ���� 
		
		System.out.println(s); // singleton.Singleton_01@7852e922
		System.out.println(ss); // singleton.Singleton_01@7852e922
		// ���� �������� ����, ���� �ν��Ͻ����� �� �� �ִ� 
		
	}
}
