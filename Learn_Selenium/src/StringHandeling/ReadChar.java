package StringHandeling;

import java.util.Scanner;

public class ReadChar {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String");
	String s =sc.nextLine();
	
	int l = s.length();
	System.out.println(l);
	
	for(int i=0;i<l;i++)
	{
		System.out.println(s.charAt(i));
	}

	}

}
