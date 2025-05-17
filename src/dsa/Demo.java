package dsa;

import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>();
		DoublyLinkedList<Integer> list1 = new DoublyLinkedList<Integer>();
		CircularLinkedList<String> list2 =new CircularLinkedList<String>();
		list2.insertAtBeginning("ram");
		list2.insertAtEnd("sri");
		list2.insertAtBeginning("dev");
		list2.display();
		list2.deleteAtBeginning();
		list2.deleteAtEnd();
		list2.display();
		
		/*list1.insertAtBeginning(9);			//insert at beginning operation
		list1.insertAtBeginning(5);
		list1.insertAtBeginning(1);
		list1.insertAtBeginning(4);
		list1.display();
		System.out.println("");
		list1.insertAtpos(0,7);
		list1.displayRev();
		System.out.println("");
		list1.deleteAtBeginning();
		list1.deleteAtpos(3);
		list1.display();
		
		/*list1.deleteAtpos(2);
		list1.display();
		System.out.println("");
		
		//list.reverse();
		list.display();
		/*for(int a:list)
			System.out.println(a+" ");
		
		System.out.println("");
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}*/

	}

}
