package StringHandeling;

import java.util.Scanner;

public class Reverse_string {

	public static void main(String[] args) {
	Scanner scanner  = new Scanner(System.in);
	System.out.println("Enter string");
	String s = scanner.nextLine();
	 String[]  split =s.split(" ");
	 int length = split.length;
	 for(int i= length-1;i>=0;i--)
	 {
		 System.out.println(split[i]);
	 }
	 

	}

}
