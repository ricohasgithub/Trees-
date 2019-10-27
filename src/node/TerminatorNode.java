package node;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import node.Node;
import utils.Constants;

public class TerminatorNode extends Node {

	// Draw a template node with description, a rectangle with default description text
	public void draw (Graphics g) {
		
		// Check for any exception edge cases first
		if (pos == null) {
			throw new NullPointerException("ERROR: CANNOT DRAW POINT. Point hasn't been initialized yet!");
		}

		// Cast the Graphics g variable to Graphics2D
		Graphics2D g2 = (Graphics2D) g;

		// Draw the rectangle at pos.x and pos.y
		g2.draw(new Rectangle2D.Double(pos.x, pos.y, Constants.RECT_NODE_WIDTH, Constants.RECT_NODE_HEIGHT));
		// Draw the description String inside the rectangle
		g2.drawString(description, pos.x + (int) (Constants.RECT_NODE_HEIGHT * 0.3), pos.y + (int) (Constants.RECT_NODE_WIDTH * 0.3));
		
		
	}

	public String toString() {
		return null;
	}

}
