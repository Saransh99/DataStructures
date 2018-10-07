// this is the class where the magic happens

// to do the linking better use a copy and then draw the linked list to see the pointers change for yourself

public class LinkedList{
	
	Node head;
	
	public void insertatSart(int data) {
		
		Node new_node = new Node(data);
		
		new_node.next = head;
		head = new_node;
		
	}
	
	public void insertatEnd(int data) {
		
		Node new_node = new Node(data);
		
		new_node.next = null;
		
		if (head == null) {
			
			head = new_node;
			return;
		}
		
		Node n = head;
		while(n.next != null) {
			
			n = n.next;
			n.next = new_node;
			return;
		}
		
		
	}
	
	public void inseratPos(int pos, int data) {
		
		Node new_node = new Node(data);
		
		Node n = head;
		
		if(pos==0) {
			
			insertatSart(data);
			
		}
		else {
		for(int i=0; i<pos-1; i++) {
			
			n = n.next;
			
		}
		new_node.next = n.next;
		n.next = new_node;
		}
		}
	// we need to delete stuff too
	public void deleteAt(int pos) {
		
	    Node n =head;
	    Node temp = null;
		if(pos == 0) {
			
			head = head.next;
		}else {
			for(int i=0; i<pos-1;i++) {
				
				n = n.next;
				
			}
			temp = n.next;
			n.next = temp.next;
			
		}	
	}
	
	public int listlength() {
		
		Node temp = head;
		
		int count = 0;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
		
	}
	
	// we can also search diff node values of the list
	
	public Boolean nodeisPresent(int reqdata) {
		
		// we iterate from the head of the list if the given  node matches the value the user wants we return true
		
		Node n = head;
		while(n != null) {
			
			if(n.data == reqdata) {
				System.out.println("the reqdata is present in the list ");
				return true;
				
			}
			n = n.next;
			
		}
		
		System.out.println("the data is not present in the list");
		return false;
		
	}
	
	// another method to print the nth element which the user has requested in the function
	// see we write this method by ourself therefore we are learning we should always try to write our own methods
	// we still need to understand how to wtier the recursive functions 
	
	public void getnth(int posofelement) {
		
		Node n = head;
		int count =0;
		while(n != null) {
			count++;
			if(posofelement == count-1) {
				System.out.println("the element requested is " + n.data);
			}
			n = n.next;
		}
		
	}
	
	public void getTheMiddleOne() {
	// we return the middle element of the list if there is even elements then we return the 2nd middle one
		
		
		
	
	}
	
	
	public void showList() {
		
		// this fun will show the list as the data we insert in this functuons
		
		Node n = head;
		
		while(n != null) {
			
			System.out.println(n.data);

			n = n.next;
		}	
		
	}
}




