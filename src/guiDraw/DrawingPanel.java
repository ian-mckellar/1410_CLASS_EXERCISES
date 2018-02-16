package guiDraw;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class DrawingPanel extends JPanel {
    private Color[] colors = {Color.RED, Color.ORANGE, Color.YELLOW, Color.BLUE, Color.GREEN};
    private final Random rand = new Random();

    public DrawingPanel() {
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                //toggleColor(g, j);
                g.setColor(getRandomColor());
                g.fillOval(15 * j + 100, 150 * i + 50, 150, 150);
            }
        }
    }

    private Color getRandomColor() {
        int randomIndex = rand.nextInt(colors.length);
        return colors[randomIndex];
    }

    private void toggleColor(Graphics g, int j) {
        if (j % 2 == 0) {
            g.setColor(Color.RED);
        } else {
            g.setColor(Color.ORANGE);
        }
    }

}
