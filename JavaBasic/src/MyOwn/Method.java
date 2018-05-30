package MyOwn;

public class Method {

	   // 메소드는 함수와 비슷하다고 생각하면 된다.
	   // 특정값을 입력하면 메소드의 로직에 의해 결과를 산출해준다.
	            //int[]형의 결과를 반환해주는 메소드라는 의미
	   public static int[] calculate(int times) {

	      int[] result = new int[9];
	      for(int i=0; i<result.length; i++) {
	         result[i]=times*(i+1);
	      }
	      return result;
	   }

	   public static void prt(int[] result) {

	      for(int i=0; i<result.length; i++) {
	         System.out.println(result[i]);
	      }
	   }

	   public static void main(String[] args) {

	      for(int i=2; i<=9; i++) {

	         int[] result=calculate(i);
	         
	         prt(result);
	      }
	   }
	}