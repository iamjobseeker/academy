package condition.loop;

public class ForEx_03 {

	public static void main(String[] args) {

		for(int num=10; num>=1; num--) {
			System.out.print(num);
		}

		//반복횟수: 10
		//반복구간: 10~1

		System.out.println("\n---------------------");

		for (int i=0; i<10; i+=2) {
			System.out.print(i+",");
		}

		//반복횟수: 5
		//반복구간: 0~8

	}

}
