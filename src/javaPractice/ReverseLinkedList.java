package javaPractice;

class Node{
	
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
		this.next=null;
	}
}

public class ReverseLinkedList {
	static Node head;
	
	
	public static Node reversedLinkedList(Node current) {
		Node prev=null;
		Node next=null;
		
		while(current !=null) {
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		
		return prev;
	}
	
	public static void printLinkedList(Node node) {
		while(node !=null) {
			System.out.print(node.data +" -> ");
			node=node.next;
		}
		System.out.println("null");
	}
	
	
	public static void main(String [] args) {
		head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(3);
		head.next.next.next=new Node(4);
		head.next.next.next.next=new Node(5);
		
		System.out.println("Original Linked List");
		printLinkedList(head);
		
		head=reversedLinkedList(head);
		System.out.println("Reversed Linked List");
		printLinkedList(head);
	}

}
