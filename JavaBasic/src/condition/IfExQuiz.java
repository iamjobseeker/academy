package condition;

import java.util.Scanner;

public class IfExQuiz {

	public static void main(String[] args) {

		int num ;
		Scanner number=new Scanner(System.in);

		System.out.println("input number: ");
		num=number.nextInt();

		if(num>0) {
			System.out.println("is Positive");
		} 
		else if(num==0){
			System.out.println("is Zero");
		}  
		else {
			System.out.println("is Negative");
		}
	}	

}



