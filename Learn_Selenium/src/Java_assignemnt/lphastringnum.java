package Java_assignemnt;

public class lphastringnum {
	
/*	public static void splitstring(String str)
	{
		StringBuffer str1 = new StringBuffer();
		StringBuffer num = new StringBuffer();
		StringBuffer spec = new StringBuffer();
		
		for(int i =0 ;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			num.append(str.charAt(i));
			else if(Character.isAlphabetic(str.charAt(i)))
			num.append(str.charAt(i));
			
			else
				spec.append(str.charAt(i));
		}
		
		 System.out.println(str1); 
	        System.out.println(num); 
	        System.out.println(spec); 
	}
*/
	public static void main(String[] args) {
		
		String str = "geeks01$$for02geeks03!@!!"; 
		/*splitstring(str);*/
		StringBuffer str1 = new StringBuffer();
		StringBuffer num = new StringBuffer();
		StringBuffer spec = new StringBuffer();
		
		for(int i =0 ;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			num.append(str.charAt(i));
			else if(Character.isAlphabetic(str.charAt(i)))
			num.append(str.charAt(i));
			
			else
				spec.append(str.charAt(i));
		}
		
		 System.out.println(str1); 
	        System.out.println(num); 
	        System.out.println(spec); 
	}
	
	}


