package condition;

public class SwitchEx_04 {
	
	public static void main(String[] args) {
		
		int score=88;
		char grade = 'F';
		
		switch(score/10) {
		case 10:
		case 9:
			grade='A';
			break;
			
		case 8:
			grade='B';
			break;
			
		case 7:
			grade='C';
			break;	
			
		}	
		System.out.println("grade: " + grade);
		
			
		if (score>=80 && score<=100) grade = 'A';
		
		System.out.println(grade);
		
		
		
		
		
	}

}
