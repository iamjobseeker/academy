package operator;

import java.util.Scanner;

public class OperatorQuiz_01 {

	public static void main(String[] args) {
		
		Scanner exam=new Scanner(System.in);
		
		int kor;
		int eng;
		int mat;
		
		int sum;
		double avg;
		
// 1. 입력 파트
		
		System.out.println("Korean score: ");
		kor=exam.nextInt();
		System.out.println("English score: ");
		eng=exam.nextInt();	
		System.out.println("Math score: ");
		mat=exam.nextInt();		
		System.out.println("Korean: " + kor + ", English: " + eng + 
				", Math: " + mat);
		
		// 3과목 입력 TEST - 테스트 완료 
		
// 2. 연산 파트	
		
	 	sum = kor+eng+mat;
		avg = (double)sum/3; // (double/int)는 에서 int는 double로 자동 형변환

// 3. 출력 파트
		
		System.out.println("total: " + sum);
		System.out.println("average: " + avg);
//		avg = Double.parseDouble(String.format("%.2f", avg));
//		System.out.println("hundredth: "+avg);
 
 // 3-1. 소수점 둘째짜리 평균점수 출력-1
//		System.out.println(Math.round(avg*100)/(double)100);
		
 // 3-2. 소수점 둘째짜리 평균점수 출력-2
		System.out.printf("hundredth: %.2f", avg);
		// printf - print formatted
		// 서식문자를 이용한 문자열 출력
		// 서식문자: %s(문자열) %d(10진수) %c(문자) %f(실수)
	}

}
