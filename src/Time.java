
public class Time {
	int hours;
	int minutes;
	int seconds;
	
	Time(int h, int m, int s){
		hours=h;
		minutes=m;
		seconds=s;
	}
	void add(Time t2, Time t3) {
		this.hours+=t2.hours+t3.hours;
		this.minutes+=t2.minutes+t3.minutes;
		this.seconds+=t2.seconds+t3.seconds;
		
	}
   void display() {
	   System.out.println(this.hours+ ":"+ this.minutes + ":" + this.seconds);
   }
	public static void main(String[] args) {
		
   Time t1=new Time(10,45,56);
   Time t2=new Time(15,35,45);
   Time t3=new Time(9,67,34);
   t1.add(t2, t3);
   System.out.println("The addition of time");
   t1.display();
	}

}
