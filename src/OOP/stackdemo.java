package OOP;

public class stackdemo {
	
	//this concept is called method overloading , that we can use same name for multiple methods 
	//but should give different type of parameters .
	static int max(int a, int b) {
		return a>b?a:b;
	}
	
	static char max(char a,char b) {
		return a>b?a:b;
	}
	
	static int avg(int a,int b,int c) {
		int d=(a+b+c)/3;
		return d;
	}
	public static void main(String args[]) {
		Stack s1= new Stack();
		s1.push(3);
		s1.push(6);
		s1.push(7);
		
		System.out.println(s1.pop());
		
		System.out.println(max(5,6));
		System.out.println(max('a','v'));
		System.out.println(avg(2,3,4));
	}

}
