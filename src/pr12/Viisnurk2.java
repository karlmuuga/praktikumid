package pr12;

import java.applet.Applet;
import java.awt.*;

public class Viisnurk2 extends Applet {
    @Override
    public void paint(Graphics g) {
        int x0 = 150; // Keskpunkt
        int y0 = 150;
        int raadius = 100; // Raadius
        int sammudeArv = 5; // Nurkade arv
        int tiirudeArv = 2; // "Tiirude" arv
        double t0 = -Math.PI / 2; // Faas ehk kust alustada
        int x, y, eelmineX = 0, eelmineY = 0;
        double t;
        boolean esimene = true;

        // Kysime laiuse / ko~rguse
        int w = getWidth();
        int h = getHeight();

        // Katame tausta
        g.setColor(Color.white);
        g.fillRect(0, 0, w, h);

        // Joonistame
        g.setColor(Color.black);

        for (t = 1.9; t <= 2 * tiirudeArv * Math.PI+1.9; t = t + 2 * tiirudeArv * Math.PI / sammudeArv) {
            x = (int) (raadius * Math.cos(t + t0) + x0);
            y = (int) (raadius * Math.sin(t + t0) + y0);
            if (esimene) {
                esimene = false;
            }
            else {
                g.drawLine(x, y, eelmineX, eelmineY);
            }
            eelmineX = x;
            eelmineY = y;
        }
        joonistaRing(g);
    }
    
	public void joonistaRing(Graphics g) {
		g.setColor(Color.black);
		int keskkohtX = 150;
		int keskkohtY = 150;
		int raadius = 102;
		for (double nurk = 0; nurk <= Math.PI * 4; nurk = nurk + .03) {
			int x = (int) (raadius * Math.cos(nurk));
			int y = (int) (raadius * Math.sin(nurk));
			g.fillRect(keskkohtX + x, keskkohtY + y, 2, 2);
		}
	}
}