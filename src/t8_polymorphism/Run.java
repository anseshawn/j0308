package t8_polymorphism;

public class Run {
	public static void main(String[] args) {
		Bb bb = new Bb();
		System.out.println();
		
		System.out.println("bb.su : " + bb.su);
		bb.modBb();
		bb.modAa();
		System.out.println();
		
		/* ------------Up Casting------------- */
		
		Aa ba = new Bb();
		ba.modAa();
		System.out.println();
		
		/* -----------Down Casting------------ */
		//부모로 Up Casting이 되어 있을 경우에만 자신으로 Down Casting 할 수 있다.
		Bb bab = (Bb)ba;
		bab.modAa();
		System.out.println();
		
		/* ----------------------------------- */
		
		Aa ca = new Cc();
		ca.modAa();
		ca.modCc();
		System.out.println();
		ca.modHH(12, 25);
		
		
	}
	// 상속받은 경우: 자신이랑 부모객체까지 나옴
	// Up -> Down 한 경우: 자신에게 있는 것만 나옴
}
