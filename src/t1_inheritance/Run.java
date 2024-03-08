package t1_inheritance;

//1번: 지금까지 배운 방법(상속 배우기 전)
//2번: 상속 (B 클래스부터)
public class Run {
	public static void main(String[] args) {
		A a = new A();
		System.out.print("1. ");
		a.areaRec(10, 20); //-> 계산결과 바로 출력
		
		B b = new B(); //상속
		System.out.print("2. ");
		b.areaRec(20, 30);
		
		C c = new C(); //같은 부모클래스에 다른 자식클래스
		System.out.print("3. ");
		c.areaRec(30, 40);
		
		D d = new D();	//자식클래스를 부모클래스로 다시 상속
		System.out.print("4. ");
		d.areaRec(40, 50);
		
		E e = new E();
		System.out.print("5. ");
		e.areaRec(50, 60);
		System.out.println();
		
		b.areaPoly(10, 20, 5);
		d.areaPoly(15, 20, 5);
	}
}
