import java.awt.*;
import javax.swing.*;

/**
 * 
 */

public class TextFrame {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}

	// http://forum.codecall.net/topic/49721-simple-text-editor/
	public static void createAndShowGUI() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		TextPanel textPanel = new TextPanel();
		MenuPanel menuPanel = new MenuPanel(textPanel);
		JFrame frame = new JFrame();
		frame.setJMenuBar(menuPanel.getMenuBar());
		frame.add(textPanel, BorderLayout.CENTER);
		frame.setSize(800, 600);
		frame.setTitle(menuPanel.getTitle());
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
	}
}