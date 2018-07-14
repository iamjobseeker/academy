package innerClass;

interface Anonymous {
	void out();

}

// Ŭ�� �̺�Ʈ������ ���� ����Ѵ�
// �Ź� ������ �޶����� ����
public class AnonymousEx {
	public static void main(String[] args) {

		Anonymous an;
		// �����ڸ� ����� ���� �����Ѵ�
		an = new Anonymous() {
			@Override
			public void out() {
				System.out.println("�͸�ü 1��");
			}
		};
		an.out();

		Anonymous an2 = new Anonymous() {
			@Override
			public void out() {
				System.out.println("�͸�ü 2��");
			}
		};
		an2.out();
		
		new Anonymous() {
			@Override
			public void out() {
				System.out.println("�͸�ü 3��");
			}
		}.out();
	
		// Ŭ������ ���غ���
		class A {
			public void out() {
				System.out.println("Ŭ���� A");
			}
		}
		new A().out();
		
		
		
		
		
	}
}
