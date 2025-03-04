package Introduction;
	
/*/
Important Operation
--->Add or insert
--->Print
--->Delete a node
--->size checking
/*/
public class LL {
	//create  a Node
	Node head;
	
	class Node{
		//node has data and adress of next node(of Node type)
		String data;
		Node next;
		//head
		
		
		Node(String data) {// Node has String data  and Node next so we have 
			//to give those values to constructor
			this.data =data;
			this.next = next;
		}
	}

	//add-First 
	public void addFirst(String data) {
		Node newNode = new Node(data);
		
		if(head==null) {
			head = newNode;
			return;
		}
			newNode.next=head;
			head = newNode;
		
	}
	// add -Last 
	public void addLast(String data) {
		Node newNode = new Node(data);
		Node tempNode  =head;
		if(tempNode==null) {
			head = newNode;
			return;
		}
		
		while(tempNode.next!=null) {
			tempNode = tempNode.next;
			
		}
		tempNode.next = newNode;
		
	}
	//printing List
	public void printList() {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		Node tempNode =head;
		while(tempNode!=null) {
			System.out.print(tempNode.data+" -> ");
			tempNode = tempNode.next;
		}
	
		System.out.println("NULL");
	}
	public static void main(String[] args) {
		LL list  = new LL();
		list.addFirst("sai");
		list.addFirst("Prasad");
		list.printList();
		
	}
}