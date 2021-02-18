
public class StringBuf {
	//Constructor
	protected StringBuf() {
		
	}
	public static void main(String[] args) {
		StringBuffer buf=new StringBuffer("Java");
		buf.append("Guide Verl/");
		buf.append(7);
		int index=5;
		buf.insert(index,"Student");
		index=23;
		buf.setCharAt(index, '.');
		int start=24;
		int end=25;
		buf.replace(24, 25, "8");
		String s=buf.toString();
		System.out.println(s);
	}

}
