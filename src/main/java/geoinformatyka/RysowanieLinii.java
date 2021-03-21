package geoinformatyka;

import java.awt.*;
import java.awt.geom.Line2D;
import javax.swing.*;


// 8. Napisz fragment kodu programu rysującego linię łamaną na ekranie w wybranym środowisku programistycznym.

public class RysowanieLinii extends JPanel {

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(5f));
        g2.setColor(Color.red);
        g2.draw(new Line2D.Double(50,130,310,250));

        g2.setColor(Color.green);
        g2.draw(new Line2D.Double(0, 0, 400, 400));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Rysowanie linii");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new RysowanieLinii());
        frame.pack();
        frame.setSize(new Dimension(420, 440));
        frame.setVisible(true);
    }
}