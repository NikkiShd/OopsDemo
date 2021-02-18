abstract class AbstractAnimal{
	abstract void makeSound();
	public void eat() {
		System.out.println("I can eat.");
	}
}
class DogDemo extends AbstractAnimal{
	public void makeSound() {
		System.out.println("Bark Bark");
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		DogDemo d1=new DogDemo();
		d1.makeSound();
		d1.eat();

	}

}
