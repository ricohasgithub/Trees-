package node;

import java.util.List;
import java.util.ArrayList;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import utils.Constants;
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
	
	public Node (int x, int y, String description) {
		
		pos = new Point2D(x, y);
		
		parent = new ArrayList<Node>();
		child = new ArrayList<Node>();
		
		this.description = description;
		
	}
	
	// Draw a template node with description, a rectangle with default description text
	public void Draw(Graphics g) {
		
		// Check for any exception edge cases first
		if (pos == null) {
			throw new NullPointerException("ERROR: CANNOT DRAW POINT. Point hasn't been initialized yet!");
		}
		
		// Cast the Graphics g variable to Graphics2D
		Graphics2D g2 = (Graphics2D) g;
		
		// Draw the rectangle at pos.x and pos.y
		g2.draw(new Rectangle2D.Double(pos.x, pos.y, Constants.RECT_NODE_WIDTH, Constants.RECT_NODE_HEIGHT));
		
	}

}
