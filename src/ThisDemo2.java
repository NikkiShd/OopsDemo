
public class ThisDemo2 {
	
	public void getName(){
		System.out.println("Java programming");
		
	}
	public void display() {
		this.getName();
	}

	public static void main(String[] args) {
		ThisDemo2 obj=new ThisDemo2();
		obj.display();

	}

}
