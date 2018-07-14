package array;

public class ArrayQuiz_02 {

	public static void main(String[] args) {

		int [] arr= {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};
		int [] i_arr=new int[10];

		for(int i=0; i<arr.length; i++) {
			i_arr[i]=arr[arr.length-(i+1)];
			System.out.print(i_arr[i]+"  ");
		}

		int ehap=0;
		int ohap=0;

		for(int i=0; i<arr.length; i++) {
			if(i%2==0) {
				ehap+=arr[i];
			}
			else {
				ohap+=arr[i];
			}
		}

		System.out.println("\n-----------------------------------");

		System.out.println("짝수번째 인덱스의 합: "+ehap);
		System.out.println("홀수번째 인덱스의 합: "+ohap);	
		System.out.println("답: "+(ehap-ohap));

		System.out.println("-----------------------------------");
		

		int [] rank_arr= new int[10];
		for (int i=0; i<rank_arr.length; i++) {
			rank_arr[i]=1;
		}

		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					rank_arr[i]+=1;
				}
			}
			System.out.print(rank_arr[i]+"  ");
		}

		System.out.println("\n-----------------------------------");
		// 순위가 중복된 인덱스를 가진 요소들
		
		int [] over_arr = new int [10]; // arr.length
		int [] ret_arr = new int [10];
		
		int std; // 중복검사 기준값
		
		for(int i=0; i<rank_arr.length; i++) {
			for(int j=0; j<rank_arr.length; j++) {
				if(rank_arr[i]==rank_arr[j]) {
					int k = 0;
					over_arr[k]=arr[i];
					k++;
				}
			}
			System.out.print(over_arr[i]);
		}
	
		
		
		
		
		
		
	}
}

