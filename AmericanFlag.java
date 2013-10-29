import java.awt.*;
import java.applet.*;

public class AmericanFlag {
	private Rectangle union;
	private Rectangle[] stripes = new Rectangle[13];
	//private Star[] stars
	private double scale;

	public AmericanFlag (int x, int y, double scale){
		
		for (int i = 0; i < 13 ; i++ ) {
			if (i % 2 == 0) {
				stripes[i] = new Rectangle(new Point(x, (int)((i + 1) * scale * 10 + y)), (int)(scale * 247),(int)(scale * 10), Color.red);
				
			}else{
				stripes[i] = new Rectangle(new Point(x, (int)((i + 1) * scale * 10 +y)), (int)(scale * 247),(int)(scale * 10), Color.white);
			}
			
		}

		union = new Rectangle(new Point(x , (int)(y + 10 * scale)), (int)(scale * 99),(int)(scale * 60), Color.blue);	
		// for (int i = 0;i < 9; i++) {
		// 	if(i % 2 == 0){x
		// 		for (int j = 0; j < 6; i++) {
		// 			star[i] = new Star( new Point(x + (scale * 32 * j), y + (scale * 26 * i)), (int)(scale * 15))
		// 		}
		// 	}else{
		// 		for (int j = 0;j < 5; j++) {
		// 			star[i] = new Star( new Point(x + (scale * 16 * (j + 1), y + (scale * 13 * i)), (int)(scale * 15))
					
		// 		}
		// 	}
				
		// }
		


	}


	public void draw(Graphics g){
		for (int i = 0; i < 13; i++) {
			stripes[i].draw(g);
			
		}
		union.draw(g);
	
	}

	// public void redStripe(int x, int y, int height, int width, Graphics g) {
	// 	g.setColor(Color.red);
	// 	g.fillRect(x, y, width, height);

	// }

	// public void whiteStripe(int x, int y, int height, int width, Graphics g) {
	// 	g.setColor(Color.white);
	// 	g.fillRect(x, y, width, height);

	// }

	// public void union(int x, int y, int height, int width, Graphics g) {
	// 	g.setColor(Color.blue);
	// 	g.fillRect(x, y, width, height);

	// }

	// public void setX(int x){
	// 	if (x > 0) {
	// 		this.x = x;
			
	// 	}
	// }
	// public void setY(int y){
	// 	if (y > 0) {
	// 		this.y = y;
			
	// 	}
	// }
	// public void setH(int h){
	// 	if (x > 0) {
	// 		this.h = h;
			
	// 	}
	// }
	// public void setW(int w){
	// 		if (x > 0) {
	// 			this.w = w;
				
	// 		}
	// 	}
	// }
	
}