package singleton;

public class SingletonEx {
	public static void main(String[] args) {

		Singleton_01 s;

		//	원래 사용하던 방식
		//	s1=new Singleton_01(); 

		//	싱글톤 방식
		// getInstance()로 객체를 받아서 사용가능 
		s=Singleton_01.getInstance(); 
		System.out.println(s.data); // singleton01의 데이터를 받아옴 
		
		Singleton_01 ss = Singleton_01.getInstance();
		System.out.println(ss.data); // singleton01의 데이터를 받아옴 
									 // 위와 같은 공간을 참조하고 있음 
		
//		Singleton_01 sss = new Singleton_01(); // private 외부 객체생성이 막혔기 때문에 생성 불가능해짐		
		Singleton_01 ssss = Singleton_01.getInstance(); // 이것은 계속해서 사용 가능 
		
		System.out.println(s); // singleton.Singleton_01@7852e922
		System.out.println(ss); // singleton.Singleton_01@7852e922
		// 같은 참조값을 가짐, 같은 인스턴스임을 알 수 있다 
		
	}
}
