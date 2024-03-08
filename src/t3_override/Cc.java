package t3_override;

public class Cc extends Aa{
	//원넓이 override
	//overriding: 부모메소드를 재정의해서 사용하는 것
//	public void areaCircle(int r) {
//		double area = r * r * Math.PI;
//		System.out.println("반지름 "+r+"인 원넓이는? "+area);
//	}
	
	//내용을 수정하지 않아도 부모클래스에서 메소드 복사해서 가져오면 override
//	public void areaCircle(int r) {
//		double area = r * r * 3.14;
//		System.out.println("반지름 "+r+"인 원넓이는? "+area);
//	}
	
	//overloading: 선언부(매개변수)만 변경, 리턴타입 관계없음
	//overriding: 리턴타입 관계있음
	
//	public int areaCircle(int r) { //-> 복사해온 메소드가 살아있을때: overloading위반으로 에러
//		double area = r * r * 3.14;
//		System.out.println("반지름 "+r+"인 원넓이는? "+area);
//		return area;
//	}
	//복사해온 메소드가 없을때: overriding 위반 -> 리턴타입이 다름
	
	//접근제한자는 변경해도 관계가 없으나 더 강하게 override할 수는 없음
	//예: public -> private(x) , default -> public(o)
	
	public void areaCircle2(int r) { //override아님 (선언부가 다르다)
		double area = r * r * 3.14;
		System.out.println("반지름 "+r+"인 원넓이는? "+area);
	}
	
	
}
