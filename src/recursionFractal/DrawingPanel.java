package recursionFractal;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class DrawingPanel extends JPanel {
	private final Color[] colors = {Color.RED, Color.ORANGE};
	
	
    public DrawingPanel() {
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        //g.fillRect(0, 0, 512, 512);
        fractal(g, 6, 0, 0, 512);
    }

	private void fractal(Graphics g, int level, int x, int y, int size) {
		int newSize = size / 2;
		int midX = x + newSize;
		int midY = y + newSize;
		
		
		
		if (level == 1) {
			g.fillRect(midX, midY, newSize, newSize);
			g.fillRect(midX, y, newSize, newSize);
			g.fillRect(x, y, newSize, newSize);
		} else {
			fractal(g, level - 1, x, y, newSize);
			fractal(g, level - 1, midX, y, newSize);
			fractal(g, level - 1, midX, midY, newSize);

		}
	}

}
