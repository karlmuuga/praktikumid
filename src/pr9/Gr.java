package pr9;

import java.awt.BorderLayout;

import javax.swing.*;

public class Gr {

    public Gr() {
        JFrame frame = new JFrame();
        JPanel window = new JPanel();

        frame.setSize(600, 400); // Width: 600, Height: 400.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(window);

        window.setLayout(new BorderLayout());

        // Perform graphics drawing.

        frame.revalidate();
        frame.repaint();
    }

    public static void main(String[] args) {
        new Gr();
    }

}