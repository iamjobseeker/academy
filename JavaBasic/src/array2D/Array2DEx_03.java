package array2D;

import java.util.Scanner;

public class Array2DEx_03 {

	public static void main(String[] args) {

		// 1~3학년
		// 2개반
		// 4명
		// 3과목 점수
		//		int[][][][] score = new int [3][2][4][3];
		//		
		//		int[][][] s1 = new int [2][4][3]; // 1학년
		//		int[][][] s2 = new int [2][4][3]; // 2학년
		//		int[][][] s3 = new int [2][4][3]; // 3학년
		//		
		//		// 2명의 국어, 영어, 수학 점수를 저장하는 배열
		//		int[][] sc = new int[2][3];
		//		
		//		int[] sum; // 2명의 총점 배열
		//		double[] avg; // 2명의 평균 배열


		// 0. 점수 입력

		// 1. 총점 계산

		// 2. 평균 계산

		// 3. 출력
		// ex) 번호 국어 영어 수학 총점 평균
		//	   1번   ?   ?  ?  ?	 ?
		//	   2번   ?   ?  ?  ?	 ?

		int[][] sc=new int [2][5];

		String[] subject= {"국어", "영어", "수학"};

		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				int num=(int) (Math.floor(Math.random() * 100) + 1);
				System.out.println((i+1)+"번째 학생의 "+subject[j]+"과목 점수: "+num);
				sc[i][j] = num;  // 배열을 new로 정의하면 0으로 자동초기화
				sc[i][3] += num;
			}
			System.out.println((i+1)+"번째 학생의 총점은: "+sc[i][3]+"점");
			sc[i][4]=sc[i][3]/3;
			System.out.println((i+1)+"번째 학생의 평균은: "+sc[i][4]+"점");
			System.out.println("-------------------------------------------");
		}

		System.out.print("번호\t국어\t영어\t수학\t총점\t평균\n");
		for(int i=0; i<2; i++) {
			System.out.print(i+1+"\t");
			for(int j=0; j<5; j++) {
				System.out.print(sc[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
