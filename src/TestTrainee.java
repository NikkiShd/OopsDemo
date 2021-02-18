import java.util.Scanner;
class Trainee{
 int tId; //defining properties
 String tName;
 String technology;
 float salary,stipend;
 
 //defining methods
 void input() {
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter Id, Name, technology and salary of the Trainee");
	 tId=s.nextInt();
	 tName=s.next();
	 technology=s.next();
	 salary=s.nextFloat();
 }
  float calculate() {
	 stipend=salary-200;
	 return stipend;
 }
 void display() {
	 System.out.println("*****Training Details*****");
	 System.out.println("Training Id "+tId);
	 System.out.println("Trainee Name "+tName);
	 System.out.println("Technology "+technology);
	 System.out.println("Salary "+salary);
 }
 
}

public class TestTrainee {

	public static void main(String[] args) {
		
        Trainee obj1=new Trainee();
        Trainee obj2=new Trainee();
        
        obj1.input();
        obj1.display();
       float s1= obj1.calculate();
       System.out.println("Stipend "+s1);
        obj2.input();
        obj2.display();
       float s2= obj2.calculate();
       System.out.println("Stipend "+s2);
      
	}

}
