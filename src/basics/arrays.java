package basics;
import java.util.Scanner;
public class arrays {

	public static void main(String[] args) {
		int[] n=new int[6];
		int sum=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter numbers:");
		for(int i=0;i<n.length;i++) {
			int a=scanner.nextInt();
			sum+=a;
			
			}
		System.out.println("the sum is: "+sum);
		
		
		// TODO Auto-generated method stub

	}

}
