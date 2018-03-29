package guiDialog;

import javax.swing.JOptionPane;

public class DemoDialog {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Hello world");
		
		String name = JOptionPane.showInputDialog("Whats your name?");
		System.out.println("The user's name is " + name);
		
		
	}
}
