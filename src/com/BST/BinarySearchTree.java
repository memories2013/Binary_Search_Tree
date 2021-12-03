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
}

