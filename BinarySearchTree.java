
public class BinarySearchTree {
    
    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        tree.insert(10);
        tree.insert(60);
        
        tree.inOrder(tree.root);
        System.out.println();
        tree.delete(50);
        tree.inOrder(tree.root);
        
    }
    
}

class BST{
    Node root;
    
    public void insert(int data){
        if(root == null){
            root = new Node(data);
            return ;
        }
       
        Node current = root,parent = null;
        
        while(true){
           
            parent = current;
            if(data<parent.data){
                current = current.left;
                
                if(current == null){
                    parent.left = new Node(data);
                    return;
                }
            }
            else {
                current = current.right;
                if(current == null){
                    parent.right = new Node(data);
                    return ;
                }
                
            }
            
        }
        
        
    }
    
    public Node getMinNode(Node root){
        Node temp = root;
        while(temp.left!=null){
            temp = temp.left;
        }
        return temp;
    }
    
    public Node getMaxNode(Node root){
        Node temp = root;
        while(temp.right!=null){
            temp = temp.right;
        }
        return temp;
    }
    
    public Node search(Node root, int key){
        Node ans = null;
        if(root == null) {
               System.out.print("BST is empty...\n");
               return null; 
          }
        else if(root.data == key) return root;
        else if(key>root.data){
          ans = search(root.right,key);
        }
        else if(key<root.data){
            ans = search(root.left,key);
        }
        return ans;

    }
    
    public void delete(int val){
        root = deleteNode(root,val);
    }
    
    public Node deleteNode(Node node, int val){
        if(node == null) return null;
        
        if(val > node.data){
            node.right = deleteNode(node.right,val);
        }
        else if(val < node.data){
            node.left = deleteNode(node.left,val);
        }
        else {
            if(node.left!=null && node.right != null){
                node.data = (getMinNode(node.right)).data;
                node.right = deleteNode(node.right,node.data);
            }
            else if(node.left == null){
               return node.right;
            }
            else if(node.right == null){
                return node.left;
            }
            else {
                return null;
            }
        }
        
       return node; 
    } 
    
    public void inOrder(Node root){
        if(root == null) return;
        
        if(root.left!=null) inOrder(root.left);
        System.out.print(root.data + " ");
        if(root.right!=null) inOrder(root.right);
    }
}

class Node{
    Node left, right;
    int data;
    
    public Node(int data){
        this.data = data;
    }
}
