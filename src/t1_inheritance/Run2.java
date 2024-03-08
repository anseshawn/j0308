package t1_inheritance;

//최종적으로 필요한 자식클래스만 남기면 편하다
public class Run2 {
	public static void main(String[] args) {
		
		D d = new D();
		System.out.print("1. ");
		d.areaRec(30, 20);
		d.areaPoly(10, 30, 5);
	}
}
