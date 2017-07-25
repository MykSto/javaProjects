package graphicsApp;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;

public class PaintArea extends JComponent {

	private float px = 150.0f, py = 150.0f;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void setPosition(float px, float py){
		this.px = px;
		this.py = py;
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setPaint(Color.RED);
		//g2d.draw3DRect(50, 50, 150, 100, true);

		//g2d.setPaint(Color.GREEN);
		//g2d.drawString("Mano 3D stačiakampis", 60, 100);
		
		Point2D.Float p1 = new Point2D.Float(50.0f, 50.0f);
		float w1 = 60, h1 = 80;
		Rectangle2D.Float rect1 = new Rectangle2D.Float(p1.x, p1.y, w1, h1);
		g2d.draw(rect1);
		
		Point2D.Float p2 = new Point2D.Float(px, py);
		float w2 = w1 + 30, h2 = h1 + 40;
		Rectangle2D.Float  rect2 = new Rectangle2D.Float(p2.x, p2.y, w2, h2);
		g2d.draw(rect2);
		
		g2d.draw(new Line2D.Float(p1, p2));
		
		p1.setLocation(p1.x + w1, p1.y);
		p2.setLocation(p2.x + w2, p2.y);
		g2d.draw(new Line2D.Float(p1, p2));
		
		p1.setLocation(p1.x, p1.y + h1);
		p2.setLocation(p2.x, p2.y + h2);
		g2d.draw(new Line2D.Float(p1, p2));
		
		p1.setLocation(p1.x - w1, p1.y);
		p2.setLocation(p2.x - w2, p2.y);
		g2d.draw(new Line2D.Float(p1, p2));
		
    }
	
}

