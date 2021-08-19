
public class MyLinkedList<E> {
	
	Node head;
		
	class Node 
	{
		E data;
		Node next;
		public Node(E data) {
			this.data = data;
			next = null;
		}
		
	}
	
		
		public void add(E data) //appends a new node to the end of the linked list
			{
				Node toAdd = new Node(data);
				
				if(head == null) {
					head = toAdd;
					return;
				}
		
				Node temp = head;
				while(temp.next != null) {
					temp= temp.next;
				}
				temp.next = toAdd;
			}
		
		
		public boolean isEmpty() //checks whether the linked list is empty or not 
			{
				
				return (head == null); 
			}
		
		
		public void print() //print the linked list
			{
				Node temp = head;
				if(head == null) {
					System.out.println("Linked List Empty !!");
				}
				while(temp !=null) {
					System.out.print(temp.data + " ");
					temp = temp.next;
				}
			}
	
		
		public void delete(E data) //deletes the first node with given element stored in it
			{
				Node temp = head;
				Node previous = head;
				Node current = head.next;
				
				if(head != null && head.data == data) //deletes first element if given data is found in it
					{
						head = head.next;
						return;
					}
					
				if(head!=null && head.next== null) //deletes head if only one node is present in the linked list
					{
						head = null;
						return;
					}
				while(current!=null) 
					{
						if(current.data == data) {
							previous.next = current.next;
							previous = current.next;
							break;
						}
						else {
							previous = current;
							current = current.next;
						}
					}
				
			}
		void clear() //makes the linked list empty

		{
			Node temp = head;
			while(temp!= null) {
				delete(temp.data);
				temp = temp.next;
			}
		}
		int size() //prints the size of the Linked List
			{
				Node temp = head;
				int size =0;
				while(temp!= null) {
					size++;
					temp = temp.next;
				}
				return size;
			}
		public E getLast() 
			{
				Node temp = head;
				while(temp.next!=null) {
					temp = temp.next;
				}
				return temp.data;
			
			}
		boolean contains(E data)
		{
			Node temp = head;
			boolean isPresent = false;
			while(temp!=null) {
				if(temp.data == data) {
					isPresent = true;
					break;
				}
				else {
					temp = temp.next;
				}
			}
			return isPresent;
		}
		
		public int getIndex(E data) {
			Node temp = head;
			int index = 0;
			if(contains(data)) {
				while(temp!=null) {
					if(temp.data == data ) {
						break;
					}
					index++;
					if(temp.next!=null) {
						temp = temp.next;
					}
					else {
						break;
					}
				}
			}
			else {
					index = -1;
				}
			return index;
		}
}


