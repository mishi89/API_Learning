package Java_assignemnt;

public class This_keyword {
	
	int val = 10;
	
	public void  abc (int cal)
	{
		this.val = cal;
	}


	public static void main(String[] args) 
	{
	
		This_keyword ky = new This_keyword();
		ky.abc(1234);
	System.out.println(ky.val);
	}

}
