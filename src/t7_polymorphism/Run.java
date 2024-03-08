package t7_polymorphism;

//다운캐스팅(Down Casting)
public class Run {
	public static void main(String[] args) {
		Aa aa = new Aa();
		System.out.println();
		
		//Bb ab = (Bb)aa; //강제캐스팅 - 실행오류
		//부모객체를 자식객체로 바로 down casting 할 수는 없다.
		
		
		// Down Casting은 자식객체가 부모객체로 Up Casting하였을 경우에만
		// 다시 Down Casting할 수 있다.
		
		Aa ba = new Bb(); //Up Casting
		Bb bb = (Bb)ba; //Down Casting
		System.out.println();
		
		Bb db = new Dd();
		Dd dd = (Dd)db;
		System.out.println();
		
//		Cc ec = new Ee();
//		Ee ee = (Ee)ec;
//		System.out.println();
//		
//		Aa eca = ec;
//		Cc ecac= (Cc)eca;
		
		Aa ea = new Ee();
		Ee eae = (Ee)ea;
		
		Cc eac = (Cc)ea;
	}
}
