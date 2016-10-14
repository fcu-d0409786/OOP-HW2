package hw2;
import java.util.Scanner;
public class StringComparator {
	public static void main(String[] args) {
		Scanner StringComparator = new Scanner(System.in);
		int flag = 0;
		while(flag==0)
		{
			System.out.print("Enter a string 1: ");
			String num=StringComparator.next();	
			System.out.print("Enter a string 2: ");
			String num2=StringComparator.next();
			num=num.toLowerCase();
			num2=num2.toLowerCase();
			if(num.equals(num2))
			{
				System.out.println("The two strings are the same");
				flag=1;
			}
			else 
			{
				System.out.println("The two strings are not the same");
			}
		};
	}
	

}
