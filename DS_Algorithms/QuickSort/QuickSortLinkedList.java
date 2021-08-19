
public class QuickSortLinkedList {
    
    public static void main(String[] args) {
        
    }
    
}

class LinkedList{
    Node head = null;
    
    public void add(int data){
        if(head == null){
         Node temp = new Node(data);
         head = temp;
        }
        else{
            Node node = new Node(data);
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next=node;
        }
    }
    
    public void printList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" —» ");
            temp= temp.next;
        }
        System.out.println("null\n");
    }
}


class Node{
    int data;
    Node next;
    
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
    