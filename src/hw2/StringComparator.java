package hw2;
import java.util.Scanner;
public class StringComparator {
	public static void main(String[] args) {
		Scanner StringComparator = new Scanner(System.in);
		System.out.println("Enter a string 1: ");
		String num=StringComparator.next();	
		System.out.println("Enter a string 2: ");
		String num2=StringComparator.next();
		num=num.toLowerCase();
		num2=num2.toLowerCase();
		if(num.equals(num))
		{
			System.out.println("The two strings are the same");
		}
		else 
		{
			System.out.println("The two strings are not the same");
		}
	}
	

}
