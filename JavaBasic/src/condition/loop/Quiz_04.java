package condition.loop;

public class Quiz_04 {

	public static void main(String[] args) {

		int hap=0;

		for(int i=1;i<=1000;i++) {
			if(i%4==1 && i%6==1) {
				hap+=i;
				System.out.println(i);
			}
		}

		System.out.println("гую╨ "+hap);

	}

}
 