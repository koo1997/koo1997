package tj4;

public class AnEx {

	public static void main(String[] args) {
		
		Dog dog = new Dog("시추", "빨강", 50);
		System.out.println(dog.kind);
		System.out.println(dog.age);
		System.out.println(dog.color);
		dog.on();
		dog.off();
		dog.showAge();
		
	}

}
