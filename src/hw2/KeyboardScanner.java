package hw2;
import java.util.Scanner;
public class KeyboardScanner {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a integer:");
		int integer=keyboard.nextInt();
		System.out.println("Enter a float point number:");
		float floa=keyboard.nextFloat();
		System.out.printf("Enter a you name:");
		String name=keyboard.next();
		
		System.out.printf("Hi %s, the multiplication of %d and %.4f is %e",name,integer,floa,integer*floa);
		
	}
}
