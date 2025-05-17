package dsa;

import java.util.Iterator;

/*
 * Linked List
 * 
 * Insert at Beginning
 * Display
 * Insert at any pos
 * Delete at any pos
 * 
 * generics
 */

public class LinkedList<T> implements Iterable<T> {
	
	Node head;		//first creating head for LL to point out the the first node
	
	class Node{			//inner class, creating node which contains data and address of next node(reference)
		T data;
		Node next;
		Node(T val){		
			data=val;
			next = null;		//initially we assign next(ref) as null
		}
	}
	
	LinkedList(){
		head=null;				//initially we assign head as null
	}
	
	public void insertAtBeginning(T val){
		
		Node newNode=new Node(val);
		//newNode.data=val;			we use constructor instead of this
		
		if(head==null) {			//if the node was emptyy.....
			head=newNode;
		}
		else{						//if node isnt empty already..
			newNode.next=head;		//firstly we should assign head's value to the newnode's ref(next) 
			head=newNode;			//then make the newnode as head
		}
		
		
	}
	public void display() {
		Node temp = head;	//were using temp variable , cuz we dont want to change the head by using it in the loop
		while(temp!=null) {					//checks until the ref is null(tells it is the end )
			System.out.print(temp.data);
			temp = temp.next;						//used to jump to next node
		}
	}
	
	public void insertAtpos(int pos,T val) {
		if(pos==0) {					//to achieve boundary conditions (which is first and last place) we have to write this specially.
			insertAtBeginning(val);
			return;
		}
		Node newNode=new Node(val);
		Node temp = head;				
		for(int i=1;i<pos;i++) {			//since we want the prev node before the position we want to insert, for making sure to copy the next(ref) of successive node
			
			if(temp==null) {					//throws a exception if the pos given by user is not valid.
				throw new IndexOutOfBoundsException("invalidd pos"+ pos);
			}
			temp=temp.next;				//just stops at the node before the position we want to insert
		}
		
		newNode.next=temp.next;
		temp.next=newNode;
		
	}
	public void deleteAtpos(int pos) {
		
		if(head == null)
			throw new IndexOutOfBoundsException("deletion attempted at empty list"+pos);
		
		if(pos==0) {
			head=head.next;
			return;
		}
		
		Node temp = head;
		Node prev = head;
		for(int i=1;i<=pos;i++) {
			prev=temp;
			temp = temp.next;
		}
		prev.next=temp.next;
	}
	public void deleteAtBeginning() {
		
		if(head==null) 
			throw new IndexOutOfBoundsException("Deletion attempted on empty list ");
	
		head = head.next;
	}
	
	public void reverse() {
		Node prev = null;
		Node current = head;
		Node next = head.next;
		
		while(current != null) {
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		
		head =prev;
	}
	public  Iterator<T> iterator(){
		return new Iterator<T>() {
			Node temp = head;
			public boolean hasNext() {
				return temp!=null;
			}
			public T next() {
				T val=temp.data;
				temp=temp.next;
				return val;
				
			}
			
		};
	}
	
}


/*try the following methods
 * 
 * get(pos) - get(2)
 * update(pos,val)
 * deleteAtEnd
 * insertAtEnd(val)
 * search(val) - return index, -1
 * contains(val) - return true or false
 * length
 */

