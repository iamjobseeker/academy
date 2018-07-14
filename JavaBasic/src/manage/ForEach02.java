package manage;

class Data {
	int num;
} 

public class ForEach02 {

	public static void main(String[] args) {
		

		Data[] arr = new Data[3]; 
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		arr[0] = new Data();
		arr[1] = new Data();
		arr[2] = new Data();
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

//		for(Data d : arr) {
//			System.out.println(d.num);
//		}
//
//		for(Data d : arr) {
//			d.num = 111;
//		}
//
//		System.out.println("--------");
//		for(Data d : arr) {
//			System.out.println(d.num);
//		}	

	}

}
