package t5_protected.mbc;

import t5_protected.kbs.Aa;
//같은 패키지에 없는 클래스를 상속하려면 import 먼저 걸어줘야 함
public class Bb extends Aa{
	public int a2 = 10;
	protected int b2 = 20;
	int c2 = 30;
	private int d2 = 40;
	
	public void modA2() {
		System.out.println("이곳은 Bb클래스의 modA메소드 입니다.");
	}

	protected void modB2() {
		System.out.println("이곳은 Bb클래스의 modB메소드 입니다.");
	}

	void modC2() {
		System.out.println("이곳은 Bb클래스의 modC메소드 입니다.");
	}

	private void modD2() {
		System.out.println("이곳은 Bb클래스의 modD메소드 입니다.");
	}
	
	@Override
	public void test() {
		modC2();
		a = 100;
		b = 200;
		//c = 300; 에러. default(다른 패키지에 존재 중)
		//d = 400; 에러. private(다른 클래스)
		int d = getD(); //부모클래스의 d와 관계 없는 변수
		System.out.println("d " + d);
	}
	
}
