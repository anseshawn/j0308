package t11_interface1;
//인터페이스는 implements
public class Seoul implements Test1 {
	int max;

	@Override
	public void data() {
		System.out.println("이곳은 Seoul클래스의 data메소드");
	}

	@Override
	public void data2() {
		System.out.println("이곳은 Seoul클래스의 data2메소드");		
	}

	@Override
	public void data1(int su) {
		if(su > MAX) max = su;
		else max = MAX;
		System.out.println("최댓값 : "+max);
	}

}
