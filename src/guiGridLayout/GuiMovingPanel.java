package guiGridLayout;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class GuiMovingPanel extends JFrame {

	private static final Color TILE_BACKGROUND = new Color(139, 0, 0);
	private static final Color MOVING_BACKGROUND = Color.ORANGE;
	private JPanel contentPane;
	private JButton[] tiles;
	private static int currentIndex = 0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMovingPanel frame = new GuiMovingPanel();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GuiMovingPanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblTitle = createLblTitle();
		contentPane.add(lblTitle, BorderLayout.NORTH);
		
		JPanel controlpPanel = createControlPanel();
		contentPane.add(controlpPanel, BorderLayout.WEST);
		
		
		JPanel displayPanel = createDisplayPanel();	
		contentPane.add(displayPanel, BorderLayout.CENTER);

	
	}

	private JPanel createDisplayPanel() {
		JPanel displayPanel = new JPanel();
		displayPanel.setBorder(new EmptyBorder(8, 0, 8, 8));
		displayPanel.setLayout(new GridLayout(0, 4, 8, 0));
	
		JButton btn1 = new JButton("1");
		initButton(btn1);
		displayPanel.add(btn1);
	
		JButton btn2 = new JButton("2");
		initButton(btn2);
		displayPanel.add(btn2);
		
		JButton btn3 = new JButton("3");
		initButton(btn3);
		displayPanel.add(btn3);
		
		JButton btn4 = new JButton("4");
		initButton(btn4);
		displayPanel.add(btn4);
		
		tiles = new JButton[] {btn1, btn2, btn3, btn4};
		tiles[0].setBackground(MOVING_BACKGROUND);
		
		return displayPanel;
	}

	private void initButton(JButton btn) {
		btn.setBackground(TILE_BACKGROUND);
		btn.setFont(new Font("Ubuntu", Font.BOLD, 44));
		btn.setForeground(new Color(240, 255, 240));
	}

	private JPanel createControlPanel() {
		JPanel controlpPanel = new JPanel();
		controlpPanel.setBorder(new EmptyBorder(8, 8, 8, 8));
		controlpPanel.setLayout(new GridLayout(4, 0, 0, 8));
		
		JButton btnRight = new JButton("==>");
		btnRight.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				int nextIndex = (currentIndex + 1) % tiles.length;
				tiles[currentIndex].setBackground(TILE_BACKGROUND);
				tiles[nextIndex].setBackground(MOVING_BACKGROUND);
				currentIndex = nextIndex;
			}
		});
		controlpPanel.add(btnRight);
	
		JButton btnLeft = new JButton("<==");
		btnLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int previousIndex = currentIndex;
				if (currentIndex == 0) {
					previousIndex = tiles.length - 1;
				} else {
					previousIndex = currentIndex - 1;
				}
				tiles[currentIndex].setBackground(TILE_BACKGROUND);
				tiles[previousIndex].setBackground(MOVING_BACKGROUND);
				currentIndex = previousIndex;
			}
		});
		btnLeft.setHorizontalAlignment(SwingConstants.TRAILING);
		controlpPanel.add(btnLeft);
		
		return controlpPanel;
	}

	private JLabel createLblTitle() {
		JLabel lblTitle = new JLabel("Demo Layout");
		lblTitle.setBorder(new EmptyBorder(12, 0, 12, 0));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setOpaque(true);
		lblTitle.setBackground(new Color(46, 139, 87));
		lblTitle.setForeground(new Color(240, 255, 240));
		lblTitle.setFont(new Font("Ubuntu", Font.BOLD, 26));
		return lblTitle;
	}

}
