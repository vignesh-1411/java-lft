package basics;
import java.util.Scanner;

public class selectionstatements {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		char letter;
		System.out.println("enter the alphabet:");
		letter = scanner.next().charAt(0);
		
		switch(letter) {
		case 'a','e','i','o','u':
			System.out.println("the letter is vowel");
		break;
		default:
			System.out.println("consonant");
			
		}
		// TODO Auto-generated method stub

	}

}
