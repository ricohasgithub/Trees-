package node;

import java.util.List;
import java.util.ArrayList;

import java.awt.Graphics;

import utils.Point2D;
import utils.Drawable;

public abstract class Node implements Drawable {

	// Current position of the Node (for drawing purposes)
	public Point2D pos;

	// Previous and Next Nodes for Tree Structure (Used List as there may be multiple parents and children in a mutable tree)
	public List<Node> parent;
	public List<Node> child;

	// String variable used to get the description of text
	public String description;

	public Node () {
		pos = null;
		parent = new ArrayList<Node>();
		child = new ArrayList<Node>();
		description = "EMPTY NODE";
	}

	public Node (int x, int y) {

		pos = new Point2D(x, y);

		parent = new ArrayList<Node>();
		child = new ArrayList<Node>();

		this.description = "EMPTY NODE";

	}

	public Node (int x, int y, String description) {

		pos = new Point2D(x, y);

		parent = new ArrayList<Node>();
		child = new ArrayList<Node>();

		this.description = description;

	}

	// Draw a template node with description, shape with String text inside
	public abstract void Draw (Graphics g);

}
