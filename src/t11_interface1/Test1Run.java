package t11_interface1;

public class Test1Run {
	public static void main(String[] args) {
		//new Test1();
		// 1. 인터페이스는 생성해서 사용할 수 없다. (예외: 익명객체)
		
//		Seoul seoul = new Seoul();
//		Busan busan = new Busan(); //2. 인터페이스를 구현한 객체를 생성해서 사용해야 한다
		
		Test1 seoul = new Seoul();
		Test1 busan = new Busan();
		//3. 인터페이스를 구현한 객체는 인터페이스를 상속했기 때문에 인터페이스 타입으로 지정해서 사용할 수 있다.
		
		
	}
}
