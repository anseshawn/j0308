package t4_override;

public class Cc extends Aa{
	
	//원넓이 override
//	public void areaCircle(int r) {
//		double area = r * r * Math.PI;
//		System.out.println("반지름 "+r+"인 원넓이는? "+area);
//	}
	
	//@Override //: override 어노테이션
	
	@Override
	public void areaCircle(int r) {
		double area = r * r * Math.PI;
		System.out.println("반지름 "+r+"인 원넓이는? "+area);
	}
	
	public void areaCircle2(int r) {
//		double area = r * r * Math.PI;
//		System.out.println("반지름 "+r+"인 원넓이는? "+area);
		super.areaCircle(r);
	}
	
}
