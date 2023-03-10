package Trees;
import java.util.Scanner;

public class binaryTree {
	
	static Scanner sc = null;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		Node root = createTree();
		inOrder(root);
		System.out.println();
		preOrder(root);
		System.out.println();
		postOrder(root);
		System.out.println();
        int h=height(root);
        System.out.println("height:"+h);
        int s=size(root);
        System.out.println("No of Node:"+s);
	}
	
	static Node createTree() {
		
		Node root = null;
		System.out.println("Enter data: ");
		int data = sc.nextInt();
		
		if(data == -1) return null;
		
		root = new Node(data);
		
		System.out.println("Enter left for " + data);
		root.left = createTree();
		
		System.out.println("Enter right for "+ data);
		root.right = createTree();
		
		return root;
	}
	
	static void inOrder(Node root) {
		if(root == null) return;
		
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	static void preOrder(Node root) {
		if(root == null) return;
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	static void postOrder(Node root) {
		if(root == null) return;
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}
    static int height(Node root){
        if(root == null) return 0;

        return Math.max(height(root.left), height(root.right))+1;
    }

    static int size(Node root){
        if(root == null) return 0;

        return size(root.left) + size(root.right)+1;
    }
}

class Node {
	Node left, right;
	int data;
	
	public Node(int data) {
		this.data = data;
	}
}
