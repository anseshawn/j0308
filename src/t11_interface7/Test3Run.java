package t11_interface7;

// 인터페이스-static 연습
interface Aa2	{ //같은 패키지 안에 같은 이름의 클래스가 존재할 수 없다
	
	//정적 멤버 = 객체 생성하지 않음
	static void abc() {
		System.out.println("여기는 Aa2 인터페이스의 정적메소드 abc()이다.");
	}
}

public class Test3Run {
	public static void main(String[] args) {
		// 정적 메소드 호출
		Aa2.abc();
	}
}
