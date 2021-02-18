class Animal{
String name;
public void eat() {
	System.out.println("");
}
}

class Dog extends Animal{
	
	public void display() {
		System.out.println("");
	}
}


 class AnimalTest {
public static void main(String[] args) {
		Dog labrador=new Dog();
	
		labrador.name="Rohu";
		labrador.display();
		labrador.eat();
	}
}


