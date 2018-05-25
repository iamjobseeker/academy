package condition.loop;

public class EtcEx_02 {

	public static void main(String[] args) {

		// labeled break
		// 		레이블 브레이크

		Apple:
			for(int i=0; i<10; i++) {
				for(int j=0; j<10; j++) {

					if(j==5) break Apple;

					System.out.println(i+":"+j);
				}
			}

	}

}
