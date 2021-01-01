package StringHandeling;

import java.util.Scanner;

public class Word_read {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String s = sc.nextLine();
		
	String[] split = s.split(" ");
	int length = split.length;
	
	for(int i =0;i<length;i++)
	{
		System.out.println(split[i]);
	}

	}

}
