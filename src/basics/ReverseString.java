package basics;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String n;
		System.out.println("Enter the string:");
		Scanner scanner=new Scanner(System.in);
		String input=scanner.nextLine();
		String reversed ="";
		/*for(int i=0;i<n.length()-1;1>=0;i--) {
			reversed += input.charAt(i);
			
		}*/
		 for (int i = input.length() - 1; i >= 0; i--) {
	            reversed += input.charAt(i);  // Add each character in reverse order
	        }
	        
	        // Print the reversed string
	        System.out.println("Reversed string: " + reversed);
	        
	        scanner.close();
	    }
	
		
		

	}


