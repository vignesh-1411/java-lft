package basics;
import java.util.Scanner;

public class probloop {

	public static void main(String[] args) {
		double n,sum=0.0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the no:");
		
		for(;;) {
			n=scanner.nextDouble();
			if(n<0.0) {
				//System.out.println(n);
				break;
			}
			sum+=n;
			
		}
		 System.out.println("Sum of the numbers: " + sum);
		
		// TODO Auto-generated method stub

	}

}
