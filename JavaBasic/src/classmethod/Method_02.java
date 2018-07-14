package classmethod;

public class Method_02 {
	
	public static void r_itg() {
		for(int i=1; i<101; i++) {
			System.out.print(i+" ");
		}
	}
	
	public static void r_apple(int num) {
		for(int i=0; i<num; i++) {
			System.out.print((i+1)+"-Apple ");
		}
	}
	
	public static void r_two(int num, String str) {
		for(int i=0; i<num; i++) {
			System.out.print((i+1)+"-"+str+" ");
		}
	}
	
	public static void main(String[] args) {
		r_two(3,"you");
	}	
}
