package OOP;

public class Stack {

	int s[]= new int[10];
	int tos;
	
	Stack() {
		tos=-1;
		
	}
	void push(int item) {
		if(tos==s.length) {
			System.out.println("stack is fulll");
		
		}
		else {
			s[++tos]= item;	
		}

		
	}
	int pop() {
		if(tos>=0)
			return s[tos--];
		else {
			System.out.println("stsck is empty");
			return -1;
		}
		
		
	}
	
	

}
