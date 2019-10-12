package tree;

import node.*;
import utils.*;

import java.awt.Graphics;
import java.util.List;

public class Tree {
	
	public Node start;
	public int size;
	
	public Tree () {
		start = null;
		size = 0;
	}
	
	public Tree (Node start) {
		this.start = start;
		size = 1;
	}
	
	// Arguments: index is the height position within the tree (of the parent Node) and fork is the horizontal index of the index Node layer
	public void addNode (Node next, int index, int fork) {

		// Temporary Node variable used to keep track of the current node
		Node curr = start;
		
		// Tree is empty, add Node to first layer directly
		if (curr.child.size() == 0) {
			curr.child.add(next);
			return;
		}
		
		// Otherwise, traverse the tree and insert the Node recursively
		traversePut(curr, 0, 0, next, index, fork);
		
	}
	
	public void traversePut (Node curr, int cIndex, int cFork, Node insert, int fIndex, int fFork) {
		
		// If the recursive algorithm has arrived at the desired insertion location within the tree structure, insert the Node and stop
		if (cIndex == fIndex && cFork == fFork) {
			System.out.println("Insertion Successful!");
			curr.child.add(fFork, insert);
			return;
		} else if (cIndex == fIndex) {
			// If the method has reached the layer of Nodes on the same height (index) as the destination
			
			// New layer, reset cFork
			cFork = 0;
			for (Node n : curr.child) {
				// Traverse each child Node (increment cFork)
				cFork++;
				traversePut(n, cIndex, cFork, insert, fIndex, fFork);
			}
		} else if (cIndex > fIndex) {
			
			// New layer, reset cFork and increment height index variable
			cIndex++;
			cFork = 0;
			
			// If the method still hasn't reached the desired layer height, keep traversing
			for (Node n : curr.child) {
				// Also search through all of the Nodes located under the current Node subtree and the adjacent Node's subtrees
				for (Node nc : n.child) {
					cFork++;
					traversePut(n, cIndex, cFork, insert, fIndex, fFork);
				}
			}
			
		}
		
		// All subtree Nodes reached and no viable/viable solution found, regardless, break the recursive method
		return;
		
	}
	
	// This void method recursively traverses the entire Node tree and draws all the Nodes
	public void traverseDraw (Node curr, Graphics g) {
		
		if (curr.child == null) {
			// No more children for this subtree, break the recursive method
			curr.draw(g);
			return;
		}
		
		for (Node n : curr.child) {
			traverseDraw(n, g);
		}
		
	}
	
	public int getSize () {
		return size;
	}

}
