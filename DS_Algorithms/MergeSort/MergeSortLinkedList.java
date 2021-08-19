/*Functions Included in Linked List :
  1. void add(int data)
  2. void addFirst(int data)
  3. void printList(Node head)
  4. Node reverse(Node head)
  5. Node getMid(Node head)
  6. Node mergeSort(Node head)
*/


import java.util.Scanner;
public class MergeSortLinkedList {
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       LinkedList list = new LinkedList();
       System.out.println("Enter the Size of Unsorted Linked List :\n");
       int size = sc.nextInt();
       for(int i=0;i<size;i++){
           int temp = (int)(Math.random()*100);
           list.add(temp);
        }
       list.printList(list.head);
       list.head = list.mergeSort(list.head);
       System.out.println("Sorted Linked List :\n");
       list.printList(list.head);
       System.out.println("\n\nReverse Linked List :\n");
       list.head = list.reverse(list.head);
       list.printList(list.head);
    }
    
}


class LinkedList {
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
   
   public void addFirst(int data){
      if(head == null){
         Node temp = new Node(data);
         head = temp;
        }
      else{
         Node node = new Node(data);
         Node temp = head;
         head = node;
         head.next = temp;
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
    
    public Node getMid(Node head){
        Node f = head;
        Node s = head;
        while(f.next!=null && f.next.next!=null){
            f = f.next.next;
            s = s.next;
        }
        return s;
    }
    
    public Node mergeSort(Node head){
       if(head==null || head.next ==null){
         return head;
      }
      Node mid = getMid(head);
        Node first = head;
        Node second = mid.next;
        mid.next = null;
        
        Node left = mergeSort(first);
        Node right = mergeSort(second);
        
        Node result = merge(left,right);
        return result;
    }
    
    public Node merge(Node left,Node right){
        if(left==null){
            return right;
        }
        else if(right==null){
            return left;
        }
        else if(left==right){
            return left;
        }
        
        Node answer = null;
        if(left.data<=right.data){
           answer = left;
           answer.next = merge(left.next,right);
        }
        else{
            answer = right;
            answer.next = merge(left,right.next);
        }
        return answer;
    }
   
   public Node reverse(Node head){
     Node prev = null;
     Node curr = head;
     Node next = null;
      while(curr!=null){
        next = curr.next;
         curr.next = prev;
         prev = curr;
         curr = next;
      }
      head = prev;
      return head;
   }
   
   
    
    
}


class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
