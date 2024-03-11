package t11_interface1;

public class Busan implements Test1 {
	int min;

	@Override
	public void data() {
		System.out.println("이곳은 Busan클래스의 data메소드 입니다.");
	}

	@Override
	public void data1(int su) {
		if(su < MIN) min = su;
		else min = MIN;
		System.out.println("최솟값 : "+min);
	}

	@Override
	public void data2() {
		System.out.println("이곳은 Busan클래스의 data2메소드 입니다.");
	}
}
