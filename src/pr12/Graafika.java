package pr12;

import java.applet.Applet;
import java.awt.*;

public class Graafika extends Applet {

	public void paint(Graphics g) {

		// yleminek(g, Color.blue, Color.red);
		joonistaTaust(g);
		joonistaRing(g);

	}

	public void yleminek(Graphics g, Color varv1, Color varv2) {

		int min_x = 0;
		int min_y = 0;
		int max_x = getWidth();
		int max_y = getHeight();
		Graphics2D g2 = (Graphics2D) g;
		GradientPaint sujuv = new GradientPaint(min_x, min_y, varv1, max_x, max_y, varv2, false);
		g2.setPaint(sujuv);
		Rectangle kast = new Rectangle(min_x, min_y, max_x, max_y);
		g2.fill(kast);

	}

	public void joonistaTaust(Graphics g) {
		int w = getWidth();
		int h = getHeight();
		g.setColor(Color.white);
		g.fillRect(0, 0, w, h);
	}

	public void joonistaRing(Graphics g) {
		g.setColor(Color.black);
		int keskkohtX = getWidth() / 2;
		int keskkohtY = getHeight() / 2;

		for (double nurk = 0; nurk <= Math.PI * 4; nurk = nurk + .03) {
			double raadius = nurk*0.5;
			int x = (int) (raadius * nurk * Math.cos(nurk));
			int y = (int) (raadius * nurk * Math.sin(nurk));
			g.fillRect(keskkohtX + x, keskkohtY + y, 2, 2);
		}
	}

}
