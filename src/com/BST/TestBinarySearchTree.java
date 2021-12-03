package com.BST;

public class TestBinarySearchTree {
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		
		Node root = bst.insertElement(null, 56);
		Node element1 = bst.insertElement(root, 30);
		Node element2 = bst.insertElement(root, 70);
		Node element3 = bst.insertElement(root, 22);
		Node element4 = bst.insertElement(root, 95);
		Node element5 = bst.insertElement(root, 60);
		Node element6 = bst.insertElement(root, 40);
		Node element7 = bst.insertElement(root, 11);
		Node element8 = bst.insertElement(root, 65);
		Node element9 = bst.insertElement(root, 3);
		Node element10 = bst.insertElement(root, 16);
		Node element11 = bst.insertElement(root, 63);
		Node element12 = bst.insertElement(root, 67);
		
		System.out.println("InOrder Traversal: ");
		bst.inOrder(root);
		System.out.println("\n\nPreOrder Traversal: ");
		bst.preOrder(root);
		System.out.println("\n\nPostOrder Traversal: ");
		bst.postOrder(root);
		
		System.out.println("\n\nSize of Binary Search is: "+bst.size(root));
		
		bst.search(root,63);
	}
}