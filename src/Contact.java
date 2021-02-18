
public class Contact {
	
	void createContact(String name, int num) {
		System.out.println("Name :"+" "+name+" "+ "Contact"+" " +num);
	}
	void createContact(String name, int num1, int num2) {
		System.out.println("Name :"+" "+name+" "+ "Contact1"+" " +num1 +" "+ "Contact2"+" " + num2);
	}
	
public static void main(String[] args) {
	Contact c=new Contact();
	c.createContact("Avni", 97356373);
	c.createContact("Akshay", 73837378, 8739389);
}
}
