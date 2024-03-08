package t2_inheritance;

public class Bb extends Aa{
	//item1 = 100; //에러. 필드는 변수를 정의만 한다 어떤 실행도 하지 않음
	int su = item1; //상속받은 변수를 쓸수는 있음(선언하지 않아도 사용 가능)
	//super() : 부모클래스의 생성자를 의미, 아무것도 부르지 않으면 기본생성자가 호출됨
	
	public Bb() {
		System.out.println("이곳은 Bb클래스의 기본생성자");
	}
	
	public Bb(int su) {
		super(10);
		System.out.println("이곳은 Bb클래스의 사용자 정의 생성자1, su = "+su);
		//super(10); 에러. 자식클래스 실행 후 부모클래스를 실행할 수 없음
		//super()는 무조건 생성자의 첫번째에 와야 함
	}
	
	public Bb(int item1, int x, int y) {
		//Aa에 접근하려면 Aa생성자에서 사용된 변수를 받는 Bb생성자를 따로 만들어줘야함
		super(item1, x, y);
	}
	
	//사다리꼴 면적
	public void areaPoly(int x, int y, int z) {
		int area = (x + y) * z / 2;
		System.out.println("사다리꼴의 면적(윗변: "+x+", 아랫변: "+y+", 높이: "+z+"): "+area);
	}
}
