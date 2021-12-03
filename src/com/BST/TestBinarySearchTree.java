package com.BST;

public class TestBinarySearchTree {
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		
		Node root = bst.insertElement(null, 56);
		Node node = bst.insertElement(root, 30);
		Node nextNode = bst.insertElement(root, 70);
		
		System.out.println("InOrder Traversal: ");
		bst.inOrder(root);
		System.out.println("\n\nPreOrder Traversal: ");
		bst.preOrder(root);
		System.out.println("\n\nPostOrder Traversal: ");
		bst.postOrder(root);
	}
}