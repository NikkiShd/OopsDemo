class Student300
{
	private int rollno;
	private String name;
	static String college="BMS";
	
	public static void changeCollege()
	{
		college="SNIST";
		
	}
	public Student300(int r,String n)
	{
		rollno=r;
		name=n;
	}
	public void display()
	{
		System.out.println(rollno+" "+name+"" +college);
	}
	




	public static void main(String[] args)
	{
		Student300.changeCollege();//calling static method without creating object
			Student300 s1=new Student300(101,"shaik");
			Student300 s2=new Student300(109,"hameeda");
			Student300 s3=new Student300(109,"hameeda");
			s1.display();
			s2.display();
			s3.display();
	}

	}
