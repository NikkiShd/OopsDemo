
public class Calculate {
     void sum() {
    	 System.out.println("Method Overloading");
     }
     void sum(int a, int b) {
    	 System.out.println("sum is"+(a+b));
     }
     void sum(float a,float b) {
    	 System.out.println("sum is"+(a+b));
     }
     void sum(String a, String b) {
    	 System.out.println("Sum is :"+(a+b));
     }
	public static void main(String[] args) {
		Calculate obj=new Calculate();
		obj.sum();
		obj.sum(1, 5);
		obj.sum(1.5f, 5.9f);
		obj.sum("hello","world");

	}

}
