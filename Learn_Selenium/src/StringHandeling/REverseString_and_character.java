package StringHandeling;

import java.util.Scanner;

public class REverseString_and_character {

	public static void main(String[] args) {
	Scanner scanner  = new Scanner(System.in);
	System.out.println("Enterstrng");
	String sc = scanner.nextLine();
	 String[] split = sc.split(" ");
	 int length = sc.length();
	 
	 for(int i=length-1;i>=0 ;i--)
	 {
		 System.out.print(sc.charAt(i));
	 }

	}

}
