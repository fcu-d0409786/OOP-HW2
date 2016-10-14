package hw2;

public class Continue 
{
	public static void main(String[] args) 
	{
		for(int i = 0; i < 5; i ++) 
		{
			if(i==2 || i==0)
			{
				continue;
			}
			System.out.println(i);
			if(i==3)
			{
				break;
			}
		}
	}
}
