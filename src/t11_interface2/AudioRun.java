package t11_interface2;

public class AudioRun {
	public static void main(String[] args) {
		//추상클래스, 인터페이스는 생성하지 못한다 구현클래스를 생성하여 이용해야함
		Audio audio = new Audio();
		
		System.out.println("Audio 최대 볼륨 : "+audio.MAX_VOLUME);
		System.out.println("Audio 최소 볼륨 : "+audio.MIN_VOLUME);
		System.out.println();
		
		audio.switchOn();
		audio.remoteName("Audio");
		audio.switchOff();
	}
}
