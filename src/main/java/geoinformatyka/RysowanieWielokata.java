package geoinformatyka;

// 9. Napisz fragment kodu programu rysującego wielokąt na ekranie w wybranym środowisku programistycznym

import javax.swing.*;
import java.awt.*;

public class RysowanieWielokata extends JPanel {

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(5f));
        g2.setColor(Color.pink);

        Polygon polygon = new Polygon();
        polygon.addPoint(100, 130);
        polygon.addPoint(210, 50);
        polygon.addPoint(320, 170);
        polygon.addPoint(270, 230);
        polygon.addPoint(150, 230);

        g2.drawPolygon(polygon);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Rysowanie wielokata");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new RysowanieWielokata());
        frame.pack();
        frame.setSize(new Dimension(420, 440));
        frame.setVisible(true);
    }
}