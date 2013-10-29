import java.awt.*;
import java.applet.*;

public class Rectangle {

	private Point topleft;
	private int width, height;
	private Color color;

	public Rectangle(Point topleft, int width, int height, Color color){
		this.color= color;
		this.width = width;
		this.height = height;
		this.topleft = topleft;

	}

	public void draw(Graphics g){
		g.setColor(color);
		g.fillRect(topleft.x(), topleft.y(), width, height);

	}
}