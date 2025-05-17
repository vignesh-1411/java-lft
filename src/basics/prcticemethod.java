package basics;
import java.util.Scanner;

public class prcticemethod {
	
/*static void printline() {
		System.out.println("--------------");
	}
	
	static String greet() {
		String g="Welcome";
		return g;
		
	}*/
static boolean twodigit(int n) {
	return (n>=10 && n<=99)||(n>=-10&&n<=-99);
	
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=scanner.nextInt();
		System.out.println(twodigit(n));
		
		
		

	}

}
