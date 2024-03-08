package t10_abstract2;

public class Run {
	public static void main(String[] args) {
		//Animal animal = new Animal();
		
		Animal aniDog = new Dog();
		aniDog.cry();
		System.out.println();
		
		Animal aniCat = new Cat();
		aniCat.cry();
		System.out.println();
	}
}
