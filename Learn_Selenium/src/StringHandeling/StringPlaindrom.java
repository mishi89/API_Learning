package StringHandeling;

public class StringPlaindrom {

	public static void main(String[] args) {
		String s = "nitin",b="";
		
		int l = s.length();
		for (int i=l-1;i>=0;i--)
		{
		b =b+s.charAt(i);
		}
		if(s.equalsIgnoreCase(b))
		{
			System.out.println("palindrom");
		}
		else
			System.out.println("NOt");
		}

	

}
