//package com.adsg.tree.tester;

//import com.adsg.tree.BinarySearchTree;
//import com.misc.Person;

public class BinaryTreeTester1 {

	public static void main(String[] args) {
		BinarySearchTree<Integer> myTree = new BinarySearchTree<Integer>();
		
		myTree.insert(50);//Note the use of primitive ints - they are auto-boxed into Integer objects.
		myTree.insert(31);
		myTree.insert(69);
		myTree.insert(57);
		myTree.insert(90);
		myTree.insert(99);
		
		myTree.rotateLeft();
		/*
		BinarySearchTree<String> myTree = new BinarySearchTree<String>();
		myTree.insert("adc");
		myTree.insert("qwe");
		myTree.insert("wer");
		myTree.insert("ert");
		myTree.insert("rty");
		myTree.insert("tyu");
		myTree.insert("yui");
		myTree.insert("uio");
		myTree.insert("iop");
		*/
		
		/*BinarySearchTree<Person> myTree = new BinarySearchTree<Person>();
		myTree.insert(new Person("Amelia", "Quinn", 20));
		myTree.insert(new Person("Olivia", "McLoone", 12));
		myTree.insert(new Person("Emily", "Thompson", 26));
		myTree.insert(new Person("Isla", "Wright", 30));
		myTree.insert(new Person("Ava", "Jackson", 60));
		myTree.insert(new Person("Jack", "Gallagehr", 55));
		myTree.insert(new Person("Oliver", "Browne", 42));
		myTree.insert(new Person("Charlie", "Hardinge", 8));
		myTree.insert(new Person("Jacob", "Twist", 19));
		*/
      
      System.out.println("In-order Traversal:");
		myTree.inOrderTraversal();
		System.out.println();
		
      System.out.println("Pre-order Traversal:");
		myTree.preOrderTraversal();
		System.out.println();
		
      System.out.println("Post-order Traversal:");
		myTree.postOrderTraversal();
		System.out.println();
		
		System.out.println("Tree contains " + myTree.countNodes() + " nodes");
		System.out.println();
		
		System.out.println("Find Minimum: "+myTree.findMinimum());
		System.out.println("Find Maximum: "+ myTree.findMax());
		
		System.out.println(myTree.find(90));
	}

}
