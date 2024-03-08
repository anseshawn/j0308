package t2_inheritance;

public class Run {
	public static void main(String[] args) {
		System.out.println("1. 이곳은 Run클래스입니다.");
		
		//Aa클래스도 같이 생성됨.
		//부모클래스가 먼저 생성된 후 자식클래스가 생성됨
		Bb bb1 = new Bb();
		bb1.areaRec(10, 20);
		bb1.areaPoly(1, 2, 3);
		System.out.println();
		
		//같은 클래스에 있으면 기본생성자든 사용자 정의 생성자든 메소드는 모두 이용 가능함
		Bb bb2 = new Bb(10);
		bb2.areaPoly(2, 3, 4);
		System.out.println();
		
		Bb bb3 = new Bb(10, 20, 30);
		System.out.println();
		
		System.out.println("2. 이곳은 Run클래스입니다.");
	}
}
