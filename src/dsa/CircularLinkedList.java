package dsa;

public class CircularLinkedList<T> {
	Node last;
	class Node{
		T data;
		Node next;
		Node(T val){
			val=data;
			next=null;
		}
	}
	
	CircularLinkedList(){
		last=null;
	}
	
	public void insertAtBeginning(T val) {
		Node newNode = new Node(val);
		if(last==null) {
			newNode.next=newNode;
			newNode=last;
		}
		else {
			newNode.next=last.next;
			last.next=newNode;
		}
	}
	
	public void insertAtEnd(T val) {
		Node newNode = new Node(val);
		if(last==null) {
			newNode.next=newNode;
			newNode=last;
		}
		else {
			newNode.next=last.next;
			last.next=newNode;
			last=newNode;			//this is the only change , finally we've to set newnode as last
		}
	}
	
	public void display() {
		if(last==null)
			return;
		Node temp=last.next;
		do {
			System.out.println(temp.data+" ");
			temp=temp.next;
		}while(temp!=last.next);
	}
	
	public T deleteAtBeginning() {
		if(last==null)
			throw new IndexOutOfBoundsException("Deletion attempted on empty list ");
		T temp = last.next.data;
		
		if(last.next==last) {
			last = null;
		}
		else {
			last.next=last.next.next;
		}
		return temp;
	}
	public void deleteAtEnd() {
		if(last==null) 
			throw new IndexOutOfBoundsException("Deletion attempted on empty list ");
		if(last.next==last)
			last = null;
		else {
			Node temp=last.next;
			while(temp.next!=last) {
				temp=temp.next;
			}
			temp.next=last.next;
			last=temp;
		}
	}

}
