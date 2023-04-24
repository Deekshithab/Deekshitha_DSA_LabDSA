package com.gl.javafsd.bst.test;

import com.gl.javafsd.bst.BinarySearchTree;
import com.gl.javafsd.bst.BinarySearchTreePairFinder;

public class BinarySearchTreePairFinderTest {

public static void main(String[] args) {
		
		BinarySearchTree tree = new BinarySearchTree();
		
		tree.insert(4);
		tree.insert(2);
		tree.insert(6);
		tree.insert(1);		
		tree.insert(3);		
		tree.insert(5);		
		tree.insert(7);		
		

		// 120, 60, 190
		// 111, 500, 220
		BinarySearchTreePairFinder finder 
			= new BinarySearchTreePairFinder(tree, 120);
		finder.findPairOfNodes();
	}
}
