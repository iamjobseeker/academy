package variables;

public class VariablesEx_05 {
	
	public static void main(String[] args) {
		
		// string
		// 참조형 타입
		// 문자열을 다룰 수 있게 해주는 클래스
		String name;
		name="Alice";
		System.out.println(name);
		System.out.println("이름: "+name);
		
		int age =22;
		System.out.println("나이: "+age);		
		
		String fruit;
		int price;
		int num;
		fruit="딸기";
		price=2000;
		num=10;
		System.out.println(fruit+", "+price+"원, "+num+"개");
		System.out.printf("%s, %d원, %d개%n", fruit, price, num);
		System.out.printf("나는 %d원짜리 %s를 좋아해.%n", price, fruit);
	
		
	}

}
