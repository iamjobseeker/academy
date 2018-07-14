package memberField;

public class MemberField_01 {

	// 중요한 정보를 담고있는 값을 숨김
	// 인스턴스 변수
	private int num = 100;

	// 외부에서 가져올 수 있게 해줌
	// Getter Method
	public int getNum() {
		return num;
	}

	// 외부에서 변경할 수 있게 해줌
	// Setter Method
	public void setNum(int num) {
		this.num = num;
	}
	
}
