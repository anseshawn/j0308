package t11_interface1;

public interface Test1 {
	//필드
	// int max = 1000000; //자동으로 static final이 붙어 상수로 처리되기 때문에 대문자가 적합(약속)
	int MAX = 1000000;
	public static final int MIN = 0;
	
	//메소드
	void data();
	void data1(int su);	
	public abstract void data2();
	
	default void data3() { //실행블록을 위해 default로 지정
		//실행할 내용을 포함/생략
		System.out.println("이곳은 data3 메소드(default)");
	};
	
	static void data4() { //static도 실행블록 포함
		//실행할 내용을 포함	
		System.out.println("이곳은 data4 메소드(static)");
	};
	
	//Test1 의 구현객체: Seoul클래스, Busan클래스
}
