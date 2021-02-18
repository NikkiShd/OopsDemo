
public class StringBufferDemo1 {
public static void main(String[] args) {
	StringBuffer str=new StringBuffer("JamesGosling");
	int l=str.length();
	System.out.println("The length of String is :"+l);
	System.out.println("The capacity of string is :"+str.capacity());//28----12+16
	System.out.println("The Substring : "+str.substring(0,4));//start index to length-1
   str.delete(2, 5);
   System.out.println(str);
   str.replace(0, 5, "Java");
   System.out.println(str);
	System.out.println("The reversed string :"+str.reverse());
	System.out.println("The Substring : "+str.substring(0,4));//start index to length-1
}
}