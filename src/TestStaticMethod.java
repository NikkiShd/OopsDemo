class Student200{
	private int rollno;
	private String name;
	static String college="BMS";
	
	static void changeCollege() {
		college="RVCE" ;
		
	}
	public Student200(int r,String n){
		rollno=r;
		name=n;
	}
	public void display() {
		System.out.println(rollno+" "+name+" "+college);
	}
}
public class TestStaticMethod {

	public static void main(String[] args) {
		Student200.changeCollege();
		Student200 s1=new Student200(101,"Nikita");
		Student200 s2=new Student200(102,"Mike");
		Student200 s3=new Student200(103,"John");
     s1.display();
     s2.display();
     s3.display();
	}
}


