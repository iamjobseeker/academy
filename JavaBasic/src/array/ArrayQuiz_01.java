package array;

public class ArrayQuiz_01 {
	
	public static void main(String[] args) {
					//0,1,2,3,4,5   arr.lengh = 6
		int [] arr = {4,5,11,2,8,0};
		int [] arr2 = new int [6];
		
		System.out.println("---------------");
		for(int i=0; i<arr.length-1; i++) {
			arr[arr.length-1]+=arr[i];
			System.out.println((i+1)+"층의 사는 인원은 ? "+arr[i]);
		}
		
		System.out.println("---------------");
		for(int j=0; j<arr.length; j++) {
			arr2[j]=arr[j]*12000;
			System.out.printf((j+1)+"층의 관리비: %,d원\n", arr2[j]);
//			System.out.println((j+1)+"층의 관리비: "+arr2[j]);
		}
		
		System.out.println();
		System.out.println("건물에 사는 총 인원은 "+arr[arr.length-1]+"명 입니다.");
		System.out.printf("관리비의 총 금액은 %,d원 입니다.", arr2[arr2.length-1]);
//		System.out.println("관리비의 총 금액은 "+arr2[arr2.length-1]+"원 입니다");

	}

}
