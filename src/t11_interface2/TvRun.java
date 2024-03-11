package t11_interface2;

public class TvRun {
	public static void main(String[] args) {
		Tv audio = new Tv();
		
		System.out.println("TV 최대 볼륨 : "+audio.MAX_VOLUME);
		System.out.println("TV 최소 볼륨 : "+audio.MIN_VOLUME);
		System.out.println();
		
		audio.switchOn();
		audio.remoteName("TV");
		audio.switchOff();
	}
}
