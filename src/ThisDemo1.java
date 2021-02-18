
public class ThisDemo1 {

	ThisDemo1(){
		this("Java Flair");//accessing single argument
	}
	
	ThisDemo1(String str){
		System.out.println(str);
	}
	public static void main(String[] args) {
		
ThisDemo1 d=new ThisDemo1();
	}

}
