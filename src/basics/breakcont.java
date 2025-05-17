package basics;
import java.util.Scanner;

public class breakcont {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number:");
		int n=scanner.nextInt();
		for(int i=n+1;;i++) {
			double sqrt=Math.sqrt(i);
			if(Math.floor(sqrt)==sqrt) {
				System.out.	println("the nearest per.sq. after"+ n+"is"+ i);
				
				break;
			}
		}
		
		// TODO Auto-generated method stub

	}

}
