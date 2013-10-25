import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JMenuBar;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;

public class MenuPanel extends JPanel {
	TextPanel textPanel;
	JMenuBar menuBar;
	JFileChooser fileChooser;

	public MenuPanel(TextPanel textPanel) {
		this.textPanel = textPanel;
		fileChooser = new JFileChooser();
		add(menuBar = new JMenuBar());
		JButton button = new JButton("Open File...");
		button.addActionListener(new TextChooser());

		add(button);
	}

	private class TextChooser implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (fileChooser.showOpenDialog(textPanel) == JFileChooser.APPROVE_OPTION) {
				File file = fileChooser.getSelectedFile();
			}
		}
	}

}
