package exception;

public class ExceptionEx_02_try_Basic {
	public static void main(String[] args) {

		int [] arr = new int [3];

		try {
				for(int i=0; true; i++) {
					arr[i]=i+1; 
					System.out.println(arr[i]);
				}
				// ���ܰ� �߻��� try�� �ߴ��ϰ� catch�� ����Ѵ�
				// ExceptionŬ�������� ArrayIndexOutofBounds�� ���� ������ e�� �����Ѵ�
				// Exception��� ArrayIndexOutofBoundsException�̶�� ��� ��
			} catch (Exception e) {
				System.out.println("+ + + �ε��� ��� + + + ");
				
				// �������� ��� �޼ҵ�
//				e.printStackTrace();
			}
			// ���ܹ߻��ص� ���α׷��� �ߴܵ��� �����Ƿ� ��µȴ�
			System.out.println("���α׷� ����");
	}

}
