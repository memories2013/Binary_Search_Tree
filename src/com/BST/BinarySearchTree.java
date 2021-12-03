package com.BST;

public class BinarySearchTree {
	Node root;

	public BinarySearchTree() {
		root = null;
	}
	
	public Node insertElement(Node root , int data) {
		if(root == null) {
			root = new Node(data);
			return root;
		}
		
		if(data < root.data) {
			root.left = insertElement(root.left ,data);
		}else if(data > root.data) {
			root.right = insertElement(root.right , data);
		}
			return root;
	}
	
	public void inOrder(Node node) {
		if(node == null) {
			return;
		}
		inOrder(node.left);
		System.out.print(node.data + " ");
		inOrder(node.right);
	}
	
	public void preOrder(Node node) {
		if(node == null) {
			return;
		}
		System.out.print(node.data + " ");
		preOrder(node.left);
		preOrder(node.right);
	}
	
	public void postOrder(Node node) {
		if(node == null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data + " ");
	}
	
	public int size(Node node) {
		if(node == null) {
			return 0;
		}else
			return(size(node.left) + 1 + size(node.right));
	}
	
	public void search(Node root ,int data) {
		if(searchAll(root, data)) 
			System.out.println("Found data");
		else
			System.out.println("Didn't find data");		
	}
	
	public boolean searchAll(Node root, int data) {
		
		if (root == null)
			return false;
		if(root.data == data) 
			return true;
		else		
			return searchAll(root.left, data) || searchAll(root.right, data);
	}
}

