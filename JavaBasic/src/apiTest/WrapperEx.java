package apiTest;

public class WrapperEx {
	
	public static void main(String[] args) {
		
		System.out.println("---�ڽ�---");
		// int -> Integer
		
		int i1 = 10;
		
		Integer iVal1 = new Integer(i1);
		System.out.println(i1 + ", " + iVal1);
		
		Integer iVal2 = new Integer("1234");  // String�� "1234"
		System.out.println(iVal2);  // String���� int�� �ٲ㼭 �������ش�
		
		double d1 = 123.456;
		Double dVal1 = new Double(d1);
		System.out.println("dVal1: " + dVal1);  // ��ü�� ���굵 ����
		
		System.out.println(iVal1 + iVal2);
		
		System.out.println("---��ڽ�---");
		int i2 = iVal1.intValue(); 
		int i3 = iVal2.intValue();
		double d2 = dVal1.doubleValue();
		int i4 = dVal1.intValue();
		
		System.out.println(i4);
		System.out.println(d2);
		
		System.out.println("---���� �ڽ�---");
		//Integer iVal3 = new Integer(55);
		Integer iVal3 = 55;  // ���� �ǹ�
		
		System.out.println("---���� ��ڽ�---");
		int i5 = iVal3; 
		
	}

}
