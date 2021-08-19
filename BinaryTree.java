import java.util.Scanner;
public class BinaryTree {
    static Scanner sc;
    public static void main(String[] args) {
        System.out.println("Enter data for root Node :");
        
        Node root = createTree();
        System.out.println();
        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
    }
    
    public static Node createTree(){
        sc = new Scanner(System.in);
      
        Node root;
        
        int data = sc.nextInt();
      
        if(data == -1) return null;
        root = new Node(data);
      
        System.out.print("Enter left for "+data+" : ");
        root.left = createTree();
      
        System.out.print("Enter right for "+data+" : ");
        root.right = createTree();
     
        return root;
    }
    
    public static void inOrder(Node root){
       if(root == null) return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    
    public static void preOrder(Node root){
       if(root == null) return;
        
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    
    public static void postOrder(Node root){
       if(root == null) return;
       
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
    
}

class Node{
    Node left;
    Node right;
    int data;
    
    public Node(int data){
        this.data = data;
    }
}
