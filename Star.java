import java.awt.*;
import java.applet.*;

public class Star {

	private Polygon star;
	private int radius;
	private Point topleft;

	public Star(){
		star = new Polygon();
		this.topleft=topleft;
		this.radius=radius;
	}
	
	public void draw(Graphics g){
		g.setColor(Color.white);
		star.addPoint(topleft.x() + radius * 0.61, topleft.y() + radius * 0.33);
		star.addPoint(topleft.x() + radius * 0.99, topleft.y() + radius * 0.33);
		star.addPoint(topleft.x() + radius * 0.66, topleft.y() + radius * 0.49);
		star.addPoint(topleft.x() + radius * 0.75, topleft.y() + radius * 0.87);
		star.addPoint(topleft.x() + radius * 0.50, topleft.y() + radius * 0.65);
		star.addPoint(topleft.x() + radius * 0.25, topleft.y() + radius * 0.65);
		star.addPoint(topleft.x() + radius * 0.34, topleft.y() + radius * 0.49);
		star.addPoint(topleft.x() + radius * 0.01, topleft.y() + radius * 0.33);
		star.addPoint(topleft.x() + radius * 0.39, topleft.y() + radius * 0.33);
	}
}