package t9_instanceof;

public class Run {
	public static void main(String[] args) {
		
		Aa aa = new Aa();	//Aa객체 -> 결과: 불가
		
		//Aa aa = new Bb();					-> 결과: 성공
		
		//부모타입에서 자식타입으로 Down Casting 하려면
		//자식타입에서 부모타입으로 Up Casting 된 적이 있어야함
		
		//그러나 확인이 어려우므로 수식을 넣어서 확인해줄 것
		// (객체명) instanceof (타입명)
		
		if(aa instanceof Bb) {
			Bb bb = (Bb)aa;
			System.out.println("Down Casting 성공");
		}
		else {
			System.out.println("Down Casting 불가...");
		}
	}
}
