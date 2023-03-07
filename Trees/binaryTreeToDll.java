package Trees;

public class binaryTreeToDll {

    //Function to convert binary tree to doubly linked list and return it.
    
    Node head=null, prev=null;
    
    Node bToDLL(Node root)
    {
        if(root==null) return null;
        
       bToDLL(root.left);
	 
	 if(prev==null){
	     head=root;
	    }
	 else
	 {
	     prev.right=root;
	     root.left=prev;
	    	
	 }
     prev=root; 

	bToDLL(root.right);
	
     return head;
    }

    public static void main(String[] args) {
        
    }
}
