package guiIntro;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class LabIntroToGui extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JLabel lblMain;
	private JLabel lblTitle;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LabIntroToGui frame = new LabIntroToGui();
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
	public LabIntroToGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		lblTitle = createLblTitle();
		contentPane.add(lblTitle, BorderLayout.NORTH);
		
		JButton btnCount = createBtnCount();
		contentPane.add(btnCount, BorderLayout.WEST);
		
		lblMain = createLblMain();
		contentPane.add(lblMain, BorderLayout.CENTER);
		
		JPanel namePanel = createNamePanel();
		contentPane.add(namePanel, BorderLayout.SOUTH);
		
		JButton btnToggle = createBtnToggle();
		contentPane.add(btnToggle, BorderLayout.EAST);
			
	}

	private JButton createBtnToggle() {
		JButton btnToggle = new JButton("Toggle");
		btnToggle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Color backgroundColor = lblMain.getBackground();
				Color foregrounfColor = lblMain.getForeground();
				
				lblMain.setForeground(backgroundColor);
				lblMain.setBackground(foregrounfColor);
			}
		});
		btnToggle.setFont(new Font("Ubuntu", Font.BOLD, 25));
		btnToggle.setForeground(new Color(240, 255, 240));
		btnToggle.setBackground(new Color(128, 128, 0));
		return btnToggle;
	}

	private JPanel createNamePanel() {
		JPanel namePanel = new JPanel();
		namePanel.setBackground(new Color(25, 25, 112));
		namePanel.setBorder(new EmptyBorder(10, 0, 10, 0));

		JLabel lblName = new JLabel("Name");
		lblName.setForeground(new Color(240, 255, 240));
		lblName.setFont(new Font("Dialog", Font.BOLD, 16));
		namePanel.add(lblName);
	
		txtName = new JTextField();
		txtName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTitle.setText(txtName.getText() + "'s GUI");
			}
		});
		txtName.setBackground(new Color(240, 255, 240));
		txtName.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtName.setColumns(10);
		namePanel.add(txtName);
	
		return namePanel;
	}

	

	private JLabel createLblMain() {
		JLabel lblMain = new JLabel("Main");
		lblMain.setHorizontalAlignment(SwingConstants.CENTER);
		lblMain.setForeground(new Color(139, 69, 19));
		lblMain.setFont(new Font("Purisa", Font.BOLD, 65));
		lblMain.setOpaque(true);
		lblMain.setBackground(new Color(255, 215, 0));
		return lblMain;
	}

	private JButton createBtnCount() {
		JButton btnCount = new JButton("+10");
		
		btnCount.addActionListener(new ActionListener() {
			private int addTen = 0; // Field in my anonymous inner class
			public void actionPerformed(ActionEvent e) {	
				addTen += 10;
				lblMain.setText(String.valueOf(addTen));
			}
		});
		
		btnCount.setForeground(new Color(240, 255, 240));
		btnCount.setFont(new Font("Dialog", Font.BOLD, 25));
		btnCount.setBackground(new Color(255, 99, 71));
		return btnCount;
	}

	private JLabel createLblTitle() {
		JLabel lblTitle = new JLabel("Title");
		lblTitle.setIcon(new ImageIcon(LabIntroToGui.class.getResource("/guiIntro/resources/185835.png")));
		lblTitle.setForeground(new Color(240, 255, 240));
		lblTitle.setOpaque(true);
		lblTitle.setBackground(new Color(25, 25, 112));
		lblTitle.setBorder(new EmptyBorder(10, 0, 10, 0));
		lblTitle.setFont(new Font("Dialog", Font.BOLD, 25));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		return lblTitle;
	}
}
