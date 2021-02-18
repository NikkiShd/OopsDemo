
public class This {
           int instVar;
           This(int instVar){
        	   this.instVar=instVar;
        	   System.out.println("this reference =" +this);
           }
	public static void main(String[] args) {
		This obj=new This(8);
		System.out.println("object reference" + obj);
	
	}

}
