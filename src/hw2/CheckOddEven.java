package hw2;
import java.util.Scanner;


public class CheckOddEven {
	public static void main(String[] args) {
		Scanner CheckOddEven = new Scanner(System.in);
		System.out.println("Enter a integer: ");
		int integer=CheckOddEven.nextInt();
		int ans=integer%2;
		if(ans == 1) 
            System.out.println("The input integer is Odd Number"); 
        else 
            System.out.println("The input integer is Even Number"); 
		
	}
	

}
