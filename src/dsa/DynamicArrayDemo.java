package dsa;
import java.util.*;


class DynamicArray<T> implements Iterable<T>{
	private static final int initialcap = 5;
	private T arr[];
	private int size;
	private int capacity;
	
	
	@SuppressWarnings("unchecked")
	DynamicArray(){
		arr =(T[]) new Object[initialcap];
		size=0;
		capacity=initialcap;
		
	}
	public void add(T val) {
		if(size == capacity)
			expandArray();
		arr[size++]=val;
	}
	public void expandArray() {
		capacity *= 2;
		arr=java.util.Arrays.copyOf(arr, capacity);
	}
	public void display() {
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+ "  ");
			
		}
		System.out.println("the size is: "+size);
	}
	public void insertAtpos(int pos,T val) {
		if(size == capacity)
			expandArray();
		for(int i=size-1;i>=pos;i--) {
			arr[i+1]=arr[i];
		}
		arr[pos]=val;
		size++;
		
	}
	public void insertbeg(T val) {
		if(size == capacity)
			expandArray();
		
		for(int i=size-1;i>=0;i--)
			arr[i+1]=arr[i];
		arr[0]=val;
		size++;
	}
	public void deleteAtpos(int pos) {
		
		for(int i=pos+1;i<=size;i++)
			arr[i]=arr[i-1];
		
		size--;
		if(capacity > initialcap && capacity > 3*size)
			shrinkArray();
			
	}
	
	public void deletedlast() {
		size--;
	}
	public void shrinkArray() {
		capacity /= 2;
		arr=java.util.Arrays.copyOf(arr, capacity);
	}
	
	
	public Iterator<T> iteretor(){
			return new Iterator<T>(){
			
			int index = 0;
			
			public T next() {
				return arr[index++];
			}
			
			public boolean hasNext() {
				return index < size;
			}
		};

	}
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}

public class DynamicArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int val,pos;
		DynamicArray<Integer> list = new DynamicArray<Integer>();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("\n -------- List Menu -----------\n");
			System.out.println("1.Insert at End\n");
	        System.out.println("2.Display the list\n");
	        System.out.println("3.Insert at specified position \n");
	        System.out.println("4.Delete from specified position\n");
	        System.out.println("5.Exit\n");
	        System.out.println("\n--------------------------------------\n");
	        System.out.println("Enter your choice:\t");
	        int choice = scanner.nextInt();
	        switch(choice) {
	        case 1: System.out.println("Enter the data:");
	        		val = scanner.nextInt();
	        		list.add(val);
	        		break;
	        case 2: list.display();
	        		
	        		break;
	        case 3: System.out.println("enter the pos:");
	        		pos=scanner.nextInt();
	        		if(pos<0)
	        			System.out.println("invalid position");
	        		System.out.println("enter the data: ");
	        		val=scanner.nextInt();
	        		list.insertAtpos(pos,val);
	        		break;
	        case 4: System.out.println("enter the pos: ");
	        		pos=scanner.nextInt();
	        		if(pos<0)
	        			System.out.println("invalid position");
	        		list.deleteAtpos(pos);
	        		break;
	        case 5: System.exit(0);
	        		break;
	        case 6: list.deletedlast();
	        		break;
	        case 7: System.out.println("enter the data: ");
    				val=scanner.nextInt();
	        		list.insertbeg(val);
	        		break;
	        default: System.out.println("invalid choice");
	        
	        		
	        		
	        		
	        }
		}
		
		
		

	}

}

/* Exercise
 * 
 * delete at end
 * delete from beginning
 * insert at beginning
 * get(index)  get(2)
 * update(index,val)  update(3,5)  arr[index] = val;
 * search(val) -> return index
 * clear
 * contains(val)
 */
