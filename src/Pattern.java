import java.util.Scanner;
public class Pattern {
 public static void main(String [] args){
	 Scanner sc=new Scanner(System.in);
	 int n;
	
	 
	 for(n=1;n<=9;n++) {
		if(n%2!=0) {
			int a=n;
			
			 for(int i=1;i<=a;i++) {
				 System.out.print(" ");
				  System.out.print("*");
			 }
			 System.out.println();
		}
		 
		 
	 }
	 for(n=7;n>=1;n--) {
		 if(n%2!=0) {
			 int b=n;
			 for(int i=1;i<=b;i++) {
				 System.out.print(" ");
				  System.out.print("*");
		 }
			 System.out.println();
	 }
 }
}
}
