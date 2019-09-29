package tree;

import node.*;
import utils.*;

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
	
	public void addNode (Node next, int index, int fork) {
		// Iterate through the entire Node-tree network until you reach a fork
		while (start.child != null) {
			
		}
	}
	
	public int getSize () {
		return size;
	}

}
