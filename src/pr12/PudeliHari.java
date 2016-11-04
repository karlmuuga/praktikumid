package pr12;

import java.applet.Applet;
import java.awt.*;

public class PudeliHari extends Applet {
	/*
	 * Ringjoone v6rrand parameetrilisel kujul x = r * cos(t) y = r * sin(t) t =
	 * -PI..PI
	 */
	public void paint(Graphics g) {

		// Kysime kui suur aken on?
		int w = getWidth();
		int h = getHeight();

		int x0 = w/2; // Keskpunkt
		int y0 = h/2;
		int r = Math.min(w, h)/2; // Raadius
		int x, y;
		double t;

		// T2idame tausta
		g.setColor(Color.white);
		g.fillRect(0, 0, w, h);

		// Joonistame
		g.setColor(Color.red);
		int i = 0;
		for (t = -Math.PI; t < Math.PI; t = t + Math.PI / 8) {
			
			x = (int) (r * Math.cos(t) + x0);
			int lastx = (int) (r * Math.cos(t-(Math.PI / 8)) + x0);
			
			y = (int) (r * Math.sin(t) + y0);
			int lasty = (int) (r * Math.sin(t-(Math.PI / 8)) + x0);
			
			g.drawLine(x0, y0, x, y);
			
			if(i%2 == 1)
				g.drawLine(lastx,lasty,x,y);
			i++;
			
		}
	}
}